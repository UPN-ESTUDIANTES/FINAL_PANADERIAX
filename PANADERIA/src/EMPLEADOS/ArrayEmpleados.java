package EMPLEADOS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;

public class ArrayEmpleados {
public ArrayList<Empleados> ListarEmpleados(){
	ArrayList<Empleados> lista = new ArrayList<Empleados>();
	try {
		CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_EMP()}");
		ResultSet rs = csta.executeQuery();
		Empleados emp;
		while(rs.next()) {
			emp = new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) , rs.getDouble(5), rs.getString(6));
			lista.add(emp);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public ArrayList<Empleados> ConsultarEmpleados(String nom){
	ArrayList<Empleados> lista = new ArrayList<Empleados>();
	try {
		Statement sta = ConexiónMySQL.getConexión().createStatement();
		ResultSet rs = sta.executeQuery("Select * from EMPLEADOS where ID_EMPLEADO like '%"+ nom +"%'");
		Empleados emp;
		while(rs.next()) {
			emp = new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) , rs.getDouble(5), rs.getString(6));
			lista.add(emp);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public ArrayList<Empleados> ConsultarEmpleadosID(String id){
	ArrayList<Empleados> lista = new ArrayList<Empleados>();
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_EMP(?)}");
		csta.setString(1, id);
		ResultSet rs = csta.executeQuery();
		Empleados emp;
		while(rs.next()) {
			emp = new Empleados(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4) , rs.getDouble(5), rs.getString(6));
			lista.add(emp);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public void Insertar(Empleados emp) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Insertar_EMP(?,?,?,?,?,?)}");
		csta.setString(1, emp.getID_EMPLEADO());
		csta.setString(2, emp.getNombre_EMP());
		csta.setString(3, emp.getApellido_EMP());
		csta.setString(4, emp.getCargo_EMP());
		csta.setDouble(5, emp.getSalario());
		csta.setString(6, emp.getAfiliacion());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
public void Eliminar(String id) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Eliminar_EMP(?)}");
		csta.setInt(1, Integer.parseInt(id));
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR: " + e.getMessage());
	}
}

public void Editar(Empleados emp) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Editar_EMP(?,?,?,?,?,?)}");
		csta.setString(1, emp.getID_EMPLEADO());
		csta.setString(2, emp.getNombre_EMP());
		csta.setString(3, emp.getApellido_EMP());
		csta.setString(4, emp.getCargo_EMP());
		csta.setDouble(5, emp.getSalario());
		csta.setString(6, emp.getAfiliacion());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
}
