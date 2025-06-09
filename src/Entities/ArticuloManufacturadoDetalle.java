package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ArticuloManufacturadoDetalle extends Base {
    private int cantidad;
    private ArticuloInsumo articuloInsumo;
}
