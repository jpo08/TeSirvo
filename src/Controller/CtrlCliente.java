package Controller;

import model.Servicios.Cliente;
import model.Servicios.EmpresaServicios;

public class CtrlCliente {
	EmpresaServicios es = new EmpresaServicios();

	public String addClient(String n, String id) {

		Cliente searched = null;
		String out = "";
		for (int i = 0; i < es.clientes.size() && searched==null; i++) {
			Cliente current = es.clientes.get(i);
			if(current.getId().equals(id)) {
				searched = current;
			}
		}

		if(searched==null) {
			Cliente newclient = new Cliente(n, id);
			es.clientes.add(newclient);
			out = "¡Cliente agregado exitosameante!";
		}else{
			out = "Ya existe un cliente con el mismo id en el sistema";
		}
		return out;
	}

}