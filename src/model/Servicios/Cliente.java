package model.Servicios;

import model.Planes.Plan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {

	private Estado estado;
	private String name;
	private String id;
	private Date date;
	private String code;
	private String direccion;
	private String phone;
	private String email;

	private List<Servicio> servicios;

	public Cliente(int estado, String name, String id, String code, String direccion, String phone, String email) {
		servicios = new ArrayList<>();
		this.name = name;
		this.id = id;

		this.code = code;
		this.direccion = direccion;
		this.phone = phone;
		this.email = email;

	}

	public void anadirServicio(String serviceType, String codigoContrato, String direccionInstalacion, Date dateInstalacion, Date dateFactura, boolean estadoActivo,String medidorCode, int contadorValues, int contadorValuesPast){
		FactoryServices fabrica = new FactoryServices();
		Servicio s = fabrica.getServicios(serviceType, codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo, medidorCode,contadorValues,contadorValuesPast);
		servicios.add(s);

	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}