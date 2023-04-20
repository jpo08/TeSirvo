package View;

import Controller.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ViewMain {
    private final Scanner sc;
    private Controller controller;

    public ViewMain(){
        sc = new Scanner(System.in);
        controller = new Controller();
    }

    public static void main(String[] args){
        String select;
        ViewMain viewMain = new ViewMain();
        do{
            select = viewMain.options();
            viewMain.menu(select);

        }while (!select.equals("0"));
    }

    public String options(){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Gestionar cliente\n2.Gestionar servicio\n3.Gestionar plan\n4.Agregar planes previos\n0.Exit\n");
        String select = sc.nextLine();
        return select;
    }

    public void menu(String select){
        switch (select){

            case "1":
                consolaCliente();
                break;

            case "2":
                consolaServicios();
                break;
            case "3":
                consolaPlanes();
                break;
            case "4":
                agregarPlanesPrevios();

            case "0":
                System.out.println("Bye!");
                break;

            default:
                System.out.println("\n¡Marque una opción valida!\n");
                break;
        }
    }

    //Servicios

    public void consolaServicios(){
        String select;
        do{
            select = optionsServicios();
            menuServicios(select);

        }while (!select.equals("0"));
    }

    public String optionsServicios(){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Agregar servicio\n2.---------------\n0.Volver\n");
        String select = sc.nextLine();
        return select;
    }

    public void menuServicios(String select){
        switch (select){

            case "1":
                agregarServicio();
                break;

            case "2":

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
            String direccionInstalacion=sc.nextLine();

            SimpleDateFormat originalFormat = new SimpleDateFormat( "dd/MM/yyyy");

            System.out.println("Fecha de instalacion");
            String dateInstalacion1=sc.nextLine();
            Date dateInstalacion = originalFormat.parse(dateInstalacion1);

            System.out.println("Fecha de facturacion");
            String dateFactura1=sc.nextLine();
            Date dateFactura = originalFormat.parse(dateFactura1);

            System.out.println("Estado (true/false)");
            boolean estadoActivo=sc.nextBoolean();

            System.out.println("Codigo Servicio");
            String medidorCode=sc.next();

            System.out.println("Valor Contador Actual");
            int contadorValues=sc.nextInt();

            System.out.println("Valor Contador Anterior");
            int contadorValuesPast=sc.nextInt();
            controller.anadirServicio(id,serviceType, codicoCC,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, medidorCode,contadorValues,contadorValuesPast);
        } catch (Exception e) {
            System.out.println ("Error en el formato");
            e.printStackTrace();
        }
    }

    //Clientes

    public void consolaCliente(){
        String select;
        do{
            select = optionsCliente();
            menuCliente(select);

        }while (!select.equals("0"));
    }

    public String optionsCliente(){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Agregar cliente\n2.---------------\n0.Volver\n");
        String select = sc.nextLine();
        return select;
    }

    public void menuCliente(String select){
        switch (select){

            case "1":
                agregrarCliente();
                break;

            case "2":

                break;
        }
    }


    public void agregrarCliente() {

        System.out.println("Digite los datos del cliente:\n");
        System.out.println("Nombre:");
        String name= sc.nextLine();
        System.out.println("ID");
        String id= sc.nextLine();
        System.out.println("Codigo");
        String code = sc.nextLine();


        System.out.println("Direccion");
        String direccion = sc.next();

        System.out.println("Correo Electronico");
        String email = sc.next();

        System.out.println("Telefono");
        String phone = sc.next();

        System.out.println("Estado");
        int estado = sc.nextInt();

        controller.addClient(estado, name,  id , code,  direccion,  phone,  email);
    }

    //Planes

    public void consolaPlanes(){
        String select;
        do{
            select = optionsPlanes();
            menuPlanes(select);

        }while (!select.equals("0"));
    }

    public String optionsPlanes(){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Agregar plan\n2.---------------\n0.Volver\n");
        String select = sc.nextLine();
        return select;
    }

    public void menuPlanes(String select){
        switch (select){

            case "1":
                agregarPlanes();
                break;

            case "2":

                break;
        }
    }

    public void agregarPlanesPrevios() {
        SimpleDateFormat originalFormat = new SimpleDateFormat( "dd/MM/yyyy");
        try{
            Date date = originalFormat.parse("20/04/2023");
            controller.agregarPlan(50000, "1", "Agua", date, date,  1000);
            controller.agregarPlan(50000, "2", "Gas", date, date,  3999);
            controller.agregarPlan(50000, "3", "Energia", date, date,  4000);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Planes agregados");
    }

    public void agregarPlanes(){
        try {
            System.out.println("Digite el nombre del plan:\n");
            String name = sc.nextLine();
            System.out.println("ID");
            String id= sc.nextLine();
            System.out.println("Digite el valor ofrecido para el plan");
            double valorOfrecido = sc.nextDouble();

            SimpleDateFormat originalFormat = new SimpleDateFormat( "dd/MM/yyyy");

            System.out.println("Fecha de inicio de la vigencia");
            String dateInstalacion1=sc.nextLine();
            Date vigenciaLower = originalFormat.parse(dateInstalacion1);

            System.out.println("Fecha de vencimiento de la vigencia");
            String dateFactura1=sc.nextLine();
            Date vigenciaUpper = originalFormat.parse(dateFactura1);

            System.out.println("Valor de la capacidad");
            double valorCapacidad =sc.nextDouble();

            controller.agregarPlan(valorOfrecido, id, name, vigenciaLower, vigenciaUpper,  valorCapacidad);
        } catch (Exception e) {
            System.out.println ("Error en el formato");
            e.printStackTrace();
        }
    }

}