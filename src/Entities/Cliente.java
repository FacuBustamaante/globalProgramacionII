package Entities;

import java.time.LocalDate;
import java.util.List;

public class Cliente extends Base {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Imagen imagen;
    private Usuario usuario;
    private List<Pedido> pedidos;
    private List<Domicilio> domicilios;
}
