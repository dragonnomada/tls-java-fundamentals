package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Venta {

    long id;
    Tienda tienda;
    ArrayList<Producto> productos;
    LocalDate fechaAbierto;
    LocalTime fechaCerrado;
    double total;
    boolean estaPagado;
    boolean estaCompletado;

}
