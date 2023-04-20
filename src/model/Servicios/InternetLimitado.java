package model.Servicios;

import java.util.Date;

public class InternetLimitado extends InternetIlimitado{

    double consumoIncluido;
    double consumido;

    public InternetLimitado(String codigoContrato, String direccionInstalacion, java.util.Date dateInstalacion, java.util.Date dateFactura, boolean estadoActivo, String planAsociado, double consumoIncluido, double consumido) {
        super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo, planAsociado);
        this.consumoIncluido = consumoIncluido;
        this.consumido = consumido;
    }

    public double getConsumoIncluido() {
        return consumoIncluido;
    }

    public void setConsumoIncluido(double consumoIncluido) {
        this.consumoIncluido = consumoIncluido;
    }

    public double getConsumido() {
        return consumido;
    }

    public void setConsumido(double consumido) {
        this.consumido = consumido;
    }
}
