package PROVEEDORES;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import CONEXIÓN.ConexiónMySQL;

public class ArrayProveedor {
public ArrayList<Proveedor> ListarProveedores(){
	ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
	try {
		CallableStatement csta = ConexiónMySQL.getConexión().prepareCall("{call SP_Listar_PROV()}");
		ResultSet rs = csta.executeQuery();
		Proveedor prov;
		while(rs.next()) {
			prov = new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			lista.add(prov);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public ArrayList<Proveedor> ConsultarProveedores(String nom){
	ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
	try {
		Statement sta = ConexiónMySQL.getConexión().createStatement();
		ResultSet rs = sta.executeQuery("Select * from PROVEEDORES where ID_PROVEEDOR like '%"+ nom +"%'");
		Proveedor prov;
		while(rs.next()) {
			prov = new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			lista.add(prov);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public ArrayList<Proveedor> ConsultarProveedoresID(String id){
	ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_ConsultarCod_PROV(?)}");
		csta.setString(1, id);
		ResultSet rs = csta.executeQuery();
		Proveedor prov;
		while(rs.next()) {
			prov = new Proveedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			lista.add(prov);
		}
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
	return lista;
}
public void Insertar(Proveedor prov) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Insertar_PROV(?,?,?,?,?,?)}");
		csta.setString(1, prov.getID_PROVEEDOR());
		csta.setString(2, prov.getNombre_PROV());
		csta.setString(3, prov.getTelefono_PROV());
		csta.setString(4, prov.getEmail_PROV());
		csta.setString(5, prov.getDireccion_PROV());
		csta.setString(6, prov.getDistrito_PROV());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
public void Eliminar(String id) {
	try {
		Connection cnx= ConexiónMySQL.getConexión();
		CallableStatement csta=cnx.prepareCall("{call SP_Eliminar_PROV(?)}");
		csta.setString(1, id);
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
	}
}
public void Editar(Proveedor prov) {
	try {
		Connection cnx = ConexiónMySQL.getConexión();
		CallableStatement csta = cnx.prepareCall("{call SP_Editar_PROV(?,?,?,?,?,?)}");
		csta.setString(1, prov.getID_PROVEEDOR());
		csta.setString(2, prov.getNombre_PROV());
		csta.setString(3, prov.getTelefono_PROV());
		csta.setString(4, prov.getEmail_PROV());
		csta.setString(5, prov.getDireccion_PROV());
		csta.setString(6, prov.getDistrito_PROV());
		csta.executeUpdate();
	} catch (Exception e) {
		System.out.println("ERROR" + e);
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
            String ultimoID = rs.getString(1); // Ejemplo: "A07"
            if (ultimoID != null) {
                int num = Integer.parseInt(ultimoID.substring(1)); // 7
                num++; // 8
                nuevoID = String.format("A%02d", num); // "A08"
            }
        }
        rs.close();
        stmt.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return nuevoID;
}
}
