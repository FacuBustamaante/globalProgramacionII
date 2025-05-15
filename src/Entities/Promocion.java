package Entities;

import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Promocion {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime fechaDesdeHora;
    private LocalTime fechaHastaHora;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
}
