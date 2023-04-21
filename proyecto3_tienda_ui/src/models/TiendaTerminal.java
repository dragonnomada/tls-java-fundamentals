package models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TiendaTerminal extends Tienda {

    Scanner scanner;
    ArrayList<Venta> ventas;
    Venta ventaActual;

    public TiendaTerminal(Scanner scanner) {
        this.scanner = scanner;
        this.ventas = new ArrayList<>();
    }

    public void mostrarMenuTienda() {
        System.out.println("-------------- Menú Tienda -------------");
        System.out.println("1. Generar reporte");
        System.out.println("2. Agregar producto");
        System.out.println("3. Buscar Productos por nombre");
        System.out.println("4. Buscar Productos por rango de precio");
        System.out.println("5. Crear venta");
        System.out.println("----------------------------------------");
        System.out.println("0. Salir");

        int opcion = getOpcion();

        switch (opcion) {
            case 1:
                opcionGenerarReporte();
                break;
            case 2:
                opcionAgregarProducto();
                break;
            case 3:
                opcionBuscarProductosPorNombre();
                break;
            case 4:
                opcionBuscarProductosPorRangoPrecios();
                break;
            case 5:
                opcionCrearVenta();
                break;
            case 0:
                opcionSalir();
                break;
            default:
                opcionNoValida();
                break;
        }
    }

    private void opcionCrearVenta() {
        Random random = new Random();
        this.ventaActual = new Venta(random.nextLong(), this);
        mostrarMenuVenta();
    }

    public void mostrarMenuVenta() {
        System.out.println("--------------- Menú Venta --------------");
        System.out.println("1. Agregar Producto a Venta");
        System.out.println("2. Mostrar total");
        System.out.println("3. Pagar");
        System.out.println("4. Cancelar");
        System.out.println("5. Reimprimir Ticket");
        System.out.println("----------------------------------------");
        System.out.println("0. Regresar");

        int opcion = getOpcion();

        switch (opcion) {
            case 1:
                try {
                    System.out.print("Producto ID: ");
                    long productoId = this.scanner.nextLong();
                    this.ventaActual.registrarProducto(productoId);
                    System.out.printf("Producto %d registrado %n", productoId);
                } catch (Exception e) {
                    System.out.println("No se pudo registrar el producto a la venta");
                }
                this.mostrarMenuVenta();
                break;
            case 2:
                System.out.printf("Total: $%6.2f %n", this.ventaActual.getTotal());
                this.mostrarMenuVenta();
                break;
            case 3:
                try {
                    System.out.printf("Total: $%6.2f %n", this.ventaActual.getTotal());
                    System.out.print("Ingresa el monto a pagar $: ");
                    double monto = this.scanner.nextDouble();
                    double cambio = this.ventaActual.pagar(monto);
                    System.out.printf("Cambio $%6.2f %n", cambio);
                    System.out.println("Venta pagada");
                    this.ventas.add(this.ventaActual);
                } catch (Exception e) {
                    System.out.println("El pago no pudo ser realizado");
                }
                this.mostrarMenuVenta();
                break;
            case 4:
                this.ventaActual.cancelar();
                System.out.println("La venta ha sido cancelada");
                this.mostrarMenuVenta();
                break;
            case 5:
                System.out.println(this.ventaActual.generarTicket());
                this.mostrarMenuVenta();
                break;
            case 0:
                System.out.println("Regresando al menú principal");
                this.mostrarMenuTienda();
                break;
            default:
                System.out.println("Opción no válida");
                this.mostrarMenuVenta();
                break;
        }
    }

    private int getOpcion() {
        System.out.print("Ingresa la opción: ");
        int opcion = -1;

        try {
            opcion = this.scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("La opción tiene errores");
        }

        this.scanner.nextLine();
        return opcion;
    }

    private void opcionNoValida() {
        System.out.println("Opción no válida");
        this.mostrarMenuTienda();
    }

    private static void opcionSalir() {
        System.out.println("Adiós 👋");
    }

    private void opcionBuscarProductosPorRangoPrecios() {
        System.out.print("Buscar el producto por rango de precios (min max): ");
        double precioMinimo = this.scanner.nextDouble();
        double precioMaximo = this.scanner.nextDouble();
        this.scanner.nextLine();
        Producto[] productosEncontrados = buscarProductos(precioMinimo, precioMaximo);
        for (Producto productoEncontrado : productosEncontrados) {
            System.out.printf("%4d. %-20s $%8.2f (Existencias: %3d)%n",
                    productoEncontrado.getId(),
                    productoEncontrado.getNombre(),
                    productoEncontrado.getPrecio(),
                    productoEncontrado.getExistencias());
        }
        this.mostrarMenuTienda();
    }

    private void opcionBuscarProductosPorNombre() {
        System.out.print("Buscar nombre del producto: ");
        String nombreBuscar = scanner.nextLine();
        Producto[] productosEncontrados = super.buscarProductos(nombreBuscar);
        for (Producto productoEncontrado : productosEncontrados) {
            System.out.printf("%4d. %-20s $%8.2f (Existencias: %3d)%n",
                    productoEncontrado.getId(),
                    productoEncontrado.getNombre(),
                    productoEncontrado.getPrecio(),
                    productoEncontrado.getExistencias());
        }
        this.mostrarMenuTienda();
    }

    private void opcionAgregarProducto() {
        try {
            System.out.print("Producto ID: ");
            long productoId = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Producto Nombre: ");
            String productoNombre = scanner.nextLine();
            System.out.print("Producto Precio $: ");
            double productoPrecio = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Producto Existencias: ");
            int productoExistencias = scanner.nextInt();
            scanner.nextLine();
            Producto producto = new Producto(productoId,
                    productoNombre, productoPrecio, productoExistencias);
            agregarProducto(producto);
            System.out.printf("Producto %4d agregado %n", producto.getId());
        } catch (Exception e) {
            System.out.println("Error al capturar el producto");
            scanner.nextLine();
        }
        this.mostrarMenuTienda();
    }

    private void opcionGenerarReporte() {
        System.out.println(generarReporte());
        this.mostrarMenuTienda();
    }
}
