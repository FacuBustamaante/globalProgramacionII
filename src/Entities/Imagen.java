package Entities;

public class Imagen extends Base {
    private String denominacion;

    public Imagen() {}

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {}
}
