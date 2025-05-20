package Entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal extends Base{
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Set<Categoria> categorias;
    private Set<Promocion> promociones;
    private Set<Pedido> pedidos;
    private Empresa empresa;


    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
        this.categorias = new HashSet<>();
        this.promociones = new HashSet<>();
        this.pedidos = new HashSet<>();
    }

    public Sucursal() {
        this.categorias = new HashSet<>();
        this.promociones =new HashSet<>();
        this.pedidos = new HashSet<>();
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

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Set<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(Set<Promocion> promociones) {
        this.promociones = promociones;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        // Si ya hay una empresa asignada distinta, removemos esta sucursal de esa empresa
        if (this.empresa != null && this.empresa != empresa) {
            this.empresa.getSucursales().remove(this);
        }
        this.empresa = empresa;
        // Si la nueva empresa no tiene esta sucursal, la agregamos
        if (empresa != null && !empresa.getSucursales().contains(this)) {
            empresa.getSucursales().add(this);
        }
    }
}
