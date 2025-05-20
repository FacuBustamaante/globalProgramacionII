package Entities;

import java.util.HashSet;
import java.util.Set;

public class Categoria extends Base {
    private String denominacion;
    private Set<Sucursal> sucursal;
    private Set<Articulo> articulos;
    private HashSet<Categoria> subcategorias;
    private Categoria padre;

    public Categoria() {}

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
        this.sucursal = new HashSet<>();
        this.articulos = new HashSet<>();
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(Set<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Categoria getPadre() {
        return padre;
    }

    public void setPadre(Categoria padre) {
        this.padre = padre;
    }

    public HashSet<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(HashSet<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public void agregarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
        subcategoria.setPadre(this);
    }
}
