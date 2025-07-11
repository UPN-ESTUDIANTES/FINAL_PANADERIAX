package COMPRAS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import CONEXIÓN.ConexiónMySQL;

public class ArrayComprasProductos {

    public ArrayList<ComprasProductos> Listar() {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_COM_PRO()}");
            ResultSet rs = csta.executeQuery();
            ComprasProductos com;
            while (rs.next()) {
                com = new ComprasProductos(
                    rs.getString(1), // ID_COMPRA
                    rs.getString(2), // ID_PROVEEDOR
                    rs.getString(3), // ID_EMPLEADO
                    rs.getString(4), // NOMBRE_PRO
                    rs.getString(5), // Fecha_COM_PRO
                    rs.getInt(6),    // Cantidad_COM_PRO
                    rs.getDouble(7), // PrecioC_COM_PRO
                    rs.getDouble(8)  // Total_COM_PRO
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return lista;
    }

    public ArrayList<ComprasProductos> Consultar(String cod) {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            Statement st = ConexiónMySQL.getConexión().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM COMPRA_PRODUCTOS WHERE ID_COMPRA LIKE '%" + cod + "%'");
            ComprasProductos com;
            while (rs.next()) {
                com = new ComprasProductos(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6),
                    rs.getDouble(7),
                    rs.getDouble(8)
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return lista;
    }

    public ArrayList<ComprasProductos> ConsultarPorID(String id) {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_COM_PRO(?)}");
            csta.setString(1, id);
            ResultSet rs = csta.executeQuery();
            ComprasProductos com;
            while (rs.next()) {
                com = new ComprasProductos(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6),
                    rs.getDouble(7),
                    rs.getDouble(8)
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        return lista;
    }

    public void Insertar(ComprasProductos c) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Insertar_COM_PRO(?,?,?,?,?,?,?)}");
            csta.setString(1, c.getID_COMPRA());
            csta.setString(2, c.getID_PROVEEDOR());
            csta.setString(3, c.getID_EMPLEADO());
            csta.setString(4, c.getNOMBRE_PRO());
            csta.setInt(5, c.getCantidad_COM_PRO());
            csta.setDouble(6, c.getPrecioC_COM_PRO());
            csta.setDouble(7, c.getTotal_COM());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    public void Eliminar(String id) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_COM_PRO(?)}");
            csta.setString(1, id);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }

    public void Editar(ComprasProductos c) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_Editar_COM_PRO(?,?,?,?,?,?,?)}");
            csta.setString(1, c.getID_COMPRA());
            csta.setString(2, c.getID_PROVEEDOR());
            csta.setString(3, c.getID_EMPLEADO());
            csta.setString(4, c.getNOMBRE_PRO());
            csta.setInt(5, c.getCantidad_COM_PRO());
            csta.setDouble(6, c.getPrecioC_COM_PRO());
            csta.setDouble(7, c.getTotal_COM());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
    
    public ArrayList<ComprasProductos> ConsultarPorNombreProducto(String nombre) {
        ArrayList<ComprasProductos> lista = new ArrayList<>();
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM COMPRA_PRODUCTOS WHERE NOMBRE_PRO LIKE ?");
            pst.setString(1, "%" + nombre + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ComprasProductos com = new ComprasProductos(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getInt(6),
                    rs.getDouble(7),
                    rs.getDouble(8)
                );
                lista.add(com);
            }
        } catch (Exception e) {
            System.out.println("ERROR al buscar por nombre producto: " + e);
        }
        return lista;
    }
    
    public String generarNuevoIDCompra() {
        String nuevoID = "CP01";
        String sql = "SELECT MAX(ID_COMPRA) FROM COMPRA_PRODUCTOS WHERE ID_COMPRA LIKE 'CP%'";
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            Statement stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String ultimoID = rs.getString(1); // CP07
                if (ultimoID != null) {
                    int num = Integer.parseInt(ultimoID.substring(2));
                    num++;
                    nuevoID = String.format("CP%02d", num);
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("ERROR al generar nuevo ID de compra: " + e);
        }
        return nuevoID;
    }
}