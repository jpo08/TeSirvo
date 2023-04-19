package View;

import Controller.CtrlServicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestionarServicio {
    CtrlServicio cr= new CtrlServicio();
    public void consolaServicio() throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite los datos del servicio:");
        System.out.println("codigo del contrato del cliente:");
        String codicoCC= sc.nextLine();
        System.out.println("ID");
        String id= sc.nextLine();
        System.out.println("Digite el tipo de servicio");
        String serviceType = sc.nextLine();

        System.out.println("Direccion instalacion");
        String direccionInstalacion=sc.next();

        System.out.println("Fecha de instalacion");
        int dateInstalacion1=sc.nextInt();

        Integer value = dateInstalacion1;
        SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
        Date dateInstalacion = originalFormat.parse(value.toString());

        System.out.println("Fecha de facturacion");
        int dateFactura1=sc.nextInt();

        Integer value2 = dateFactura1;
        SimpleDateFormat originalFormat1 = new SimpleDateFormat("yyyyMMdd");
        Date dateFactura = originalFormat1.parse(value.toString());

        System.out.println("Estado");
        boolean estadoActivo=sc.nextBoolean();

        System.out.println("Codigo Servicio");
        String medidorCode=sc.next();

        System.out.println("Valor Contador Actual");
        int contadorValues=sc.nextInt();

        System.out.println("Valor Contador Anterior");
        int contadorValuesPast=sc.nextInt();
        cr.anadirServicio(id,serviceType, codicoCC,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, medidorCode,contadorValues,contadorValuesPast);
    }
}