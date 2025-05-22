package Entities;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

public class Categoria extends Base {
    private String denominacion;
    private ArrayList<Sucursal> sucursal = new ArrayList<>();
    private ArrayList<Articulo> articulos = new ArrayList<>();
    private Set<Categoria> subcategorias = new HashSet<>();
    private Categoria padre;  //null

    public Categoria() {}

    public Categoria(String denominacion) {
        this.denominacion = denominacion;

    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public ArrayList<Sucursal> getSucursal() {
        return sucursal;
    }

    public void agregarSucursal(Sucursal s) {
        this.sucursal.add(s);
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void agregarArticulos(Articulo a) {
        this.articulos.add(a);
    }

    public Categoria getPadre() {
        return padre;
    }

    public void setPadre(Categoria padre) {
        this.padre = padre;
    }

    public Set<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(Set<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public void agregarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
        subcategoria.setPadre(this);
    }
}
