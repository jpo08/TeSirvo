package model.Planes;

import java.util.Date;

public class Plan {

    double valorOfrecido;
    String id;
    String name;
    Date videnciaLower;
    Date getVidenciaUpper;
    double valorDeCapacidad;

    public Plan(double valorOfrecido, String id, String name, Date videnciaLower, Date getVidenciaUpper, double valorDeCapacidad) {
        this.valorOfrecido = valorOfrecido;
        this.id = id;
        this.name = name;
        this.videnciaLower = videnciaLower;
        this.getVidenciaUpper = getVidenciaUpper;
        this.valorDeCapacidad = valorDeCapacidad;
    }

    public double getValorOfrecido() {
        return valorOfrecido;
    }

    public void setValorOfrecido(double valorOfrecido) {
        this.valorOfrecido = valorOfrecido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getVidenciaLower() {
        return videnciaLower;
    }

    public void setVidenciaLower(Date videnciaLower) {
        this.videnciaLower = videnciaLower;
    }

    public Date getGetVidenciaUpper() {
        return getVidenciaUpper;
    }

    public void setGetVidenciaUpper(Date getVidenciaUpper) {
        this.getVidenciaUpper = getVidenciaUpper;
    }

    public double getValorDeCapacidad() {
        return valorDeCapacidad;
    }

    public void setValorDeCapacidad(double valorDeCapacidad) {
        this.valorDeCapacidad = valorDeCapacidad;
    }
}
