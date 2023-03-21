package View;

import Controller.CtrlCliente;

import java.util.Scanner;

public class GestionarCliente {

    public void consolaCliente() {
        Scanner sc = new Scanner(System.in);
        CtrlCliente ctrlCliente = new CtrlCliente();

        System.out.println("digite los datos del cliente:");
        System.out.println("nombre:");
        String name= sc.nextLine();
        System.out.println("ID");
        String id= sc.nextLine();

        ctrlCliente.addClient(name,id);



    }
}