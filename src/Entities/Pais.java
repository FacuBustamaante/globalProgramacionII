package Entities;

public class Pais extends Base{
    private String nombre;

    public Pais(){}

    public Pais(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {}
}
