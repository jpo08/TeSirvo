package View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionarCliente gestionarCliente=new GestionarCliente();
        GestionarServicio gestionarServicio = new GestionarServicio();

        int stop=1;
        while (stop==1){

            System.out.println("que accion desea hacer a continuacion:");
            System.out.println("1.agregar cliente" +"\n"+ "2.agregar servico");
            int opcion =sc.nextInt();
            switch (opcion){
                case 1:
                    gestionarCliente.consolaCliente();
                    break;
                case 2:
                    gestionarServicio.consolaServicio();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }
}