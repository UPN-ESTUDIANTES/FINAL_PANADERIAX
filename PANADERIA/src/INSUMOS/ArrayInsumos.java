package INSUMOS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;

public class ArrayInsumos {

    // LISTAR INSUMOS
    public ArrayList<Insumos> listarInsumos() {
        ArrayList<Insumos> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_INS()}");
            ResultSet rs = csta.executeQuery();
            Insumos ins;
            while (rs.next()) {
                ins = new Insumos(
                    rs.getString(1), // ID_INSUMO
                    rs.getString(2), // Nombre_INS
                    rs.getString(3), // Descripcion_INS
                    rs.getInt(4)     // Stock_INS
                );
                lista.add(ins);
            }
        } catch (Exception e) {
            System.out.println("ERROR al listar insumos: " + e);
        }
        return lista;
    }

    // CONSULTAR INSUMO POR NOMBRE
    public ArrayList<Insumos> ConsultarPorNombre(String nombre) {
        ArrayList<Insumos> lista = new ArrayList<>();
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_ConsultarNOMBRE_INS(?)}");
            csta.setString(1, nombre);
            ResultSet rs = csta.executeQuery();
            Insumos ins;
            while (rs.next()) {
                ins = new Insumos(
                    rs.getString(1), 
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getInt(4)
                );
                lista.add(ins);
            }
        } catch (Exception e) {
            System.out.println("ERROR al consultar insumo por nombre: " + e);
        }
        return lista;
    }

    // INSERTAR INSUMO
    public void insertar(Insumos ins) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Insertar_INS(?,?,?,?)}");
            csta.setString(1, ins.getID_INSUMO());
            csta.setString(2, ins.getNombre_INS());
            csta.setString(3, ins.getDescripcion_INS());
            csta.setInt(4, ins.getStock_INS());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al insertar insumo: " + e);
        }
    }

    // ELIMINAR INSUMO POR NOMBRE
    public void eliminarPorNombre(String nombre) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_INS(?)}");
            csta.setString(1, nombre);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al eliminar insumo: " + e);
        }
    }

    // EDITAR INSUMO
    public void editar(Insumos ins) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Editar_INS(?,?,?,?)}");
            csta.setString(1, ins.getID_INSUMO());
            csta.setString(2, ins.getNombre_INS());
            csta.setString(3, ins.getDescripcion_INS());
            csta.setInt(4, ins.getStock_INS());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al editar insumo: " + e);
        }
    }

    // ACTUALIZAR STOCK
    public void actualizarStock(String idInsumo, int cantidad) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_ActualizarStock_INS(?,?)}");
            csta.setString(1, idInsumo);
            csta.setInt(2, cantidad);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR al actualizar stock: " + e);
        }
    }

    // GENERAR NUEVO ID DE INSUMO
    public String generarNuevoIDInsumo() {
        String nuevoID = "I01";
        String sql = "SELECT MAX(ID_INSUMO) FROM INSUMOS WHERE ID_INSUMO LIKE 'I%'";

        try {
            Connection cnx = ConexiónMySQL.getConexión();
            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                String ultimoID = rs.getString(1); 
                if (ultimoID != null) {
                    int num = Integer.parseInt(ultimoID.substring(1));
                    num++;
                    nuevoID = String.format("I%02d", num);
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("ERROR al generar ID insumo: " + e);
        }

        return nuevoID;
    }
}