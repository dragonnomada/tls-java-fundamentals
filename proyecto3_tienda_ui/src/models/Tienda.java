package models;

import java.util.ArrayList;

public class Tienda {

    protected ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public Producto buscarProducto(long id) {
        for (Producto producto : this.productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : this.productos) {
            if (producto.getNombre().contains(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public Producto[] buscarProductos(String nombre) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getNombre().contains(nombre)) {
                productosEncontrados.add(producto);
            }
        }
        return productosEncontrados.toArray(new Producto[0]);
        //return productosEncontrados.toArray(Producto[]::new);
    }

    public Producto[] buscarProductos(double minPrecio, double maxPrecio) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getPrecio() >= minPrecio &&
                    producto.getPrecio() <= maxPrecio) {
                productosEncontrados.add(producto);
            }
        }
        return productosEncontrados.toArray(new Producto[0]);
        //return productosEncontrados.toArray(Producto[]::new);
    }

    public String generarReporte() {
        StringBuilder builder = new StringBuilder();

        builder.append("========================================\n");
        builder.append("------------ Reporte Tienda ------------\n");
        builder.append(String.format("Productos (%d) %n",
                this.productos.size()));
        builder.append("----------------------------------------\n");

        if (productos.size() == 0) {
            builder.append("No hay productos.\n");
        } else {
            builder.append("ID    NOMBRE               PRECIO   EXI\n");
        }

        for (Producto producto : this.productos) {
            builder.append(String.format("%4d. %-20s $%8.2f %3d%n",
                    producto.getId(), producto.getNombre(),
                    producto.getPrecio(), producto.getExistencias()));
        }

        builder.append("----------------------------------------\n");
        builder.append("========================================\n");

        return builder.toString();
    }

}
