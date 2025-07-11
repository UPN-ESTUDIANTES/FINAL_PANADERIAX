package COMPRAS;

public class ComprasInsumos {
	private String ID_COMPRA, ID_PROVEEDOR, ID_EMPLEADO, NOMBRE_INS;
    private String FECHA_COM_INS;
    private int CANTIDAD_COM_INS;
    private double PRECIOC_COM_INS, TOTAL_COM_INS;
	public ComprasInsumos(String iD_COMPRA, String iD_PROVEEDOR, String iD_EMPLEADO, String nOMBRE_INS,
			String fECHA_COM_INS, int cANTIDAD_COM_INS, double pRECIOC_COM_INS, double tOTAL_COM_INS) {
		ID_COMPRA = iD_COMPRA;
		ID_PROVEEDOR = iD_PROVEEDOR;
		ID_EMPLEADO = iD_EMPLEADO;
		NOMBRE_INS = nOMBRE_INS;
		FECHA_COM_INS = fECHA_COM_INS;
		CANTIDAD_COM_INS = cANTIDAD_COM_INS;
		PRECIOC_COM_INS = pRECIOC_COM_INS;
		TOTAL_COM_INS = tOTAL_COM_INS;
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
	public String getNOMBRE_INS() {
		return NOMBRE_INS;
	}
	public void setNOMBRE_INS(String nOMBRE_INS) {
		NOMBRE_INS = nOMBRE_INS;
	}
	public String getFECHA_COM_INS() {
		return FECHA_COM_INS;
	}
	public void setFECHA_COM_INS(String fECHA_COM_INS) {
		FECHA_COM_INS = fECHA_COM_INS;
	}
	public int getCANTIDAD_COM_INS() {
		return CANTIDAD_COM_INS;
	}
	public void setCANTIDAD_COM_INS(int cANTIDAD_COM_INS) {
		CANTIDAD_COM_INS = cANTIDAD_COM_INS;
	}
	public double getPRECIOC_COM_INS() {
		return PRECIOC_COM_INS;
	}
	public void setPRECIOC_COM_INS(double pRECIOC_COM_INS) {
		PRECIOC_COM_INS = pRECIOC_COM_INS;
	}
	public double getTOTAL_COM_INS() {
		return TOTAL_COM_INS;
	}
	public void setTOTAL_COM_INS(double tOTAL_COM_INS) {
		TOTAL_COM_INS = tOTAL_COM_INS;
	}
}

