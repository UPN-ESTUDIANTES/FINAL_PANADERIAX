package COMPRAS;

public class ComprasProductos {
private String ID_COMPRA, ID_PROVEEDOR;
private String ID_EMPLEADO, NOMBRE_PRO,Fecha_COM_PRO;
private int Cantidad_COM_PRO;
private double PrecioC_COM_PRO, Total_COM;
public ComprasProductos(String iD_COMPRA, String iD_PROVEEDOR, String iD_EMPLEADO, String nOMBRE_PRO,
		String fecha_COM_PRO, int cantidad_COM_PRO, double precioC_COM_PRO, double total_COM) {
	ID_COMPRA = iD_COMPRA;
	ID_PROVEEDOR = iD_PROVEEDOR;
	ID_EMPLEADO = iD_EMPLEADO;
	NOMBRE_PRO = nOMBRE_PRO;
	Fecha_COM_PRO = fecha_COM_PRO;
	Cantidad_COM_PRO = cantidad_COM_PRO;
	PrecioC_COM_PRO = precioC_COM_PRO;
	Total_COM = total_COM;
}
public String getID_COMPRA() {
	return ID_COMPRA;
}
public void setID_COMPRA(String iD_COMPRA) {
	ID_COMPRA = iD_COMPRA;
}
public String getID_PROVEEDOR() {
	return ID_PROVEEDOR;
}
public void setID_PROVEEDOR(String iD_PROVEEDOR) {
	ID_PROVEEDOR = iD_PROVEEDOR;
}
public String getID_EMPLEADO() {
	return ID_EMPLEADO;
}
public void setID_EMPLEADO(String iD_EMPLEADO) {
	ID_EMPLEADO = iD_EMPLEADO;
}
public String getNOMBRE_PRO() {
	return NOMBRE_PRO;
}
public void setNOMBRE_PRO(String nOMBRE_PRO) {
	NOMBRE_PRO = nOMBRE_PRO;
}
public String getFecha_COM_PRO() {
	return Fecha_COM_PRO;
}
public void setFecha_COM_PRO(String fecha_COM_PRO) {
	Fecha_COM_PRO = fecha_COM_PRO;
}
public int getCantidad_COM_PRO() {
	return Cantidad_COM_PRO;
}
public void setCantidad_COM_PRO(int cantidad_COM_PRO) {
	Cantidad_COM_PRO = cantidad_COM_PRO;
}
public double getPrecioC_COM_PRO() {
	return PrecioC_COM_PRO;
}
public void setPrecioC_COM_PRO(double precioC_COM_PRO) {
	PrecioC_COM_PRO = precioC_COM_PRO;
}
public double getTotal_COM() {
	return Total_COM;
}
public void setTotal_COM(double total_COM) {
	Total_COM = total_COM;
}
}
