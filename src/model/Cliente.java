package model;

import java.util.Date;

public class Cliente {

	private Estado estado;
	private String name;
	private String id;
	private Date date;
	private String code;
	private String direccion;
	private String phone;
	private String email;

	private Servicios[] servicios;

	public Cliente(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Servicios[] getServicios() {
		return servicios;
	}

	public void setServicios(Servicios[] servicios) {
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