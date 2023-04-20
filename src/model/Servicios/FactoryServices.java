package model.Servicios;

import model.Planes.Plan;
import model.Servicios.*;
import model.Servicios.Cliente;

import java.util.Date;

public class FactoryServices{


    public Servicio getServicios(String serviceType, String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo,String medidorCode, int contadorValues, int contadorValuesPast){
        if(serviceType == null){
            return null;
        }
        if(serviceType.equalsIgnoreCase("Energia")){
            return new Energia( codigoContrato,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, "Energia", medidorCode,contadorValues,contadorValuesPast);

        } else if(serviceType.equalsIgnoreCase("Gas")){
            return new Gas( codigoContrato,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, "Gas", medidorCode,contadorValues,contadorValuesPast);

        } else if(serviceType.equalsIgnoreCase("Agua")){
            return new Agua(codigoContrato,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo,"Agua", medidorCode,contadorValues,contadorValuesPast);
        }

        return null;
    }
}
