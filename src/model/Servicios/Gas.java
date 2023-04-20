package model.Servicios;

import java.util.Date;

public class Gas extends Medible {

	public Gas(String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String planAsociado, String medidorCode, int contadorValues, int contadorValuesPast) {
		super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo, planAsociado, medidorCode, contadorValues, contadorValuesPast);
	}
}