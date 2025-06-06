package Entities;

import Enums.FormaPago;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.ArrayList;

@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Factura extends Base {
    private LocalDate fechaFacturacion;
    private int mpPaymentId;
    private int mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private double totalVenta;
    private FormaPago formaPago;
    @Builder.Default
    private Pedido pedido = new Pedido();
}
