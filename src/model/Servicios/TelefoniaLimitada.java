package model.Servicios;

import java.sql.Date;

public class TelefoniaLimitada extends TelefoniaIlimitada {

    int minutosLocales;
    int minutosLargaDist;
    int consumoLocal;
    int consumoLargaDist;

    public TelefoniaLimitada(String codigo, String direccion, Date fechaInst, boolean activo, int minutosLocales, int minutosLargaDist, int consumoLocal, int consumoLargaDist) {
        super(codigo, direccion, fechaInst, activo);
        this.minutosLocales = minutosLocales;
        this.minutosLargaDist = minutosLargaDist;
        this.consumoLocal = consumoLocal;
        this.consumoLargaDist = consumoLargaDist;
    }

    public int getMinutosLocales() {
        return minutosLocales;
    }

    public void setMinutosLocales(int minutosLocales) {
        this.minutosLocales = minutosLocales;
    }

    public int getMinutosLargaDist() {
        return minutosLargaDist;
    }

    public void setMinutosLargaDist(int minutosLargaDist) {
        this.minutosLargaDist = minutosLargaDist;
    }

    public int getConsumoLocal() {
        return consumoLocal;
    }

    public void setConsumoLocal(int consumoLocal) {
        this.consumoLocal = consumoLocal;
    }

    public int getConsumoLargaDist() {
        return consumoLargaDist;
    }

    public void setConsumoLargaDist(int consumoLargaDist) {
        this.consumoLargaDist = consumoLargaDist;
    }
}
