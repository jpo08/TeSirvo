package model.Servicios;

import java.sql.Date;

public class TelefoniaIlimitada {

    String codigo;
    String direccion;
    Date fechaInst;
    boolean activo;

    public TelefoniaIlimitada(String codigo, String direccion, Date fechaInst, boolean activo) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.fechaInst = fechaInst;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaInst() {
        return fechaInst;
    }

    public void setFechaInst(Date fechaInst) {
        this.fechaInst = fechaInst;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
