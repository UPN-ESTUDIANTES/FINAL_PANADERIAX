package INSUMOS;

public class Insumos {
	private String ID_INSUMO, Nombre_INS, Descripcion_INS;
    private int Stock_INS;
	public Insumos(String iD_INSUMO, String nombre_INS, String descripcion_INS, int stock_INS) {
		ID_INSUMO = iD_INSUMO;
		Nombre_INS = nombre_INS;
		Descripcion_INS = descripcion_INS;
		Stock_INS = stock_INS;
	}
	public String getID_INSUMO() {
		return ID_INSUMO;
	}
	public void setID_INSUMO(String iD_INSUMO) {
		ID_INSUMO = iD_INSUMO;
	}
	public String getNombre_INS() {
		return Nombre_INS;
	}
	public void setNombre_INS(String nombre_INS) {
		Nombre_INS = nombre_INS;
	}
	public String getDescripcion_INS() {
		return Descripcion_INS;
	}
	public void setDescripcion_INS(String descripcion_INS) {
		Descripcion_INS = descripcion_INS;
	}
	public int getStock_INS() {
		return Stock_INS;
	}
	public void setStock_INS(int stock_INS) {
		Stock_INS = stock_INS;
	}
}
