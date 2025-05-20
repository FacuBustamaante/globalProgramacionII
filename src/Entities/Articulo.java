package Entities;

import java.util.HashSet;
import java.util.Set;

abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;
    protected Imagen imagen;
    protected UnidadMedida unidadMedida;
    protected Set<Promocion> promociones;

    public Articulo(){}

    public Articulo(String denominacion, double precioVenta){
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public Articulo(String denominacion, double precioVenta, Imagen imagen, UnidadMedida unidadMedida){
        super();
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.imagen = imagen;
        this.unidadMedida = unidadMedida;
        this.promociones = new HashSet<>();
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
    public Imagen getImagen() {
        return imagen;
    }
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public Set<Promocion> getPromociones() {
        return promociones;
    }
    public void setPromociones(Set<Promocion> promociones) {
        this.promociones = promociones;
    }
}
