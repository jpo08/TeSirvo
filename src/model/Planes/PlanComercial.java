package model.Planes;

import java.util.ArrayList;
import java.util.Date;

public class PlanComercial extends Plan{

    ArrayList planesComerciales = new ArrayList<>();

    public PlanComercial(double valorOfrecido, String id, String name, Date videnciaLower, Date getVidenciaUpper, double valorDeCapacidad) {
        super(valorOfrecido, id, name, videnciaLower, getVidenciaUpper, valorDeCapacidad);
    }



}
