package Entities;

import java.time.LocalTime;
import java.util.ArrayList;

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Empresa empresa;
    private ArrayList<Categoria> categorias = new ArrayList<>();
    private ArrayList<Promocion> promociones = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void agregarCategorias(Categoria c) {
        this.categorias.add(c);
    }

    public ArrayList<Promocion> getPromociones() {
        return promociones;
    }

    public void agregarPromociones(Promocion p) {
        this.promociones.add(p);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarPedidos(Pedido p) {
        this.pedidos.add(p);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
