package VENTAS;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ventas 
{
private String ID_VENTA;
private String ID_CLIENTE, ID_EMPLEADO;
private LocalDateTime Fecha_VENTA;
private double CantTotal;


public Ventas(String iD_VENTA, String iD_CLIENTE, String iD_EMPLEADO, LocalDateTime fecha_VENTA, double cantTotal) {
	super();
	ID_VENTA = iD_VENTA;
	ID_CLIENTE = iD_CLIENTE;
	ID_EMPLEADO = iD_EMPLEADO;
	Fecha_VENTA = fecha_VENTA;
	CantTotal = cantTotal;
}

public String getID_VENTA() {
	return ID_VENTA;
}
public void setID_VENTA(String iD_VENTA) {
	ID_VENTA = iD_VENTA;
}
public String getID_CLIENTE() {
	return ID_CLIENTE;
}
public void setID_CLIENTE(String iD_CLIENTE) {
	ID_CLIENTE = iD_CLIENTE;
}
public String getID_EMPLEADO() {
	return ID_EMPLEADO;
}
public void setID_EMPLEADO(String iD_EMPLEADO) {
	ID_EMPLEADO = iD_EMPLEADO;
}

public LocalDateTime getFecha_VENTA() {
	return Fecha_VENTA;
}

public void setFecha_VENTA(LocalDateTime fecha_VENTA) {
	Fecha_VENTA = fecha_VENTA;
}

public double getCantTotal() {
	return CantTotal;
}

public void setCantTotal(double cantTotal) {
	CantTotal = cantTotal;
}


}
