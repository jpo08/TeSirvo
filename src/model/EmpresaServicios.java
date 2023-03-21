package model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaServicios {

	private List<Cliente> clientes=new ArrayList<Cliente>();

	public void addClient(String n, String id) {

		Cliente searched = null;
		for (int i = 0; i < clientes.size() && searched==null; i++) {
			Cliente current = clientes.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}

		if(searched==null) {
			Cliente newclient = new Cliente(n, id);
			clientes.add(newclient);
		}
	}




}