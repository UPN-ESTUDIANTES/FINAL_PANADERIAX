package CLIENTES;

public class Clientes {
private String ID_CLIENTE, Nombre_CLI;
private String Telefono_CLI;
private String Direccion_CLI, Email_CLI;

public Clientes(String iD_CLIENTE, String nombre_CLI, String telefono_CLI, String direccion_CLI, String email_CLI) {
	ID_CLIENTE = iD_CLIENTE;
	Nombre_CLI = nombre_CLI;
	Telefono_CLI = telefono_CLI;
	Direccion_CLI = direccion_CLI;
	Email_CLI = email_CLI;
}
public String getID_CLIENTE() {
	return ID_CLIENTE;
}
public void setID_CLIENTE(String iD_CLIENTE) {
	ID_CLIENTE = iD_CLIENTE;
}
public String getNombre_CLI() {
	return Nombre_CLI;
}
public void setNombre_CLI(String nombre_CLI) {
	Nombre_CLI = nombre_CLI;
}

public String getTelefono_CLI() {
	return Telefono_CLI;
}
public void setTelefono_CLI(String telefono_CLI) {
	Telefono_CLI = telefono_CLI;
}
public String getDireccion_CLI() {
	return Direccion_CLI;
}
public void setDireccion_CLI(String direccion_CLI) {
	Direccion_CLI = direccion_CLI;
}
public String getEmail_CLI() {
	return Email_CLI;
}
public void setEmail_CLI(String email_CLI) {
	Email_CLI = email_CLI;
}
}
