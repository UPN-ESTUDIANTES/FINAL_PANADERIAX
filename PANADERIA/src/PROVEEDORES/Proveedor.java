package PROVEEDORES;

public class Proveedor {
private String ID_PROVEEDOR, Nombre_PROV, Telefono_PROV;
private String Email_PROV;
private String Direccion_PROV, Distrito_PROV;
public Proveedor(String iD_PROVEEDOR, String nombre_PROV, String telefono_PROV, String email_PROV,
		String direccion_PROV, String distrito_PROV) {
	ID_PROVEEDOR = iD_PROVEEDOR;
	Nombre_PROV = nombre_PROV;
	Telefono_PROV = telefono_PROV;
	Email_PROV = email_PROV;
	Direccion_PROV = direccion_PROV;
	Distrito_PROV = distrito_PROV;
}
public String getID_PROVEEDOR() {
	return ID_PROVEEDOR;
}
public void setID_PROVEEDOR(String iD_PROVEEDOR) {
	ID_PROVEEDOR = iD_PROVEEDOR;
}
public String getNombre_PROV() {
	return Nombre_PROV;
}
public void setNombre_PROV(String nombre_PROV) {
	Nombre_PROV = nombre_PROV;
}
public String getTelefono_PROV() {
	return Telefono_PROV;
}
public void setTelefono_PROV(String telefono_PROV) {
	Telefono_PROV = telefono_PROV;
}
public String getEmail_PROV() {
	return Email_PROV;
}
public void setEmail_PROV(String email_PROV) {
	Email_PROV = email_PROV;
}
public String getDireccion_PROV() {
	return Direccion_PROV;
}
public void setDireccion_PROV(String direccion_PROV) {
	Direccion_PROV = direccion_PROV;
}
public String getDistrito_PROV() {
	return Distrito_PROV;
}
public void setDistrito_PROV(String distrito_PROV) {
	Distrito_PROV = distrito_PROV;
}
}