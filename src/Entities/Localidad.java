package Entities;

public class Localidad extends Base {
    private String nombre;
    private Provincia provincia;

    public Localidad() {}

    public Localidad(String nombre) {
        this.nombre = nombre;
        this.provincia = provincia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
