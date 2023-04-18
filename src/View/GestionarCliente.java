package View;

import Controller.CtrlCliente;
import model.Servicios.Estado;

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
        System.out.println("codigo");
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