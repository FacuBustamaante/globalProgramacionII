package Entities;

public class ArticuloManufacturadoDetalle extends Base {
    private int cantidad;

    public ArticuloManufacturadoDetalle() {}

    public ArticuloManufacturadoDetalle(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
