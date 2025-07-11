package CLIENTES;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;

public class ArrayClientes 
{
public ArrayList<Clientes> ListarClientes(){
	ArrayList<Clientes> lista = new ArrayList<Clientes>();
	try {
		CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_CLI()}");
		ResultSet rs = csta.executeQuery();
		Clientes cli;
		while(rs.next()) {
			cli = new Clientes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			lista.add(cli);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
	}
public ArrayList<Clientes> ConsultarClientes(String nom){
	ArrayList<Clientes> lista = new ArrayList<Clientes>();
	try {
		Statement sta = ConexiónMySQL.getConexión().createStatement();
		ResultSet rs = sta.executeQuery("Select * from CLIENTES where ID_CLIENTE like '%"+ nom +"%'");
		Clientes cli;
		while(rs.next()) {
			cli = new Clientes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			lista.add(cli);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public ArrayList<Clientes> ConsultarClientesID(String id){
	ArrayList<Clientes> lista = new ArrayList<Clientes>();
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_CLI(?)}");
		csta.setString(1, id);
		ResultSet rs = csta.executeQuery();
		Clientes cli;
		while(rs.next()) {
			cli = new Clientes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			lista.add(cli);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public void Insertar(Clientes cli) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Insertar_CLI(?,?,?,?,?)}");
		csta.setString(1, cli.getID_CLIENTE());
		csta.setString(2, cli.getNombre_CLI());
		csta.setString(3, cli.getTelefono_CLI());
		csta.setString(4, cli.getDireccion_CLI());
		csta.setString(5, cli.getEmail_CLI());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
public void Eliminar(String id) {
	try {
		Connection cnx= ConexiónMySQL.getConexión();
		CallableStatement csta=cnx.prepareCall("{call SP_Eliminar_CLI(?)}");
		csta.setString(1, id);
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
public void Editar(Clientes cli) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Editar_CLI(?,?,?,?,?)}");
		csta.setString(1, cli.getID_CLIENTE());
		csta.setString(2, cli.getNombre_CLI());
		csta.setString(3, cli.getTelefono_CLI());
		csta.setString(4, cli.getDireccion_CLI());
		csta.setString(5, cli.getEmail_CLI());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
}
