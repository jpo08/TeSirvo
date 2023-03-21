package Controller;

import model.Cliente;
import model.EmpresaServicios;

public class CtrlCliente {
	EmpresaServicios es = new EmpresaServicios();

	public void addClient(String n, String id) {

		Cliente searched = null;
		for (int i = 0; i < es.clientes.size() && searched==null; i++) {
			Cliente current = es.clientes.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}

		if(searched==null) {
			Cliente newclient = new Cliente(n, id);
			es.clientes.add(newclient);
		}
	}

}