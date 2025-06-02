package Entities;


import java.util.ArrayList;

abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;
    protected ArrayList<Imagen> imagenenes;
    protected UnidadMedida unidadMedida;


    public Articulo(){}

    public Articulo(String denominacion, double precioVenta){
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }



    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public ArrayList<Imagen> getImagen() {
        return imagenenes;
    }
    public void agregarImagen(Imagen i) {
        this.imagenenes.add(i);
    }
    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
