package model.Servicios;

import model.Planes.Plan;

import java.util.ArrayList;
import java.util.List;

public class EmpresaServicios implements Facturador{

	private List<Plan> planes;
	private List<Cliente> clientes;

	private FactoryServices fabricaDeServicios;

	public EmpresaServicios() {
		planes = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	public void createService(String ts){

	}

	public void getInfoClient(String id){
	}

	public void setInfoClient(String id){

	}

	public List<Plan> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plan> planes) {
		this.planes = planes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList clientes) {
		this.clientes = clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public FactoryServices getFabricaDeServicios() {
		return fabricaDeServicios;
	}

	public void setFabricaDeServicios(FactoryServices fabricaDeServicios) {
		this.fabricaDeServicios = fabricaDeServicios;
	}

	@Override
	public String getClientInfo() {
		return null;
	}

	@Override
	public String getClient() {
		return null;
	}
}