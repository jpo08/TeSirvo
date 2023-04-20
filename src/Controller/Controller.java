package Controller;

import model.Servicios.*;
import model.Planes.*;
import java.util.Date;

public class Controller{




	private EmpresaServicios empresa;

	public Controller(){
		empresa = new EmpresaServicios();
	}

	//Clientes

	public void addClient(int estado, String name, String id, String code, String direccion, String phone, String email){
		empresa.getClientes().add(new Cliente( estado, name,  id, code,  direccion,  phone,  email));

	}

	//Planes

	public void agregarPlan(double valorOfrecido, String id, String name, Date vigenciaLower, Date vigenciaUpper, double valorCapacidad){
		empresa.getPlanes().add(new Plan(valorOfrecido, id, name, vigenciaLower, vigenciaUpper,  valorCapacidad));
	}

	//Servicios

	public void anadirServicio(String id, String serviceType, String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo, String medidorCode, int contadorValues, int contadorValuesPast) {
		for (int i = 0; i < empresa.getClientes().size(); i++) {
			if(empresa.getClientes().get(i).getId().equals(id)){
				empresa.getClientes().get(i).anadirServicio(serviceType, codigoContrato,  direccionInstalacion,  dateInstalacion, dateFactura, estadoActivo, medidorCode,contadorValues,contadorValuesPast);
			}
		}
	}

	public void actualizarServicio() {

	}

	public void inactivarServicio() {

	}

	public void consultarServicio() {

	}

	//Planes




}