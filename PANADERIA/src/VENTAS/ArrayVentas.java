package VENTAS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArrayVentas {
public ArrayList<Ventas> ListarVentas() {
    ArrayList<Ventas> lista = new ArrayList<Ventas>();
	try {
		CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_VEN()}");
		ResultSet rs = csta.executeQuery();
		Ventas ven;
		while (rs.next()) {
			ven = new Ventas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4).toLocalDateTime(), rs.getDouble(5));
			lista.add(ven);
		}
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
	return lista;
}
public ArrayList<Ventas> ConsultarVentas(String cod) {
	ArrayList<Ventas> lista = new ArrayList<Ventas>();
	try {
		Statement sta = ConexiónMySQL.getConexión().createStatement();
		ResultSet rs = sta.executeQuery("select * from VENTAS where ID_VENTA like '%" + cod + "%'");
		Ventas ven;
		while (rs.next()) {
			ven = new Ventas(rs.getString(1), rs.getString(2), rs.getString(3),rs.getTimestamp(4).toLocalDateTime(), rs.getDouble(5));
			lista.add(ven);
		}
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
	return lista;
}
public ArrayList<Ventas> ConsultarVentasID(String id) {
	ArrayList<Ventas> lista = new ArrayList<Ventas>();
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_VEN(?)}");
		csta.setString(1, id);
		ResultSet rs = csta.executeQuery();
		Ventas ven;
		while (rs.next()) {
			ven = new Ventas(rs.getString(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4).toLocalDateTime(), rs.getDouble(5));
			lista.add(ven);
		}
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
	return lista;
}
public void Insertar(Ventas ven) {
	try 
	{
		Connection cnx = ConexiónMySQL.getConexión();
        CallableStatement csta = cnx.prepareCall("{call SP_Insertar_VEN(?,?,?,?,?)}");

        csta.setString(1, ven.getID_VENTA());
        csta.setString(2, ven.getID_CLIENTE());
        csta.setString(3, ven.getID_EMPLEADO());
        Timestamp fechaSQL = Timestamp.valueOf(ven.getFecha_VENTA());          // Conversión de LocalDateTime a Timestamp
        csta.setTimestamp(4, fechaSQL); 
        csta.setDouble(5, ven.getCantTotal());
        csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR " + e);
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
public void Editar(Ventas ven) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Editar_VEN(?,?,?,?,?)}");
		csta.setString(1, ven.getID_VENTA());
		csta.setString(2, ven.getID_CLIENTE());
        csta.setString(3, ven.getID_EMPLEADO());
		Timestamp fechaSQL = Timestamp.valueOf(ven.getFecha_VENTA());          // Conversión de LocalDateTime a Timestamp
	    csta.setTimestamp(4, fechaSQL);
		csta.setDouble(5, ven.getCantTotal());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR " + e);
	}
}
}
