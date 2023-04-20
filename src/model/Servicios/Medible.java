package model.Servicios;

import model.Planes.Plan;

import java.util.Date;

public class Medible extends Servicio {

    String medidorCode;
    int contadorValues;
    int contadorValuesPast;

    public Medible(String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String planAsociado, String medidorCode, int contadorValues, int contadorValuesPast) {
        super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo, planAsociado);
        this.medidorCode = medidorCode;
        this.contadorValues = contadorValues;
        this.contadorValuesPast = contadorValuesPast;
    }


    public String getMedidorCode() {
        return medidorCode;
    }

    public void setMedidorCode(String medidorCode) {
        this.medidorCode = medidorCode;
    }

    public int getContadorValues() {
        return contadorValues;
    }

    public void setContadorValues(int contadorValues) {
        this.contadorValues = contadorValues;
    }

    public int getContadorValuesPast() {
        return contadorValuesPast;
    }

    public void setContadorValuesPast(int contadorValuesPast) {
        this.contadorValuesPast = contadorValuesPast;
    }
}
