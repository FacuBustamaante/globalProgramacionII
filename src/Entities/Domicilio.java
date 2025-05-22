package Entities;

import java.util.ArrayList;


public class Domicilio extends Base{
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;


    public Domicilio(String calle, int numero, int cp){
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
