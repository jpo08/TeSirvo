package model.Servicios;

import model.Planes.Plan;

import java.sql.Date;

public class InternetIlimitado extends Servicio {

    public InternetIlimitado(String codigoContrato, String direccionInstalacion, java.util.Date dateInstalacion, java.util.Date dateFactura, boolean estadoActivo, String planAsociado) {
        super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo, planAsociado);
    }
}
