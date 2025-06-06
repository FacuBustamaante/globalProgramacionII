package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    @Builder.Default
    private ArrayList<ArticuloManufacturadoDetalle> articuloManufacturadoDetalles = new ArrayList<>();
    @Builder.Default
    private ArrayList<Categoria> categorias = new ArrayList<>();

    public void agregarArticuloManufacturadoDetalle(ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        this.articuloManufacturadoDetalles.add(articuloManufacturadoDetalle);
    }

    public void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }
}
