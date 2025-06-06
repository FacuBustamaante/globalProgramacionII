package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
abstract class Articulo extends Base {
    protected String denominacion;
    protected double precioVenta;
    @Builder.Default
    protected ArrayList<Imagen> imagenes = new ArrayList<>();
    @Builder.Default
    protected UnidadMedida unidadMedida = new UnidadMedida();

    public void agregarImagen(Imagen imagen) {
        this.imagenes.add(imagen);
    }
}
