package PRODUCTOS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;

public class ArrayProductos 
{
	public ArrayList<Productos> listarProductos()
		{
			ArrayList<Productos> lista = new ArrayList<Productos>();
			try {
				CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_PRO()}");
				ResultSet rs = csta.executeQuery();
				Productos produc;
				while (rs.next()) 
				{
					produc = new Productos(rs.getString(1),rs.getString(2), rs.getString(3),rs.getDouble(4),rs.getInt(5));
					lista.add(produc);
				}
			} catch (Exception e) {
			}
			return lista;		
	}
	public ArrayList<Productos> consultarProductos(String nom){
		ArrayList<Productos> lista=new ArrayList<Productos>();
		try {
			java.sql.Statement sta=ConexiónMySQL.getConexión().createStatement();
			ResultSet rs=sta.executeQuery("select * from PRODUCTOS where Nombre_PRO like '%"+nom+"%'");
			Productos produc;
			while (rs.next()) {
				produc = new Productos(rs.getString(1),rs.getString(2), rs.getString(3),rs.getDouble(4),rs.getInt(5));
				lista.add(produc);
			}
		} catch (Exception e) {
		}
		return lista;
	}
	public ArrayList<Productos> ConsultarPorNombre(String nombre) {
	    ArrayList<Productos> lista = new ArrayList<Productos>();
	    try {
	        Connection cnx = ConexiónMySQL.getConexión();
	        CallableStatement csta = cnx.prepareCall("{call SP_ConsultarNOMBRE_PRO(?)}");
	        csta.setString(1, nombre);
	        ResultSet rs = csta.executeQuery();
	        Productos produc;
	        while (rs.next()) {
	            produc = new Productos(
	                rs.getString(1), // ID_PRODUCTO
	                rs.getString(2), // Nombre_PRO
	                rs.getString(3), // Descripcion_PRO
	                rs.getDouble(4), // Precio_venta
	                rs.getInt(5)     // Stock_PRO
	            );
	            lista.add(produc);
	        }
	    } catch (Exception e) {
	        System.out.println("ERROR: " + e);
	    }
	    return lista;
	}
	public void insertar(Productos produc) 
	{
		try {
			Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement csta=cnx.prepareCall("{call SP_Insertar_PRO(?,?,?,?,?)}");
			csta.setString(1, produc.getID_PRODUCTO());
			csta.setString(2, produc.getNombre_PRO());
			csta.setString(3, produc.getDescripción_PRO());
			csta.setDouble(4, produc.getPrecio_venta());
			csta.setInt(5, produc.getStock_PRO());
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR"+e);
		}
	}
	
	public void eliminarPorNombre(String nombre) {
	    try {
	        Connection cnx = ConexiónMySQL.getConexión();
	        CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_PRO(?)}");
	        csta.setString(1, nombre);
	        csta.executeUpdate();
	    } catch (Exception e) {
	        System.out.println("ERROR al eliminar producto por nombre: " + e);
	    }
	}
	
	
	public void editar(Productos produc) {
		try {
			Connection cnx=ConexiónMySQL.getConexión();
			CallableStatement csta=cnx.prepareCall("{call SP_Editar_PRO(?,?,?,?,?)}");
			csta.setString(1, produc.getID_PRODUCTO());
			csta.setString(2, produc.getNombre_PRO());
			csta.setString(3, produc.getDescripción_PRO());
			csta.setDouble(4, produc.getPrecio_venta());
			csta.setInt(5, produc.getStock_PRO());
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR"+e);
		}
	}
	public void ActualizarStock(String idProducto, int cantidad) {
	    try {
	        Connection cnx = ConexiónMySQL.getConexión();
	        CallableStatement csta = cnx.prepareCall("{call SP_ActualizarStock_PRO(?,?)}");
	        csta.setString(1, idProducto);
	        csta.setInt(2, cantidad);
	        csta.executeUpdate();
	    } catch (Exception e) {
	        System.out.println("ERROR al actualizar stock: " + e);
	    }
	}
	public void ActualizarPrecioVenta(String idProducto, double nuevoPrecio) {
	    try {
	        Connection cnx = ConexiónMySQL.getConexión();
	        CallableStatement csta = cnx.prepareCall("{call SP_Actualizar_PrecioVenta(?, ?)}");
	        csta.setString(1, idProducto);
	        csta.setDouble(2, nuevoPrecio);
	        csta.executeUpdate();
	    } catch (Exception e) {
	        System.out.println("ERROR al actualizar precio venta: " + e);
	    }
	}
	public String generarNuevoIDProducto() {
		String nuevoID = "A01";
	    String sql = "SELECT MAX(ID_PRODUCTO) FROM PRODUCTOS WHERE ID_PRODUCTO LIKE 'A%'";

	    try {
	        Connection cnx = ConexiónMySQL.getConexión();
	        Statement stmt = cnx.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);

	        if (rs.next()) {
	            String ultimoID = rs.getString(1); // A05
	            if (ultimoID != null) {
	                int num = Integer.parseInt(ultimoID.substring(1));
	                num++;
	                nuevoID = String.format("A%02d", num); // A06
	            }
	        }
	        rs.close();
	        stmt.close();
	    } catch (Exception e) {
	        System.out.println("ERROR al generar ID producto: " + e);
	    }

	    return nuevoID;
	}
}
