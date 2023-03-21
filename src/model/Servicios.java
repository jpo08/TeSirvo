package model;

import java.util.Date;

public class Servicios {

	private String codigoContrato;
	private String direccionInstalacion;
	private Date dateInstalacion;
	private Date dateFactura;
	private boolean estadoActivo;

	public Servicios(String codigoContrato) {
		this.codigoContrato = codigoContrato;
	}

	public String getCodigoContrato() {
		return codigoContrato;
	}

	public void setCodigoContrato(String codigoContrato) {
		this.codigoContrato = codigoContrato;
	}

	public String getDireccionInstalacion() {
		return direccionInstalacion;
	}

	public void setDireccionInstalacion(String direccionInstalacion) {
		this.direccionInstalacion = direccionInstalacion;
	}

	public Date getDateInstalacion() {
		return dateInstalacion;
	}

	public void setDateInstalacion(Date dateInstalacion) {
		this.dateInstalacion = dateInstalacion;
	}

	public Date getDateFactura() {
		return dateFactura;
	}

	public void setDateFactura(Date dateFactura) {
		this.dateFactura = dateFactura;
	}

	public boolean isEstadoActivo() {
		return estadoActivo;
	}

	public void setEstadoActivo(boolean estadoActivo) {
		this.estadoActivo = estadoActivo;
	}
}