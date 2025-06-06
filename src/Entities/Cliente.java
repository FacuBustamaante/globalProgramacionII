package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Cliente extends Base {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    @Builder.Default
    private Imagen imagen = new Imagen();
    @Builder.Default
    private Usuario usuario = new Usuario();
    @Builder.Default
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    @Builder.Default
    private ArrayList<Domicilio> domicilios = new ArrayList<>();

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void agregarDomicilio(Domicilio domicilio) {
        this.domicilios.add(domicilio);
    }
}
