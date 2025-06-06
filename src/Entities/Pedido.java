package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"factura", "domicilio", "sucursal"})
public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private LocalDate fechaPedido;
    private Estado estado;
    private FormaPago formaPago;
    private TipoEnvio tipoEnvio;
    private Factura factura;
    @Builder.Default
    private Domicilio domicilio = new Domicilio();
    @Builder.Default
    private Sucursal sucursal = new Sucursal();
    @Builder.Default
    private ArrayList<DetallePedido> detallesPedido = new ArrayList<>();

    public void agregarDetallesPedido(DetallePedido detalle) {
        this.detallesPedido.add(detalle);
    }
}
