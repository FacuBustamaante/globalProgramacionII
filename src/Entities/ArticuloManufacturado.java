package Entities;

import java.util.List;

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private List<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles;
}
