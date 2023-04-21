package models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TiendaTerminal extends Tienda {

    Scanner scanner;

    ArrayList<Venta> ventas;

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

        System.out.print("Ingresa la opción: ");
        int opcion = -1;

        try {
            opcion = this.scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("La opción tiene errores");
        }
        this.scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println(super.generarReporte());
                this.mostrarMenuTienda();
                break;
            case 2:
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
                    super.agregarProducto(producto);
                    System.out.printf("Producto %4d agregado %n", producto.getId());
                } catch (Exception e) {
                    System.out.println("Error al capturar el producto");
                    scanner.nextLine();
                }
                this.mostrarMenuTienda();
                break;
            case 3:
                System.out.print("Buscar nombre del producto: ");
                String nombreBuscar = scanner.nextLine();
                Producto[] productosEncontrados = super.buscarProductos(nombreBuscar);
                for (Producto productoEncontrado : productosEncontrados) {
                    System.out.printf("%4d. %20s $%8.2f (Existencias: %3d)%n",
                            productoEncontrado.getId(),
                            productoEncontrado.getNombre(),
                            productoEncontrado.getPrecio(),
                            productoEncontrado.getExistencias());
                }
                this.mostrarMenuTienda();
                break;
            case 4:
                //
                break;
            case 5:
                //
                break;
            case 0:
                System.out.println("Adiós 👋");
                break;
            default:
                System.out.println("Opción no válida");
                this.mostrarMenuTienda();
                break;
        }
    }
}
