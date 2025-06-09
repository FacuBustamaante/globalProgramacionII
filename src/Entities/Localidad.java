package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Localidad extends Base {
    private String nombre;
    private Provincia provincia;
}
