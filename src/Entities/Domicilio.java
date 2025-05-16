package Entities;

import java.util.ArrayList;
import java.util.List;

public class Domicilio extends Base {
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
    private List<Pedido> pedidos;
    private List<Cliente> clientes;

    public Domicilio(String calle, int numero, int cp, Localidad localidad){
        super();
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
        this.pedidos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
}
