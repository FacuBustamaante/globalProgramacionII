package Entities;

import java.util.List;

abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;
    protected Imagen imagen;
    protected UnidadMedida unidadMedida;
    protected List<Promocion> promociones;
}
