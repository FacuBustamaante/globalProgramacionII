package Entities;

import Enums.TipoPromocion;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"sucursales", "imagenes", "articulos"})
public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime fechaDesdeHora;
    private LocalTime fechaHastaHora;
    private String descripcionDescuento;
    private double precioPromocional;
    private TipoPromocion tipoPromocion;
    @Builder.Default
    private ArrayList<Sucursal> sucursales = new ArrayList<>();
    @Builder.Default
    private ArrayList<Imagen> imagenes = new ArrayList<>();
    @Builder.Default
    private ArrayList<Articulo> articulos = new ArrayList<>();

    public void agregarSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    public void agregarImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
    public void agregarArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
}
