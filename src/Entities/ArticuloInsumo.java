package Entities;

import java.util.List;

public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;
}
