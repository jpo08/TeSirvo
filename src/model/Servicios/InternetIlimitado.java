package model.Servicios;

import java.sql.Date;

public class InternetIlimitado extends Servicio {


    boolean consumoIncluido;
    boolean consumido;

    public InternetIlimitado(String codigoContrato, String direccionInstalacion, java.util.Date dateInstalacion, java.util.Date dateFactura, boolean estadoActivo) {
        super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo);
        this.consumoIncluido = consumoIncluido;
        this.consumido = consumido;
    }



    public boolean isConsumoIncluido() {
        return consumoIncluido;
    }

    public void setConsumoIncluido(boolean consumoIncluido) {
        this.consumoIncluido = consumoIncluido;
    }

    public boolean isConsumido() {
        return consumido;
    }

    public void setConsumido(boolean consumido) {
        this.consumido = consumido;
    }
}
