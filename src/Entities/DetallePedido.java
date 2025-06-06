package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DetallePedido extends Base {
    private int cantidad;
    private double subTotal;
    private Articulo articulo;

}
