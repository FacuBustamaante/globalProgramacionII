package Entities;


import java.util.ArrayList;

public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    private ArrayList<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new ArrayList<>();
    private ArrayList<Categoria> categorias = new ArrayList<>();

    public ArticuloInsumo() {}

    public ArticuloInsumo(String denominacion, Double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
        super(denominacion, precioCompra);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
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
    public ArrayList<ArticuloManufacturadoDetalle> getArticuloManufacturadoDetalles() {
        return articuloManufacturadoDetalles;
    }
    public void setArticuloManufacturadoDetalles(ArticuloManufacturadoDetalle a) {
        this.articuloManufacturadoDetalles.add(a);
    }

    public ArrayList<Categoria> getCategoria() {
        return categorias;
    }

    public void agregarCategoria(Categoria c) {
        this.categorias.add(c);
    }
}
