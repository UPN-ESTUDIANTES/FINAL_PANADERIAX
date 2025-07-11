package VENTAS;

public class Detalles_Venta {
private String ID_VENTA;
private String ID_PRODUCTO;
private int Cantidad;
private double PrecioVenta;


public Detalles_Venta(String iD_VENTA, String iD_PRODUCTO, int cantidad, double precioVenta)
{
	ID_VENTA = iD_VENTA;
	ID_PRODUCTO = iD_PRODUCTO;
	Cantidad = cantidad;
	PrecioVenta = precioVenta;
}

public String getID_VENTA() {
	return ID_VENTA;
}

public void setID_VENTA(String iD_VENTA) {
	ID_VENTA = iD_VENTA;
}

public String getID_PRODUCTO() {
	return ID_PRODUCTO;
}

public void setID_PRODUCTO(String iD_PRODUCTO) {
	ID_PRODUCTO = iD_PRODUCTO;
}

public int getCantidad() {
	return Cantidad;
}

public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}

public double getPrecioVenta() {
	return PrecioVenta;
}

public void setPrecioVenta(double precioVenta) {
	PrecioVenta = precioVenta;
}

}
