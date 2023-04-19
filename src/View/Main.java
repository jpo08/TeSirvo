package View;

import Controller.CtrlCliente;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    private Scanner sc;
    private GestionarCliente gestionarCliente;
    private GestionarServicio gestionarServicio;

    public Main(){
        sc = new Scanner(System.in);
        gestionarCliente = new GestionarCliente();
        gestionarServicio = new GestionarServicio();
    }

    public static void main(String[] args){
        String select = "";
        Main main = new Main();
        do{
            select = main.options();
            main.menu(select);

        }while (!select.equals("0"));
    }

    public String options (){
        System.out.println("¿Que accion desea hacer a continuacion?");
        System.out.println("Seleccione una opcion:\n1.Gestionar cliente\n2.Gestionar servicio\n0.Exit\n");
        String select = sc.nextLine();
        return select;
    }

    public void menu(String select){
        switch (select){

            case "1":
                gestionarCliente.consolaCliente();
                break;

            case "2":
                gestionarServicio.consolaServicio();
                break;

            case "0":
                System.out.println("Bye!");
                break;

            default:
                System.out.println("\n¡Opcion no valida!\n");
                break;
        }
    }

}