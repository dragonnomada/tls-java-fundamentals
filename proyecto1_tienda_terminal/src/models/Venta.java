package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {

    long id;
    Tienda tienda;
    ArrayList<Producto> productos;
    LocalDateTime fechaAbierto;
    LocalDateTime fechaCerrado;
    double total;
    boolean estaPagado;
    boolean estaCompletado;
    boolean estaCancelado;

    public Venta(long id, Tienda tienda) {
        this.id = id;
        this.tienda = tienda;
        this.productos = new ArrayList<>();
        this.fechaAbierto = LocalDateTime.now();
        this.fechaCerrado = null;
        this.total = 0.0;
        this.estaPagado = false;
        this.estaCompletado = false;
        this.estaCancelado = false;
    }

    public void registrarProducto(long productoId) {
        Producto producto = this.tienda.buscarProducto(productoId);
        if (producto != null) {
            this.productos.add(producto);
            this.calcularTotal();
        }
    }

    public void calcularTotal() {
        this.total = 0.0;
        for (Producto producto : this.productos) {
            this.total = this.total + producto.getPrecio();
            // total += producto.getPrecio();
        }
    }

    public double pagar(double monto) {
        if (monto >= this.total) {
            double cambio = monto - this.total;
            this.estaPagado = true;
            this.estaCompletado = true;
            return cambio;
        } else {
            return monto;
        }
    }

    public void cancelar() {
        this.estaCancelado = true;
        this.estaCompletado = true;
    }

    public String generarTicket() {
        StringBuilder builder = new StringBuilder();

        builder.append("==============================\n");
        builder.append("------- TICKET %04d ------\n");
        builder.append(String.format("CREADO: %s CERRADO: %s %n",
                this.fechaAbierto, this.fechaCerrado));
        builder.append("------------------------------\n");
        if (this.estaCompletado) {
            builder.append(String.format("COMPLETADO %n"));
        } else {
            builder.append(String.format("NO COMPLETADO %n"));
        }
        if (this.estaPagado) {
            builder.append(String.format("PAGADO %n"));
        } else {
            builder.append(String.format("NO PAGADO %n"));
        }
        if (this.estaCancelado) {
            builder.append(String.format("CANCELADO %n"));
        }
        builder.append("------------------------------\n");
        for (Producto producto : this.productos) {
            builder.append(String.format("%10s $%6.2f%n",
                    producto.getNombre(), producto.getPrecio()));
        }
        builder.append("------------------------------\n");
        builder.append(String.format("TOTAL: %8.2f%n", this.total));
        builder.append("------------------------------\n");
        builder.append("==============================\n");

        return builder.toString();
    }

}
