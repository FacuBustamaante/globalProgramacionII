package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Provincia extends Base{
    private String nombre;
    @Builder.Default
    private Pais pais = new Pais();
}
