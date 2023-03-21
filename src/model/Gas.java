package model;

public class Gas extends Servicios {

	private String medidorCode;
	private int contadorValue;
	private int contadorValuePast;

	public String getMedidorCode() {
		return medidorCode;
	}

	public void setMedidorCode(String medidorCode) {
		this.medidorCode = medidorCode;
	}

	public int getContadorValue() {
		return contadorValue;
	}

	public void setContadorValue(int contadorValue) {
		this.contadorValue = contadorValue;
	}

	public int getContadorValuePast() {
		return contadorValuePast;
	}

	public void setContadorValuePast(int contadorValuePast) {
		this.contadorValuePast = contadorValuePast;
	}
}