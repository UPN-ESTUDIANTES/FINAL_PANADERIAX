package EMPLEADOS;

public class Empleados {
	private String ID_EMPLEADO;
	private String Nombre_EMP, Apellido_EMP, Cargo_EMP;
	private double Salario;
	private String Afiliacion;

	public Empleados(String iD_EMPLEADO, String nombre_EMP, String apellido_EMP, String cargo_EMP, double salario,
			String afiliacion) 
	{
		ID_EMPLEADO = iD_EMPLEADO;
		Nombre_EMP = nombre_EMP;
		Apellido_EMP = apellido_EMP;
		Cargo_EMP = cargo_EMP;
		Salario = salario;
		Afiliacion = afiliacion;
	}
	
	public String getID_EMPLEADO() {
		return ID_EMPLEADO;
	}

	public void setID_EMPLEADO(String iD_EMPLEADO) {
		ID_EMPLEADO = iD_EMPLEADO;
	}

	public String getNombre_EMP() {
		return Nombre_EMP;
	}
	public void setNombre_EMP(String nombre_EMP) {
		Nombre_EMP = nombre_EMP;
	}
	public String getApellido_EMP() {
		return Apellido_EMP;
	}
	public void setApellido_EMP(String apellido_EMP) {
		Apellido_EMP = apellido_EMP;
	}
	public String getCargo_EMP() {
		return Cargo_EMP;
	}
	public void setCargo_EMP(String cargo_EMP) {
		Cargo_EMP = cargo_EMP;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public String getAfiliacion() {
		return Afiliacion;
	}
	public void setAfiliacion(String afiliacion) {
		Afiliacion = afiliacion;
	}
	
	public String getTipoAfiliacion() {
	    return Afiliacion.toUpperCase(); // O simplemente: return Afiliacion;
	}
}
