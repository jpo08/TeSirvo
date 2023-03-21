package View;

import java.util.Scanner;

public class GestionarServicio {
    public void consolaServicio(){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite los datos del servicio:");
        System.out.println("codigo del contrato del cliente:");
        String codicoCC= sc.nextLine();
        System.out.println("ID");
        String id= sc.nextLine();
    }
}