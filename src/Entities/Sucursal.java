package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"empresa"})
public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    @Builder.Default
    private Domicilio domicilio = new Domicilio();
    @Builder.Default
    private Empresa empresa = new Empresa();
    @Builder.Default
    private ArrayList<Categoria> categorias = new ArrayList<>();
    @Builder.Default
    private ArrayList<Promocion> promociones = new ArrayList<>();
    @Builder.Default
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void agregarPromocion(Promocion promocion) {
        this.promociones.add(promocion);
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}
