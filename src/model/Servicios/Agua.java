package model.Servicios;

import model.Planes.Plan;

import java.util.Date;

public class Agua extends Medible{

	public Agua(String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String planAsociado, String medidorCode, int contadorValues, int contadorValuesPast) {
		super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo, planAsociado, medidorCode, contadorValues, contadorValuesPast);
	}
}