package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"subcategorias", "sucursal"})
public class Categoria extends Base {
    private String denominacion;
    @Builder.Default
    private ArrayList<Sucursal> sucursal = new ArrayList<>();
    @Builder.Default
    private ArrayList<Articulo> articulos = new ArrayList<>();
    @Builder.Default
    private Set<Categoria> subcategorias = new HashSet<>();

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursal.add(sucursal);
    }

    public void agregarArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public void agregarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
    }
}
