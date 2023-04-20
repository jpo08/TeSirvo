package model.Servicios;

import model.Planes.Plan;

import java.util.Date;

public class Servicio {

	private String planAsociado;

	private String codigoContrato;
	private String direccionInstalacion;
	private Date dateInstalacion;
	private Date dateFactura;
	private boolean estadoActivo;

	public Servicio(String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String planAsociado) {
		this.codigoContrato = codigoContrato;
		this.direccionInstalacion = direccionInstalacion;
		this.dateInstalacion = dateInstalacion;
		this.dateFactura = dateFactura;
		this.estadoActivo = estadoActivo;
		this.planAsociado = planAsociado;
	}

	public String getPlanAsociado() {
		return planAsociado;
	}

	public void setPlanAsociado(String planAsociado) {
		this.planAsociado = planAsociado;
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

	@Override
	public String toString() {
		return  "codigoContrato='" + codigoContrato + '\'' +
				", direccionInstalacion='" + direccionInstalacion + '\'' +
				", fechaInstalacion=" + dateInstalacion +
				", fehcaFacturacion=" + dateFactura +
				", estado=" + estadoActivo;
	}
}