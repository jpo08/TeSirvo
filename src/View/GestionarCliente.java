package View;

import Controller.CtrlCliente;
import java.util.Scanner;

public class GestionarCliente {

    private Scanner sc;
    private CtrlCliente ctrlCliente;

    public GestionarCliente(){
        sc = new Scanner(System.in);
        ctrlCliente = new CtrlCliente();
    }

    public void consolaCliente(){
        GestionarCliente consolaCliente = new GestionarCliente();
        String select = "";
        do{
            select = consolaCliente.options();
            consolaCliente.menu(select);

        }while (!select.equals("0"));
    }

    public String options (){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Agregar cliente\n2.---------------\n0.Volver\n");
        String select = sc.nextLine();
        return select;
    }

    public void menu(String select){
        switch (select){

            case "1":
                agregrarCliente();
                break;

            case "2":
                break;

            default:
                System.out.println("\n¡Opcion no valida!\n");
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

        ctrlCliente.addClient(estado, name,  id , code,  direccion,  phone,  email);
    }
}