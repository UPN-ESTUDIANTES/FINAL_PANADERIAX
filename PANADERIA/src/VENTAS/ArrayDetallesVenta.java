package VENTAS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;

public class ArrayDetallesVenta {
public ArrayList<Detalles_Venta> ListarDetallesVenta() {
	ArrayList<Detalles_Venta> lista = new ArrayList<Detalles_Venta>();
	try {
		CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_DET_VEN()}");
		ResultSet rs = csta.executeQuery();
		Detalles_Venta det;
		while (rs.next()) {
			det = new Detalles_Venta(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
			lista.add(det);
		}
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
	return lista;
}
public ArrayList<Detalles_Venta> ConsultarDetallesVenta(String cod) {
	ArrayList<Detalles_Venta> lista = new ArrayList<Detalles_Venta>();
	try {
		Statement sta = ConexiónMySQL.getConexión().createStatement();
		ResultSet rs = sta.executeQuery("select * from DETALLES_VENTA where ID_DET_VEN like '%" + cod + "%'");
		Detalles_Venta det;
		while (rs.next()) {
			det = new Detalles_Venta(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
			lista.add(det);
		}
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
	return lista;
}

public ArrayList<Detalles_Venta> ConsultarDetallesVentaID(String id) {
	ArrayList<Detalles_Venta> lista = new ArrayList<Detalles_Venta>();
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_DET_VEN(?)}");
		csta.setString(1, id);
		ResultSet rs = csta.executeQuery();
		Detalles_Venta det;
		while (rs.next()) {
			det = new Detalles_Venta(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
			lista.add(det);
		}
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
	return lista;
}

public void Insertar(Detalles_Venta det) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Insertar_DET_VEN(?,?,?,?)}");
		csta.setString(1, det.getID_VENTA());
		csta.setString(2, det.getID_PRODUCTO());
		csta.setInt(3, det.getCantidad());
		csta.setDouble(4, det.getPrecioVenta());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
}
public void Eliminar(String id) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_DET_VEN(?)}");
		csta.setString(1, id);
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
}
public void Editar(Detalles_Venta det) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Editar_DET_VEN(?,?,?,?)}");
		csta.setString(1, det.getID_VENTA());
		csta.setString(2, det.getID_PRODUCTO());
		csta.setInt(3, det.getCantidad());
		csta.setDouble(4, det.getPrecioVenta());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
}
}
