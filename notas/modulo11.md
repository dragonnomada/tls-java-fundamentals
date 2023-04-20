# Módulo 11

## Uso de herencia

La herencia se entiende como extender diseños, es decir,
la capacidad de que a partir de una clase, podamos formar 
nuevas clases derivadas que poseen los mismos atributos y métodos 
para poder extender nueva funcionalidad o reemplazar 
funcionalidad previa.

> Ejemplo de una clase `Producto`

```java
public class Producto {
    
    long id;
    String nombre;
    double price;
    int existencias;
    
    // ... constructores
    
    // ... getters y setters
    
    // toString()
    
    // ... métodos
    
    public double calcularValor() {
        return this.price * this.existencias;
    }
    
}
```

> Ejemplo de una clase `ProductoFactura`

```java
public class ProductoFactura extends Producto {
    
    // ... atributos de Producto (id, nombre, precio, existencias)
    
    double iva;
    double isrRetenido;
    double ivaRetenido;
    double ieps;
    
    // ... métodos de Producto (calcularValor(), ...)
    
    public double getPrecioConImpuestos() {
        return this.precio * (1.0 + iva - isrRetenido - iva + ieps);
    }
    
}
```

## Visión general de la herencia

La herencia se da a través de una `superclase`, es decir, la clase a extender.
Y una `subclase`, es decir, la clase extendida de la `superclase`.

Todos los atributos y métodos de la `superclase` serán extendidos
a la `subclase`. Es decir, la `subclase` posee todos los atributos
y métodos de la `superclase`, más los atributos y métodos nuevos
que sean definidos en la `subclase`.

Habla de una `subclase` es como hablar de `superclase`, pero
advirtiendo que están disponibles nuevos atributos y métodos
o se reemplazará algún método por nueva funcionalidad.

## Trabajar con subclases y superclases

La `superclase` diseña una funcionalidad específica, la cual
hace que la clase sea funcional y utilizable, pero quizás limita
a lo que se pensó en ese momento.

Por ejemplo, cuando diseñamos nuestro negocio, quizás no teníamos
la necesidad de vender línea, por lo que todas las clases suponían
pagos en efectivo. Pero ahora, el negocio debe adaptarse a la venta
en línea y extender nuevas funcionalidades a las clases. Por ejemplo,
tomar la clase `Venta` y generar la clase `VentaEnLinea`.

Generalmente la herencia busca mantener el código anterior que ya es
funcional y dejarlo intacto, y corregir o aumentar funcionalidades
a partir de nuevas clases extendidas. Cómo si se tratara de un proceso
evolutivo, dónde las clases van evolucionando y adaptándose a nuevas
circunstancias.

> Ejemplo de la clase `Robot2D`

```java
public class Robot2D {
    int x;
    int y;

    public void avanzarNorte() {
        this.y++;
    }

    public void avanzarSur() {
        this.y--;
    }

    public void avanzarEste() {
        this.x++;
    }

    public void avanzarOeste() {
        this.x--;
    }

    @Override
    public String toString() {
        return "Robot2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
```

> Ejemplo de la clase `Robot2E`

```java
public class Robot2E extends Robot2D {
    
    String nombre = "SIN NOMBRE";
    boolean encendido = false;
    
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void encender() {
        this.encendido = true;
    }
    
    public void apagar() {
        this.encendido = false;
    }
    
    @Override
    public void avanzarNorte() {
        if (this.encendido) {
            // Llama al método definido en la clase superior
            // Es decir, de la superclase invoca ese método
            super.avanzarNorte();
        }
    }
    
    @Override
    public void avanzarSur() {
        if (this.encendido) {
            super.avanzarSur();
        }
    }

    @Override
    public void avanzarEste() {
        if (this.encendido) {
            super.avanzarEste();
        }
    }

    @Override
    public void avanzarOeste() {
        if (this.encendido) {
            super.avanzarOeste();
        }
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.encendido + " "
                + super.toString().replace("Robot2D", "Robot2E");
    }
    
}
```

## Sustitución de métodos en la superclase

La `superclase` contiene diferentes atributos y métodos, los cuales pueden ser extendidos
o reemplazados por una `subclase`.

Los atributos no pueden ser reemplazados ni suprimidos, pero los métodos si pueden
reemplazarse o marcarlos como obsoletos (`@Deprecated`), esto significa que no se recomienda
seguir utilizando ese método, pero no se suprime para no romper el diseño.

Los métodos de la subclase pueden ser extendidos, por ejemplo, podríamos generar
sobrecargas con diferentes parámetros o reemplazados (sustituidos) por nueva
funcionalidad. Sin embargo, aún siendo reemplazados podríamos utilizar los métodos
originales a través de `super`.

La palabra reservada `super` hacer referencia al `this` de la `superclase`,
lo que significa, que todos los atributos y métodos pueden ser accedidos
mediante `super`.

Los métodos pueden ser reemplazados dentro de la `subclase` anotando
el método a reemplazar con la decoración `@Override`

> Ejemplo de la clase `Numeros`

```java
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

    ArrayList<Integer> valores;

    public Numeros(int[] datos) {
        this.valores = new ArrayList<>();
        for (int valor : datos) {
            this.valores.add(valor);
        }
    }

    public Numeros(File file) throws FileNotFoundException {
        this.valores = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            int valor = scanner.nextInt();
            this.valores.add(valor);
        }
    }
    
    public int get(int i) {
        return this.valores.get(i);
    }
    
    public void set(int i, int valor) {
        this.valores.set(i, valor);
    }
    
    public boolean comprobarTodosEnRango(int minimo, int maximo) {
        for (int valor : this.valores) {
            if (valor <= minimo && valor >= maximo) {
                return false;
            }
        }
        return true;
    }

}
```

> Ejemplo la clase `NumerosPro`

```java
public class NumerosPro extends Numeros {
    
    public int getMaxValor() {
        int maximo = Integer.MIN_VALUE;
        for (int valor : super.valores) {
            if (valor > maximo) {
                maximo = valor;
            }
        }
        return maximo;
    }
    
    @Override
    public boolean comprobarTodosEnRango(int minimo, int maximo) {
        return this.valores.stream().filter((valor) -> {
           return valor >= minimo && valor <= maximo; 
        }).count() == this.valores.size();
    }
    
}
```

## Introducción al polimorfismo

El polimorfismo se refiere a la capacidad de que una clase adquiera múltiples 
formas.

Esto quiere decir que una `subclase` se puede comportar como una `superclase`.

> Ejemplo de la `superclase` llamada `Producto` y la `subclase` llamada
> `ProductoFacturacion`

```java
public class ReportadorProductos {
    
    public double calcularPrecioTotal(Producto[] productos) {
        double total = 0.0;
        for (Producto producto : productos) {
            total = total + producto.getPrecio();
        }
        return total;
    } 
    
    // ... más métodos
    
}
```

> Ejemplo la clase `ReporteProductosTest` genera un reporte de diversos productos

```java
import java.util.ArrayList;

public class ReporteProductosTest {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<Producto>();
        
        productos.add( new Producto(123, "Coca cola", 17.5) );
        productos.add( new Producto(456, "Pepsi", 16.5) );
        productos.add( new Producto(789, "Gansito", 20.5) );
        productos.add( new ProductoFacturacion(555, "Red Cola", 17.4, "RX567", 0.034) );
        productos.add( new ProductoFacturacion(667, "Galletas", 9.99, "JH95F", 0.045) );
        
        // Producto -> superclase
        // ProductoFacturacion -> subclase
        //Producto producto = new Producto(...);
        //Producto producto = new ProductoFacturacion(...);

        ReportadorProductos reportador = new ReportadorProductos();
        
        double total = reportador.calcularTotalPrecios(productos.toArray());

        System.out.printf("El precio total es: $%.2f %n", total);
        
    }

}
```

## Creación y ampliación de clases abstractas

Existe un tipo de clases especiales llamadas clases abstractas,
las cuales no pueden ser instanciadas y su propósito es ser derivadas
en `subclases`.

Es decir, las clases abstractas funcionan como `superclases` cascarón,
que contienen parte de la lógica que debería ser implementada en
una `subclase`.

    SINTAXIS: Definición de una clase abstracta

    public abstract class U {

        // ... atributos predefinidos

        // ... constructores requeridos

        // ... métodos predefinidos

    }

A diferencia de las clases normales, las clases abstractas marcarán
la palabra reservada `abstract` antes de la palabra reservada `class`
indicando así que se trata de una clase que es abstracta y necesita
forzosamente ser extendida en otra clase.

> Ejemplo de una clase abstracta llamada `Figura`

```java
public abstract class Figura {
    
    int numeroLados;
    
    // El método tiene que ser implementado
    public abstract double area();
    
    // El método puede o no ser reemplazado o utilizado tal cual
    public void describir() {
        System.out.printf("La figura tiene %d lados %n", this.numeroLados);
        System.out.printf("El área de la figura es %.2f %n", this.area());
    }
    
}
```

Las clases abstractas pueden definir dos tipos de métodos:

1. `Método abstracto` - Este no contendrá ninguna implementación, en su lugar usará punto y coma (`;`)
2. `Método tradicional` - Este contendrá una implementación por defecto que podrá usarse así o ser reemplazada

Las clases abstractas permiten contener métodos tradicionales suponiendo que los otros métodos
abstractos indicados quedaron bien implementados.

Es decir, un método abstracto deberá ser reemplazado en la `subclase` que extiende de la clase
abstracta, y un método tradicional marcado en la clase abstracta podrá consumirse tal cual o
ser reemplazado.

> Ejemplo de la clase `Triangulo` que extiende de `Figura`

```java
public class Triangulo extends Figura {
    
    double s1;
    double s2;
    double s3;
    
    // Estamos obligados a implementar el método abstracto: public abstract double area()
    @Override
    public double area() {
        double m = (s1 + s2 + s3) / 2;
        return Math.sqrt(m * (m - s1) * (m - s2) * (m - s3));
    }
    
    // No es necesario implementar el método tradicional: public void describir()
    
}
```

No podemos crear una instancia de la clase `Figura`, es decir,
`Figura figura = new Figura()` producirá error, pero `Triangulo triangulo = new Triangulo()`
funcionará bien. Y por polimorfismo podríamos tener `Figura figura = new Triangulo()`.