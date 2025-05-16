package Entities;

import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime fechaDesdeHora;
    private LocalTime fechaHastaHora;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    private List<Sucursal> sucursal;
    private List<Imagen> imagenes;
    private List<Articulo> articulos;

}
