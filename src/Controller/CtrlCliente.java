package Controller;

import model.Servicios.Cliente;
import model.Servicios.EmpresaServicios;
import model.Servicios.Estado;

import java.util.Date;
import java.util.Scanner;

public class CtrlCliente {

	private EmpresaServicios empresa;

	public CtrlCliente(){
		empresa = new EmpresaServicios();
	}

	public void addClient(int estado, String name, String id, String code, String direccion, String phone, String email){

		empresa.clientes.add(new Cliente( estado, name,  id, code,  direccion,  phone,  email));

	}

}