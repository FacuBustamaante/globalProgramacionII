package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Declaro empresa, sucursal y direccion
        Empresa e = new Empresa("Buen Sabor", "PYME",123546789);

        Pais p1 = new Pais("Argentina");
        Provincia pr1= new Provincia("Mendoza");
        pr1.setPais(p1);
        Localidad l1 = new Localidad("Guaymallen");
        l1.setProvincia(pr1);
        Domicilio d1 = new Domicilio("Gutierrez", 1000, 5519);
        d1.setLocalidad(l1);

        Sucursal s1 = new Sucursal("Buen Sabor Guaymallen", LocalTime.of(8,00), LocalTime.of(20,00));
        s1.setDomicilio(d1);
        s1.setEmpresa(e);

        //Declaro un articulo, con sudetalle e insumo
        ArticuloManufacturado am1 = new ArticuloManufacturado("Helado", 5000.00, "Helado de chocolate", 180, "Mezcle los ingredientes y refrigere");
        ArticuloManufacturadoDetalle amd1 = new ArticuloManufacturadoDetalle(100);
        ArticuloInsumo ai1 = new ArticuloInsumo("Helado", 2000.00, 55, 200, false);
        amd1.setArticuloInsumo(ai1);

        UnidadMedida u1 = new UnidadMedida("cm3");

        am1.setUnidadMedida(u1);
        ai1.setUnidadMedida(u1);

        //Creo una promocion

        Promocion prom1 = new Promocion("descuento",
                LocalDate.of(2025,5,20),
                LocalDate.of(2025,6,20),
                LocalTime.of(8,00), LocalTime.of(20,00),
                "50%",
                100.00,
                TipoPromocion.PROMOCION1);
        prom1.setArticulos(ai1);

        //Imagen
        Imagen img1 = new Imagen("Foto Helado de Chocolate");
        prom1.setImagenes(img1);

        //Categoria
        Categoria cpadre = new Categoria("Alimento");
        Categoria c1 = new Categoria("Heladeo");
        c1.setPadre(cpadre);

        s1.agregarCategorias(c1);
        ai1.agregarCategoria(c1);
        am1.agregarCategoria(c1);

        //Cliente

        Usuario user1 = new Usuario("0001","AmoLosHelados");
        Imagen img2 = new Imagen("Foto de perfil");

        Cliente cliente1 = new Cliente("Juan", "Garcia","2612512216","juan@example.com", LocalDate.of(1999,9,30));
        cliente1.setImagen(img2);
        cliente1.setUsuario(user1);
        //Cliente comparte domicilio con heladeria
        cliente1.agregarDomicilios(d1);


        //Pedido
        Pedido pedido1 = new Pedido(LocalTime.of(10,30),
                200.00,
                100.00,
                Estado.PREPARACION,
                TipoEnvio.DELIVERY,
                FormaPago.MERCADOPAGO,
                LocalDate.of(2025,5,20));

        DetallePedido detalle1 = new DetallePedido(2,200.00, ai1);
        Factura factura1 = new Factura(LocalDate.of(2025,5,20), 123456, 654321, "123132", "dinero_cuenta",FormaPago.MERCADOPAGO, 200.00);
        factura1.setPedido(pedido1);


        pedido1.setFactura(factura1);
        pedido1.agregarDetallesPedido(detalle1);
        pedido1.setDomicilio(d1);
        pedido1.setSucursal(s1);

        cliente1.agregarPedidos(pedido1);
    }

}
