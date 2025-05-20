package Entities;

import java.util.HashSet;
import java.util.Set;

public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    private Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;

    public ArticuloInsumo() {}

    public ArticuloInsumo(String denominacion, Double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioCompra);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
        this.articuloManufacturadoDetalles = new HashSet<>();
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }
    public Set<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }
    public void setArticuloManufacturadoDetalles(Set<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles) {
        this.articuloManufacturadoDetalles = articuloManufacturadoDetalles;
    }
}
