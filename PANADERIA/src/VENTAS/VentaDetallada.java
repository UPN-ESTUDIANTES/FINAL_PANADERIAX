package VENTAS;
import java.time.LocalDateTime;
public class VentaDetallada 
{
    private String idVenta;
    private String idEmpleado;
    private String idCliente;
    private LocalDateTime fecha;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
	public VentaDetallada(String idVenta, String idEmpleado, String idCliente, LocalDateTime fecha, String producto,
			int cantidad, double precioUnitario, double subtotal) {
		this.idVenta = idVenta;
		this.idEmpleado = idEmpleado;
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
    
    
    



}
