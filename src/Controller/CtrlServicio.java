package Controller;

import model.Servicios.Cliente;

import java.util.ArrayList;
import java.util.Date;

public class CtrlServicio {
	private Cliente cliente;

	private ArrayList<Cliente> clientes;

	public void añadirServicio(String id, String serviceType, String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String medidorCode, int contadorValues, int contadorValuesPast) {
		for (int i = 0; i < clientes.size(); i++) {
			if(clientes.get(i).getId().equals(id)){
				clientes.get(i).anadirServicio(serviceType, codigoContrato,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, medidorCode,contadorValues,contadorValuesPast);
			}
		}

	}

	public void actualizarServicio() {

	}

	public void inactivarServicio() {

	}

	public void consultarServicio() {

	}

}