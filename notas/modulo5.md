# Módulo 5

## Descripción de objetos y clases

Una clase es un conjunto de `ATRIBUTOS` y `MÉTODOS`.

Los atributos dentro de una clase representan el estado que deberá retener el objeto. 
Por ejemplo, podemos pensar en una clase que diseña un cliente. 
¿Qué atributos o campos debería tener el cliente? Un `id` de tipo entero,
un `nombre` de tipo texto, una `direccion1` de tipo texto, una `direccion2`
de tipo texto, un `estaActivo` de tipo lógico y así sucesivamente.

> El atributo resuelve: Qué contiene el objeto

Los métodos dentro de una clase representan las acciones que deberá hacer el objeto.
Por ejemplo, podemos pensar en una clase que diseña una venta.
¿Qué métodos u operaciones debería tener la venta? 
Un `agregarProducto(Producto producto)`, un `quitarProducto(long productoId)`,
un `calcularTotalVenta()`, un `pagarEnEfectivo(double cantidad)`,
un `asignarVendedor(long empleadoId)`, un `asignarCliente(long clienteId)`,
y así sucesivamente.

> El método resuelve: Qué hace el objeto

El objeto es una variable que retiene el contexto creado por una clase.

El objeto es considerado como la memoria viva de una clase. Es decir,
cuándo creamos (instanciamos) un objeto, este va a crear un contexto de memoria
para retener todos los atributos y acceder a los métodos definidos por
la clase.

El objeto dentro de la clase suele ser accedido mediante `this`. Es decir,
la palabra reservada `this` se refiere a la instancia de la clase,
dentro de la misma clase.

A la instancia fuera la clase, se accede mediante la variable asignada. 
A eso se le conoce como referencias al objeto. Es decir, el objeto nunca es
manipulado directamente, sino, que se crea una referencia mediante `this` o
la varible de instanciación.

> Los objetos son almacenados en memoria y accedidos a través
> de referencias. Una referencia interna dentro de la clase
> se hace mediante `this`. Y una referencia externa fuera
> de la clase (por ejemplo, en otra clase o en un `main`)
> se hace mediante la variable de tipo `T` dónde `T` es la clase.

## Trabajar con objetos y clases

Las clases representan modelos de datos con acciones 
determinadas, generalmente se usan para representar
objetos del mundo real en una forma abstracta.

> Ejemplo de una clase `Reloj` capaz de indicar
> el tiempo transcurrido en segundos, minutos y horas.

```java
public class Reloj {

    int segundos = 0;
    int minutos = 0;
    int horas = 0;

    void avanzarSegundos() {
        this.segundos = this.segundos + 1;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.avanzarMinutos();
        }
    }

    void avanzarMinutos() {
        this.minutos = this.minutos + 1;
        if (this.minutos == 60) {
            this.minutos = 0;
            this.avanzarHoras();
        }
    }

    void avanzarHoras() {
        this.horas = this.horas + 1;
    }

    void mostrarPantalla() {
        System.out.printf("%02d:%02d:%02d%n", this.horas, this.minutos, this.segundos);
    }

}
```

> Ejemplo de una clase `RelojTest` que tiene un método principal que crea una
> instancia de la clase `Reloj` y avanza los segundos manualmente
> y también mediante un cliclo `while (true)` usando un `Thread.sleep(milis)
> para avanzar un segundo y esperar `1000 milisegundos` para otra vez avanzar.

```java
public class RelojTest {

    public static void main(String[] args) {

        Reloj reloj = new Reloj();

        reloj.mostrarPantalla(); // 00:00:00

        reloj.avanzarSegundos();
        reloj.avanzarSegundos();
        reloj.avanzarSegundos();
        reloj.avanzarSegundos();
        reloj.avanzarSegundos();

        reloj.mostrarPantalla(); // 00:00:05

        while (true) {
            reloj.avanzarSegundos();
            reloj.mostrarPantalla();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
```

## Definición de campos y métodos

Los *campos* son atributos sobre la clase que determinan retener
los valores de variables, disponibles a lo largo de la clase.

    SINTAXIS: Declación de un atributo o campo

    class U {
        
        T1 campo1 = <valor inicial>;
        T2 campo2 = <valor inicial>;
        T3 campo3 = <valor inicial>;
        ...
        Tn campoN = <valor inicial>;

        // ... métodos

    }

> Ejemplo de una clase `Producto` con campos (atributos) 
> para representar un producto

```java
class Producto {
    
    long id;
    String nombre;
    String descripcion;
    double precio;
    int existencias;
    boolean activo;
    
    // ... métodos
    
}
```

Los métodos son acciones sobre la clase que nos permiten ejecutar
bloques de código con acceso a los atributos, para permitirnos
cambiar los valores de los atributos o hacer operaciones sobre ellos.
Por ejemplo, calcular un total, asignar nuevos valores o imprimirlos
en la pantalla.

    SINTAXIS: Declaración de un método

    class U {
    
        // ... atributos

        <nivel de acceso> R1 accion1(<parámetros ...>) {
            <bloque de sentencias con acceso a los parámetros del método
                    y a los atributos de la clase>
        }

        <nivel de acceso> R2 accion2(<parámetros ...>) {
            <bloque de sentencias con acceso a los parámetros del método
                    y a los atributos de la clase>
        }

        <nivel de acceso> R3 accion3(<parámetros ...>) {
            <bloque de sentencias con acceso a los parámetros del método
                    y a los atributos de la clase>
        }

        ...

        <nivel de acceso> Rn accionN(<parámetros ...>) {
            <bloque de sentencias con acceso a los parámetros del método
                    y a los atributos de la clase>
        }

    }

> Ejemplo de una clase `Producto` con acciones (métodos)
> para operar un producto

```java
class Producto {
    
    // ... atributos
    
    void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    
    void actualizarDescripcion(String nuevaDescripcion) {
        this.descipcion = nuevaDescripcion;
    }
    
    void actualizarExistencias(int nuevasExistencias) {
        if (nuevasExistencias >= 0) {
            this.existencias = nuevasExistencias;
        } else {
            // TODO: Alertar un posible error
        }
    }
    
    double calcularPrecioMasIva() {
        return this.precio * 1.16;
    }
    
    String obtenerTitulo() {
        return this.nombre + " - " + this.descripcion;
    }
    
    boolean comprobarHayExistencias() {
        return this.existencias > 0;
    }
    
    double calcularValorAcumulado() {
        return this.precio * this.existencias;
    }
    
    boolean enRangoPrecio(double minPrecio, double maxPrecio) {
        return this.precio >= minPrecio && this.precio <= maxPrecio;
    }
    
}
```

### Ejercicio

Diseñar una clase llamada Robot2D que contenga los siguientes atributos 
y métodos descritos en las tablas.

| Atributo | Tipo  | Descripción                |
|----------|-------|----------------------------|
| `x`      | `int` | Retiene la posición en `x` |
| `y`      | `int` | Retiene la posición en `y` |

| Método         | Tipo de Retorno | Parámetros | Descripción                                    |
|----------------|-----------------|------------|------------------------------------------------|
| `avanzarNorte` | `void`          | `()`       | Avanza el robot en `y`                         |
| `avanzarSur`   | `void`          | `()`       | Avanza el robot en `-y`                        |
| `avanzarEste`  | `void`          | `()`       | Avanza el robot en `x`                         |
| `avanzarOeste` | `void`          | `()`       | Avanza el robot en `-x`                        |
| `describir`    | `void`          | `()`       | Imprime en la pantalla la coordenada del robot |
| `estaEnOrigen` | `boolean`       | `()`       | Devuelve si la coordenada es `(0, 0)`          |

Diseña una clase llamada `Robot2DTest` que verifique los métodos.

    Ejemplo:

    Robot2D robot = new Robot2D();

    robot.describir();
    robot.avanzarNorte();
    robot.describir();
    robot.avanzarEste();
    robot.describir();
    robot.avanzarSur();
    robot.describir();
    robot.avanzarOeste();
    robot.describir();
    
    if (robot.estaEnOrigen()) {
        System.out.println("El robot está en el origen");
    } else {
        System.out.println("El robot no está en el origen");
    }

## Declaración, instanciación e inicialización de objetos
## Trabajar con referencias de objetos
## Realización de más acciones con matrices
## Introducción a NetBeans IDE
## Introducción a un caso de uso de liga de fútbol