package model.Servicios;

import java.sql.Date;

public class InternetIlimitado extends Servicio {

    String codigo;
    String direccion;
    Date fechacInst;
    Date fechaFact;
    boolean activo;
    boolean consumoIncluido;
    boolean consumido;

    public InternetIlimitado(String codigoContrato, String direccionInstalacion, java.util.Date dateInstalacion, java.util.Date dateFactura, boolean estadoActivo, String codigo, String direccion, Date fechacInst, Date fechaFact, boolean activo, boolean consumoIncluido, boolean consumido) {
        super(codigoContrato, direccionInstalacion, dateInstalacion, dateFactura, estadoActivo);
        this.codigo = codigo;
        this.direccion = direccion;
        this.fechacInst = fechacInst;
        this.fechaFact = fechaFact;
        this.activo = activo;
        this.consumoIncluido = consumoIncluido;
        this.consumido = consumido;
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

    public Date getFechacInst() {
        return fechacInst;
    }

    public void setFechacInst(Date fechacInst) {
        this.fechacInst = fechacInst;
    }

    public Date getFechaFact() {
        return fechaFact;
    }

    public void setFechaFact(Date fechaFact) {
        this.fechaFact = fechaFact;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isConsumoIncluido() {
        return consumoIncluido;
    }

    public void setConsumoIncluido(boolean consumoIncluido) {
        this.consumoIncluido = consumoIncluido;
    }

    public boolean isConsumido() {
        return consumido;
    }

    public void setConsumido(boolean consumido) {
        this.consumido = consumido;
    }
}
