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

Todas las clases generan un tipo de dato llamado `TIPO CLASE`, el cual permite 
generar variables bajo ese tipo, para retener referencias a objetos.

    SINTAXIS: Declarar una variable de tipo objeto (TIPO CLASE)

    U objeto;

Al crear un objeto el proceso es llamado `instanciación` que se refiere
a crear un contexto en la memoria y devolver la referencia al nuevo objeto
creado.

> Instanciación: Reservar memoria y obtener la referencia

    SINTAXIS: Crear un nuevo objeto (instanciar)

    objeto = new U(...);

Los objetos son referencias a la memoria estructurada según la clase 
(por ejemplo, la clase `U`) y sirven para tener una referencia a esa memoria
durante el programa.

Los objetos pueden ser tratados como variables especiales. Es decir,
funcionan como variables con acceso a atributos y métodos.

    EJEMPLO:

    Scanner scanner = new Scanner(System.in);

    Scanner scanner -> Declarar un objeto de tipo Scanner (TIPO CLASE)

    new Scanner(...) -> Instanciar un nuevo objeto de tipo Scanner

    scanner = new Scanner(...) -> Asignar el objeto como una referencia
                                  al nuevo objeto instanciado

    scanner.nextLine() -> ejecutamos un método de scanner

    scanner.<atributo o método> -> acceder a un atributo o método (de los públicos)

Las clases definen por defecto un método especial llamado **Constructor**
el cual es el método que se manda a llamar cuándo la clase es instanciada.

Si una clase no define ningún constructor, esta asumirá el constructor por
defecto. Pero si la clase posee uno más constructores, podremos determinar
qué valores iniciales tendrán los atributos de la clase.

    SINTAXIS

    class U {
        
        // ... atributos

        U() {
            // TODO: Inicializa los atributos suponiendo que mandan parámetros
        }

        U(<parámetros ...>) {
            // TODO: Inicializa los atributos con los parámetros
        }

        // ... métodos

    }

> Ejemplo de la clase `Robot2D` con un constructor

```java

import java.io.FileNotFoundException;
import java.util.Scanner;

class Robot2D {

    int x;
    int y;

    Robot2D() {
        this.x = 0;
        this.y = 0;
    }

    Robot2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Robot2D(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        this.x = scanner.nextInt();
        this.y = scanner.nextInt();
    }

    // ... métodos

}
```

Cuando una clase tiene múltiples constructores, podemos crear instancias
llamando a los diferentes constructores.

> Ejemplo de una clase `Robot2DTest` que prueba a la clase `Robot2D`

```java
class Robot2DTest {

    public static void main(String[] args) {
        
        Robot2D robot1 = new Robot2D(); // Constructor Robot2D()
        
        Robot2D robot2 = new Robot2D(400, 384); // Robot2D(int x, int y)
        
        Robot2D robot3 = new Robot2D(new File("C:\\...\\r2d2.txt")); // Robot2D(File file)
        
    }
    
}
```

## Trabajar con referencias de objetos

Una clase instanciada genera una referencia. Por ejemplo, cuando usamos
`new U()` se crea una referencia a un nuevo objeto de la clase `U`.

Las referencias retenidas en variables, son las que consideramos como
los objetos. Por ejemplo, `U miObjeto = new U();` entonces, la variable
`miObjeto` de tipo clase `U` es una referencia al nuevo objeto
construido y se considera como él `"objeto"`.

Los objetos son utilizados como variables y a veces es imperceptible
si se trata de una variable primitiva o un objeto. Por ejemplo, si tenemos
la variable `nombre` de tipo `String`, podemos pensar que es una variable
primitiva, pero en realidad es un objeto de la clase `String`.

**Estas variables (objetos) pueden ser transportados de un método a otro
cómo paso en argumentos o parámetros**. Esto significa, que cada que usemos 
`U objeto`, estaremos haciendo una referencia a una instancia de la clase `U`.

    EN POCAS PALABRAS:

    U objeto1 = new U(); <- objeto1 es una referencia a un nuevo objeto

    U objeto2 = objeto1; <- objeto2 es una referencia al mismo objeto que objeto1

    U objeto3 = objeto2; <- objeto3 es una referencia al mismo objeto que objeto1 y objeto2

    <método>(objeto1); -> Pasamos la referencia del objeto1, objeto2, objeto3 al método
                            entonces el método tendrá una referencia más
                            al mismo objeto en cuestión.

## Realización de más acciones con matrices

El siguiente programa implementa una clase llamada `Matriz` la cual se
construye de distintas formas y contiene arreglos en 2 dimensiones.

> Clase `Matriz`

```java
public class Matriz {

    double[][] datos;
    int filas;
    int columnas;

    Matriz(int n, int m) {
        datos = new double[n][m];

        this.filas = n;
        this.columnas = m;
    }

    Matriz(int n) {
        datos = new double[n][n];

        this.filas = n;
        this.columnas = n;
    }

    void set(int i, int j, double valor) {
        this.datos[i][j] = valor;
    }

    double get(int i, int j) {
        return this.datos[i][j];
    }

    Matriz transponer() {
        Matriz otraMatriz = new Matriz(this.columnas, this.filas);

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                otraMatriz.set(j, i, this.get(i, j));
            }
        }

        return otraMatriz;
    }

    void mostrarPantalla() {
        System.out.printf("--- MATRIZ %dx%d ---%n", this.filas, this.columnas);
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                System.out.printf("%6.2f ", this.get(i, j));
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

}
```

> Clase `Ejemplo502`

```java
public class Ejemplo502 {

    public static void main(String[] args) {

        Matriz matriz = new Matriz(4, 6);

        matriz.set(2, 4, 8);
        matriz.set(3, 1, -1);
        matriz.set(1, 1, 100);

        matriz.mostrarPantalla();

    }

}
```

## Introducción a un caso de uso de liga de fútbol

> Enumeración `PosicionJugador`

```java
public enum PosicionJugador {

    DELANTERO_CENTRAL,
    DELANTERO_IZQUIERDO,
    DELANTERO_DERECHO,
    CENTRAL,
    CENTRAL_IZQUIERDO,
    CENTRAL_DERECHO,
    DEFENSA_CENTRAL,
    DEFENSA_IZQUIERDA,
    DEFENSA_DERECHA,
    GUARDAMETA,
    APOYO_DELANTERO,
    APOYO_CENTRO,
    APOYO_DEFENSA,
    BANCA

}
``` 

> Clase `Jugador`

```java
public class Jugador {

    int numero;
    String nombre;
    PosicionJugador posicion;
    boolean capitan;

    public Jugador(int numero, String nombre, PosicionJugador posicion, boolean capitan) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
        this.capitan = capitan;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PosicionJugador getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionJugador posicion) {
        this.posicion = posicion;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                ", capitan=" + capitan +
                '}';
    }

}
```

> Clase `Equipo`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    String nombre;
    ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", jugadores=" + Arrays.toString(jugadores.toArray()) +
                '}';
    }

    void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    void quitarJugador(int numero) {
        Jugador jugadorAQuitar = null;

        for (Jugador jugador : this.jugadores) {
            if (jugador.numero == numero) {
                jugadorAQuitar = jugador;
            }
        }

        if (jugadorAQuitar != null) {
            this.jugadores.remove(jugadorAQuitar);
        }
    }

}
```

> Clase `Liga`

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Liga {

    String nombre;

    ArrayList<Equipo> equipos;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + Arrays.toString(equipos.toArray()) +
                '}';
    }

    void inscribirEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    void generarReporte() {

        System.out.printf("--- LIGA %s ---%n", this.nombre);

        System.out.println("EQUIPOS INSCRITOS:");

        System.out.println("---------------------------------------");

        for (Equipo equipo : this.equipos) {
            System.out.printf("%s (%d)%n", equipo.getNombre(),
                    equipo.jugadores.size());
        }

        System.out.println("---------------------------------------");

        for (Equipo equipo : this.equipos) {

            System.out.printf("=== %s (%d) ===%n", equipo.getNombre(),
                    equipo.jugadores.size());

            System.out.println("=======================================");

            for (Jugador jugador : equipo.jugadores) {
                System.out.printf("%d. [CAPITÁN=%B] %s (%s)%n",
                        jugador.getNumero(), jugador.isCapitan(),
                        jugador.getNombre(), jugador.getPosicion());
            }

            System.out.println("=======================================");

        }

    }

}
``` 
