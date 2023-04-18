package model.Servicios;

import java.util.Date;

public class InternetLimitado extends InternetIlimitado{

    double consumoIncluido;
    double consumido;

    public InternetLimitado(String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String codigo, String direccion, java.sql.Date fechacInst, java.sql.Date fechaFact, boolean activo, boolean consumoIncluido, boolean consumido, double consumoIncluido1, double consumido1) {
        super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo);
        this.consumoIncluido = consumoIncluido1;
        this.consumido = consumido1;
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
