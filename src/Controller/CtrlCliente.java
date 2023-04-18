package Controller;

import model.Servicios.Cliente;
import model.Servicios.EmpresaServicios;
import model.Servicios.Estado;

import java.util.Date;
import java.util.Scanner;

public class CtrlCliente {

	private EmpresaServicios empresa;
	private Scanner sc;

	public CtrlCliente(){
		empresa = new EmpresaServicios();
		sc = new Scanner(System.in);
	}

	public void addClient(int estado, String name, String id, String code, String direccion, String phone, String email){

		empresa.clientes.add(new Cliente( estado, name,  id, code,  direccion,  phone,  email));

	}


	public static void main(String[] args) {
		CtrlCliente main = new CtrlCliente();
		String select;
		do{
			select = main.options();
			main.menu(select);

		}while (!select.equals("0"));
	}

	public String options (){
		System.out.println("1.Añadir cliente\n0.Exit\n");
		String select = sc.nextLine();
		return select;
	}

	public void menu(String select){
		switch (select){

			case "1":
				System.out.println("Type the name");
				break;

			case "2":
				break;

			case "3":
				System.out.println("Bye!");
				break;
		}
	}

//	public String addClient(String n, String id) {
//
//		Cliente searched = null;
//		String out = "";
//		for (int i = 0; i < es.clientes.size() && searched==null; i++) {
//			Cliente current = es.clientes.get(i);
//			if(current.getId().equals(id)) {
//				searched = current;
//			}
//		}
//
//		if(searched==null) {
//			Cliente newclient = new Cliente(n, id);
//			es.clientes.add(newclient);
//			out = "¡Cliente agregado exitosameante!";
//		}else{
//			out = "Ya existe un cliente con el mismo id en el sistema";
//		}
//		return out;
//	}

}