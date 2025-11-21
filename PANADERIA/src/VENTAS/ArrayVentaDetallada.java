package VENTAS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import CONEXIÓN.ConexiónMySQL;

public class ArrayVentaDetallada 
{
	public ArrayList<VentaDetallada> ListarVentas()
	{
		ArrayList<VentaDetallada> lista = new ArrayList<VentaDetallada>();
		try {
			CallableStatement  csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_VENTA_DETALLADA()}");
			ResultSet rs = csta.executeQuery();
			while(rs.next()) 
			{
                String idVenta = rs.getString("ID_VENTA");
                String idEmpleado = rs.getString("ID_EMPLEADO");
                String idCliente = rs.getString("ID_CLIENTE");
                LocalDateTime fecha = rs.getTimestamp("Fecha_VEN").toLocalDateTime();
                String producto = rs.getString("PRODUCTO");
                int cantidad = rs.getInt("CANTIDAD");
                double precioUnitario = rs.getDouble("PRECIO_UNITARIO");
                double subtotal = rs.getDouble("SUBTOTAL");

                VentaDetallada vd = new VentaDetallada(idVenta, idEmpleado, idCliente, fecha, producto, cantidad, precioUnitario, subtotal);
                lista.add(vd);
			}
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
		return lista;
	}
	
    public ArrayList<VentaDetallada> ConsultarDetallesVentas(String cod) {
    	ArrayList<VentaDetallada> lista = new ArrayList<VentaDetallada>();
    	try {
    		Statement sta = ConexiónMySQL.getConexión().createStatement();
    		ResultSet rs = sta.executeQuery("SELECT * FROM VENTA_DETALLADA WHERE ID_VENTA LIKE '%" + cod + "%'");
    		while (rs.next()) {
    		VentaDetallada vd = new VentaDetallada
    					(
    				    rs.getString("ID_VENTA"),
    				    rs.getString("ID_EMPLEADO"),
    				    rs.getString("ID_CLIENTE"),
    				    rs.getTimestamp("Fecha_VEN").toLocalDateTime(),
    				    rs.getString("ID_PRODUCTO"),    // o el nombre exacto de la columna
    				    rs.getInt("CANTIDAD"),
    				    rs.getDouble("PRECIO_UNITARIO"),
    				    rs.getDouble("SUBTOTAL")
    				);
    			lista.add(vd);
    		}
    	} catch (Exception e) {
    		System.out.println("ERROR " + e);
    	}
    	return lista;
    }
    
    public ArrayList<VentaDetallada> ConsultarDetallesVentaID(String id) {
        ArrayList<VentaDetallada> lista = new ArrayList<>();
        try {
            Connection cnx = ConexiónMySQL.getConexión();
            CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_DET_VEN(?)}");
            csta.setString(1, id);
            ResultSet rs = csta.executeQuery();
            
            while (rs.next()) {
            VentaDetallada vd = new VentaDetallada
            		(
                    rs.getString("ID_VENTA"),
                    rs.getString("ID_EMPLEADO"),
                    rs.getString("ID_CLIENTE"),
                    rs.getTimestamp("Fecha_VEN").toLocalDateTime(),
                    rs.getString("ID_PRODUCTO"),
                    rs.getInt("CANTIDAD"),
                    rs.getDouble("PRECIO_UNITARIO"),
                    rs.getDouble("SUBTOTAL")
                );
                lista.add(vd);
            }
        } catch (Exception e) {
            System.out.println("ERROR " + e);
        }
        return lista;
    }

    
    public void Insertar(VentaDetallada ven) {
        try {
            Connection cnx = ConexiónMySQL.getConexión();

            // 🔍 Verificar si el producto existe
            String sqlVerifica = "SELECT COUNT(*) FROM PRODUCTOS WHERE ID_PRODUCTO = ?";
            PreparedStatement ps = cnx.prepareStatement(sqlVerifica);
            ps.setString(1, ven.getProducto());
            ResultSet rs = ps.executeQuery();
            rs.next();

            if (rs.getInt(1) == 0) {
                System.out.println("❌ ERROR: El producto con ID '" + ven.getProducto() + "' no existe. No se puede insertar la venta.");
                JOptionPane.showMessageDialog(null, "El producto con ID '" + ven.getProducto() + "' no existe en la base de datos.");
                rs.close();
                ps.close();
                cnx.close();
                return;
            }

            rs.close();
            ps.close();

            // ✅ Procede a insertar si el producto es válido
            CallableStatement csta = cnx.prepareCall("{call SP_Insertar_VENTA_DETALLADA(?, ?, ?, ?, ?, ?, ?, ?)}");
            csta.setString(1, ven.getIdVenta());
            csta.setString(2, ven.getIdCliente());
            csta.setString(3, ven.getIdEmpleado());
            csta.setTimestamp(4, Timestamp.valueOf(ven.getFecha()));
            csta.setString(5, ven.getProducto()); // ID_PRODUCTO válido
            csta.setInt(6, ven.getCantidad());
            csta.setDouble(7, ven.getPrecioUnitario());
            csta.setDouble(8, ven.getSubtotal());

            csta.executeUpdate();
            csta.close();
            cnx.close();

        } catch (Exception e) {
            System.out.println("ERROR en insertar: " + e);
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
        }
    }

    
    public void Eliminar(String id) {
    	try {
    		Connection cnx = ConexiónMySQL.getConexión();
    		CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_VEN(?)}");
    		csta.setString(1, id);
    		csta.executeUpdate();
    	} catch (Exception e) {
    		System.out.println("ERROR " + e);
    	}
    }
    
    

}
