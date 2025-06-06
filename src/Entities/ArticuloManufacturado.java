package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "categoria")
public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    @Builder.Default
    private ArrayList<Categoria> categoria = new ArrayList<>();

    public void agregarCategoria(Categoria categoria) {
        this.categoria.add(categoria);
    }
}
