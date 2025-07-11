package CONEXIÓN;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexiónMySQL {
public static Connection getConexión() {
	Connection cnx = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Correcto.");
		cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/PANADERIA","root","mysql");
		System.out.println("Conexión correcta.");
	} catch (Exception e) {
		System.out.println("Error" + e);
	}
	return cnx;
}
	public static void main(String[] args) {
		getConexión();
	}
}