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

}
