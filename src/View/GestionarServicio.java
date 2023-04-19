package View;

import Controller.CtrlServicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestionarServicio {

    private Scanner sc;
    private CtrlServicio ctrlServicio;

    public GestionarServicio(){
        sc = new Scanner(System.in);
        ctrlServicio = new CtrlServicio();
    }

    public void consolaServicio(){
        GestionarServicio consolaServicio = new GestionarServicio();
        String select = "";
        do{
            select = consolaServicio.options();
            consolaServicio.menu(select);

        }while (!select.equals("0"));
    }

    public String options (){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Agregar servicio\n2.---------------\n0.Volver\n");
        String select = sc.nextLine();
        return select;
    }

    public void menu(String select){
        switch (select){

            case "1":
                agregarServicio();
                break;

            case "2":
                break;

            default:
                System.out.println("\n¡Opcion no valida!\n");
                break;
        }
    }

    public void agregarServicio(){

        try {
            System.out.println("Digite los datos del servicio:\n");
            System.out.println("Codigo del contrato del cliente:");
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
            ctrlServicio.anadirServicio(id,serviceType, codicoCC,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, medidorCode,contadorValues,contadorValuesPast);

        } catch (ParseException e) {
            System.out.println ("Error en el formato de la fecha");
            e.printStackTrace();
        }
    }
}