package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import Enums.TipoPromocion;
import data.IUsuarioDAO;
import data.UsuarioDAO;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Empresa
        Empresa empresa = Empresa.builder()
                .nombre("Empresa 1")
                .razonSocial("EmpresaFalsa")
                .cuil(27384712)
                .build();

        Sucursal sucursalPalmares = Sucursal.builder()
                .nombre("Sucursal Palmares")
                .horarioApertura(LocalTime.of(8, 30))
                .horarioCierre(LocalTime.of(16,30))
                .build();

        //Sucursales
        Sucursal sucursalGodoyCruz = Sucursal.builder()
                .nombre("Sucursal Godoy Cruz")
                .horarioApertura(LocalTime.of(8, 30))
                .horarioCierre(LocalTime.of(16,30))
                .build();

        //Domicilios
        Domicilio domicilioGodoyCruz = Domicilio.builder()
                        .calle("Calle 1")
                        .numero(16)
                        .cp(5500)
                        .build();

        Domicilio domicilioPalmares = Domicilio.builder()
                .calle("Calle 2")
                .numero(25)
                .cp(5500)
                .build();

        Domicilio domicilioCliente = Domicilio.builder()
                .calle("Calle 45")
                .numero(230)
                .cp(5539)
                .build();

        //Pais
        Pais pais = new Pais("Argentina");

        //Provincia
        Provincia provincia = Provincia.builder()
                .nombre("Mendoza")
                .build();
        provincia.setPais(pais);

        //Localidades
        Localidad godoyCruz = Localidad.builder()
                .nombre("Godoy Cruz")
                .build();
        godoyCruz.setProvincia(provincia);

        Localidad palmares = Localidad.builder()
                .nombre("Palmares")
                .build();
        palmares.setProvincia(provincia);

        //ArticuloManufacturado
        ArticuloManufacturado manufacturado = ArticuloManufacturado.builder()
                .descripcion("En preparacion")
                .tiempoEstimadoMinutos(35)
                .preparacion("Manual")
                .build();

        //ArticuloManufacturadoDetalle
        ArticuloManufacturadoDetalle manufacturadoDetalle = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .build();
        manufacturadoDetalle.setArticuloManufacturado(manufacturado);

        //Articulos
        ArticuloInsumo articuloLimpieza = ArticuloInsumo.builder()
                .denominacion("Detergente")
                .precioVenta(4500.0)
                .precioCompra(3500.0)
                .stockActual(12)
                .stockMaximo(30)
                .esParaElaborar(false)
                .build();
        articuloLimpieza.agregarArticuloManufacturadoDetalle(manufacturadoDetalle);

        ArticuloInsumo articuloAlmacen = ArticuloInsumo.builder()
                .build();

        //Detalle Pedido
        DetallePedido detallePedido = DetallePedido.builder()
                .cantidad(15)
                .subTotal(10500)
                .build();
                //Articulo

        //Pedidos
        Pedido pedido1 = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(14,0))
                .total(50000)
                .totalCosto(35000)
                .fechaPedido(LocalDate.of(2025, 2, 12))
                .estado(Estado.PENDIENTE)
                .formaPago(FormaPago.MERCADOPAGO)
                .tipoEnvio(TipoEnvio.DELIVERY)
                .build();
        pedido1.setDomicilio(domicilioCliente);

        //Factura
        Factura factura1 = Factura.builder()
                .fechaFacturacion(LocalDate.of(2025,02,1))
                .mpPaymentId(2931)
                .mpMerchantOrderId(9586)
                .mpPreferenceId("ja287f")
                .mpPaymentType("Tarjeta")
                .totalVenta(150000.0)
                .formaPago(FormaPago.MERCADOPAGO)
                .build();
        factura1.setPedido(pedido1);

        //Imagenes
        Imagen imagenUsuario = Imagen.builder()
                .denominacion("foto de perfil")
                .build();
        Imagen imagenArticulo = Imagen.builder()
                .denominacion("foto del articulo")
                .build();

        //Usuario
        Usuario usuarioAdmin = Usuario.builder()
                .auth0Id("ao2s24kjg81")
                .username("Facu22")
                .build();

        //Clientes
        Cliente cliente1 = Cliente.builder()
                        .nombre("Facundo")
                        .apellido("Bustamante")
                        .telefono("85736214")
                        .email("correo@correo.com")
                        .fechaNacimiento(LocalDate.of(1996, 12, 22))
                        //imagen, domicilio
                        .build();
        cliente1.setUsuario(usuarioAdmin);
        cliente1.agregarDomicilio(domicilioCliente);
        cliente1.setImagen(imagenUsuario);

        //Categorias
        Categoria categoriaLimpieza = Categoria.builder()
                .denominacion("Limpieza")
                .build();
                //articulos

        Categoria categoriaAlmacen = Categoria.builder()
                .denominacion("Almacen")
                .build();
                //articulos

        //Promociones
        Promocion promocion1 = Promocion.builder()
                .denominacion("Hot Sale")
                        .fechaDesde(LocalDate.of(2025,1,1))
                        .fechaHasta(LocalDate.of(2025,2,1))
                        .fechaDesdeHora(LocalTime.of(8,30))
                        .fechaHastaHora(LocalTime.of(12,30))
                        .descripcionDescuento("15% off")
                        .precioPromocional(30000.0)
                        .tipoPromocion(TipoPromocion.PROMOCION1)
                        .build();
        promocion1.agregarImagen(imagenUsuario);


        //Asignaciones
        domicilioGodoyCruz.setLocalidad(godoyCruz);
        sucursalGodoyCruz.setDomicilio(domicilioGodoyCruz);
        domicilioPalmares.setLocalidad(palmares);
        sucursalPalmares.setDomicilio(domicilioPalmares);
        domicilioCliente.setLocalidad(palmares);
        sucursalPalmares.agregarPedido(pedido1);
        pedido1.agregarDetallesPedido(detallePedido);
        empresa.agregarSucursal(sucursalPalmares);
        empresa.agregarSucursal(sucursalGodoyCruz);
        sucursalPalmares.agregarCategoria(categoriaLimpieza);
        sucursalPalmares.agregarCategoria(categoriaAlmacen);
        sucursalPalmares.agregarPromocion(promocion1);
        categoriaLimpieza.agregarArticulo(articuloLimpieza);
        detallePedido.setArticulo(articuloLimpieza);

        //Visualización
        System.out.println("----------------SUCURSALES-----------------");
        System.out.println(empresa.getSucursales());

        System.out.println("----------------USUARIOS-----------------");
        System.out.println(usuarioAdmin);

        System.out.println("----------------FACTURA-----------------");
        System.out.println(factura1);

        //Conexión a base de datos local con la clase Usuario
        //Agregar usuario
        IUsuarioDAO UsuaruarioDAO = new UsuarioDAO();
        boolean usuario_agregado = UsuaruarioDAO.agregarUsuario(usuarioAdmin);

        if (usuario_agregado){
            System.out.println("Se agrego el usuario correctamente");
        }else {
            System.out.println("No se pudo agregar el usuario");
        }
        
    }
}
