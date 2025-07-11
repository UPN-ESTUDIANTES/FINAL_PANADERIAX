package PRODUCTOS;

public class Productos {
private String ID_PRODUCTO, Nombre_PRO, Descripción_PRO;
private double Precio_venta;
private int Stock_PRO;
public Productos(String iD_PRODUCTO, String nombre_PRO, String descripción_PRO, double precio_venta, int stock_PRO) {
	ID_PRODUCTO = iD_PRODUCTO;
	Nombre_PRO = nombre_PRO;
	Descripción_PRO = descripción_PRO;
	Precio_venta = precio_venta;
	Stock_PRO = stock_PRO;
}
public String getID_PRODUCTO() {
	return ID_PRODUCTO;
}
public void setID_PRODUCTO(String iD_PRODUCTO) {
	ID_PRODUCTO = iD_PRODUCTO;
}
public String getNombre_PRO() {
	return Nombre_PRO;
}
public void setNombre_PRO(String nombre_PRO) {
	Nombre_PRO = nombre_PRO;
}
public String getDescripción_PRO() {
	return Descripción_PRO;
}
public void setDescripción_PRO(String descripción_PRO) {
	Descripción_PRO = descripción_PRO;
}
public double getPrecio_venta() {
	return Precio_venta;
}
public void setPrecio_venta(double precio_venta) {
	Precio_venta = precio_venta;
}
public int getStock_PRO() {
	return Stock_PRO;
}
public void setStock_PRO(int stock_PRO) {
	Stock_PRO = stock_PRO;
}
}
