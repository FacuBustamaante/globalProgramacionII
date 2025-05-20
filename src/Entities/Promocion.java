package Entities;

import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime fechaDesdeHora;
    private LocalTime fechaHastaHora;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Sucursal> sucursal;
    private Set<Imagen> imagenes;
    private Set<Articulo> articulos;

    public Promocion() {}

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime fechaDesdeHora, LocalTime fechaHastaHora, String descripcionDescuento, double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.fechaDesdeHora = fechaDesdeHora;
        this.fechaHastaHora = fechaHastaHora;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.sucursal = new HashSet<>();
        this.imagenes = new HashSet<>();
        this.articulos = new HashSet<>();
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalTime getFechaDesdeHora() {
        return fechaDesdeHora;
    }

    public void setFechaDesdeHora(LocalTime fechaDesdeHora) {
        this.fechaDesdeHora = fechaDesdeHora;
    }

    public LocalTime getFechaHastaHora() {
        return fechaHastaHora;
    }

    public void setFechaHastaHora(LocalTime fechaHastaHora) {
        this.fechaHastaHora = fechaHastaHora;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public double getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public Set<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(Set<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
}
