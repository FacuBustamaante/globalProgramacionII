package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private int cuil;
    @Builder.Default
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    public void agregarSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
}
