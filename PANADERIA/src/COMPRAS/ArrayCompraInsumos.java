package COMPRAS;

import java.sql.*;
import java.util.ArrayList;
import CONEXIÓN.ConexiónMySQL;

public class ArrayCompraInsumos {
    public ArrayList<ComprasInsumos> listar() {
        ArrayList<ComprasInsumos> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_COM_INS()}");
            ResultSet rs = csta.executeQuery();
            ComprasInsumos compra;
            while (rs.next()) {
                compra = new ComprasInsumos(
                    rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getDouble(7), rs.getDouble(8)
                );
                lista.add(compra);
            }
        } catch (Exception e) {
            System.out.println("ERROR al listar compras insumos: " + e);
        }
        return lista;
    }

    public ArrayList<ComprasInsumos> consultarPorID(String id) {
        ArrayList<ComprasInsumos> lista = new ArrayList<>();
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_COM_INS(?)}");
            csta.setString(1, id);
            ResultSet rs = csta.executeQuery();
            ComprasInsumos compra;
            while (rs.next()) {
                compra = new ComprasInsumos(
                    rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getInt(6), rs.getDouble(7), rs.getDouble(8)
                );
                lista.add(compra);
            }
        } catch (Exception e) {
            System.out.println("ERROR al consultar compra por ID: " + e);
        }
        return lista;
    }

    public void insertar(ComprasInsumos compra) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Insertar_COM_INS(?,?,?,?,?,?,?)}");
            csta.setString(1, compra.getID_COMPRA());
            csta.setString(2, compra.getID_PROVEEDOR());
            csta.setString(3, compra.getID_EMPLEADO());
            csta.setString(4, compra.getNOMBRE_INS());
            csta.setInt(5, compra.getCANTIDAD_COM_INS());
            csta.setDouble(6, compra.getPRECIOC_COM_INS());
            csta.setDouble(7, compra.getTOTAL_COM_INS());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al insertar compra insumo: " + e);
        }
    }

    public void eliminar(String id) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_COM_INS(?)}");
            csta.setString(1, id);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al eliminar compra insumo: " + e);
        }
    }

    public void editar(ComprasInsumos compra) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Editar_COM_INS(?,?,?,?,?,?,?)}");
            csta.setString(1, compra.getID_COMPRA());
            csta.setString(2, compra.getID_PROVEEDOR());
            csta.setString(3, compra.getID_EMPLEADO());
            csta.setString(4, compra.getNOMBRE_INS());
            csta.setInt(5, compra.getCANTIDAD_COM_INS());
            csta.setDouble(6, compra.getPRECIOC_COM_INS());
            csta.setDouble(7, compra.getTOTAL_COM_INS());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al editar compra insumo: " + e);
        }
    }

    public String generarNuevoIDCompra() {
        String nuevoID = "CI01";
        String sql = "SELECT MAX(ID_COMPRA) FROM COMPRA_INSUMOS WHERE ID_COMPRA LIKE 'CI%'";

        try {
            Connection cnx = ConexiónMySQL.getConexión();
            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String ultimoID = rs.getString(1);
                if (ultimoID != null) {
                    int num = Integer.parseInt(ultimoID.substring(2));
                    num++;
                    nuevoID = String.format("CI%02d", num);
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("ERROR al generar ID compra insumo: " + e);
        }

        return nuevoID;
    }
}
