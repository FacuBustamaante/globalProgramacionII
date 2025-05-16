package Entities;

import java.util.ArrayList;
import java.util.List;

abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;
    protected Imagen imagen;
    protected UnidadMedida unidadMedida;
    protected List<Promocion> promociones;

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
        this.promociones = new ArrayList<>();
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
    public List<Promocion> getPromociones() {
        return promociones;
    }
    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }
}
