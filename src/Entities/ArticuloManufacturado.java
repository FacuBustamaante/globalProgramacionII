package Entities;

import java.util.ArrayList;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArrayList<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new ArrayList<>();
    private ArrayList<Categoria> categoria = new ArrayList<>();

    public ArticuloManufacturado() {}

    public ArticuloManufacturado(String denominacion, double precioVenta, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public ArrayList<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }

    public void setArticuloManufacturadoDetalles(ArticuloManufacturadoDetalle a) {
        this.articuloManufacturadoDetalles.add(a);
    }
    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    public void agregarCategoria(Categoria c) {
        this.categoria.add(c);
    }
}
