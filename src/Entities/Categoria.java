package Entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Base {
    private String denominacion;
    private List<Sucursal> sucursal;
    private List<Articulo> articulos;
    private ArrayList<Categoria> subcategorias;
    private Categoria padre;

    public Categoria() {}

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
        this.sucursal = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Categoria getPadre() {
        return padre;
    }

    public void setPadre(Categoria padre) {
        this.padre = padre;
    }

    public ArrayList<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(ArrayList<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public void agregarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
        subcategoria.setPadre(this);
    }
}
