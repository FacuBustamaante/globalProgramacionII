package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private ArticuloManufacturadoDetalle detalle;
}
