package Entities;

import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime fechaDesdeHora;
    private LocalTime fechaHastaHora;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    private ArrayList<Sucursal> sucursales = new ArrayList<>();
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();

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

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void agregarSucursal(Sucursal s){
        this.sucursales.add(s);
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Imagen i) {
        this.imagenes.add(i);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulo a) {
        this.articulos.add(a);
    }
}
