# Módulo 12

## Uso de interfaces

Las interfaces son prototipos usados para abstraer funcionalidades.

Consisten en un conjunto de métodos no implementados, los cuales podrían
ser implementados por una clase.

Por ejemplo, una interfaz `IDescribible` contiene un método `void describir()`,
entonces, todas las clases que tengan un método `void describir()` podrán
adaptarse a esta interfaz.

Las interfaces funcionan como estereotipos, para agrupar a todas las clases
que poseen funcionalidad común y no depender de clases, sino de interfaces.

    SINTAXIS: Definición de una interfaz

    public interface I {

        T1 metodo1(<parámetros ...>);
        T2 metodo2(<parámetros ...>);
        T3 metodo3(<parámetros ...>);
        Tn metodoN(<parámetros ...>);

    }

    SINTAXIS: Implementación de una interfaz en una clase

    public class U implements I {

        T1 metodo1(<parámetros ...>) {
            // ... código implementado para el método1
        }
        T2 metodo2(<parámetros ...>) {
            // ... código implementado para el método2
        }
        T3 metodo3(<parámetros ...>) {
            // ... código implementado para el método3
        }
        Tn metodoN(<parámetros ...>) {
            // ... código implementado para el métodoN
        }

    }

Por ejemplo, una clase de ventas se basa en la interfaz `IPagable`,
la cual contiene los métodos `String getDescripcion()` y `double getMonto()`.
Así, todas las clases que tengan un método `String getDescripcion()` y 
un método `double getMonto()` podrán comportarse como esa interfaz.

Veamos el ejemplo más a detalle.

> Ejemplo de la interfaz `IPagable`

```java
public interface IPagable {
    
    String getDescripcion();
    double getPrecio();
    
}
```

> Ejemplo de la clase `Producto` que implementa la interfaz `IPagable`

```java
public class Producto implements IPagable {
    
    long id;
    String nombre;
    double precio;
    int existencias;
    
    public String getDescripcion() {
        return "Producto: " + this.nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    // ... otros métodos y demás
    
}
```

> Ejemplo de la clase `Libro` que implementa la interfaz `IPagable`

```java
import java.time.LocalDate;

public class Libro implements IPagable {

    String titulo;
    String autor;
    LocalDate fechaLanzamiento;

    public String getDescripcion() {
        return this.titulo + " - " + this.autor + " (" + this.fechaLanzamiento.getYear() + ")";
    }

    public double getPrecio() {
        return 9.99;
    }

    // ... otros métodos y demás

}
```

Podemos observar que ambas clases `Producto` y `Libro` implementan la interfaz `IPagable`.

Esto significa que ambas clases aunque diferentes tienen los métodos de IPagable en común.

Por polimorfismo esto significa que podemos suponer transformar un `Producto` en un `IPagable`
y un `Libro` en un `IPagable`.

    EJEMPLO:

    IPagable item1 = new Producto(...);
    IPagable item2 = new Libro(...);
    IPagable item3 = new Producto(...);
    ...

    System.out.println(item1.getDescripcion());
    System.out.println(item1.getPrecio());
    System.out.println(item1.getTitulo()); // ERROR: Sólo podemos consumir los métodos de la interfaz

## Polimorfismo en clases de fundación de JDK

## Uso de la interfaz List

## Introducción a las expresiones lambda