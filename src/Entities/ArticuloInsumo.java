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
}
