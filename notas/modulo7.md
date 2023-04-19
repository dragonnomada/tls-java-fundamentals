# Módulo 7

## Creación y uso de métodos

Los métodos sirven dentro de la clase para poder realizar acciones con
parámetros externos y los atributos internos.

Por ejemplo, si una clase retiene atributos para saber si una venta
está efectuada, si requiere llenar listas de elementos o si la clase
contiene datos que necesiten ser modificados de forma segura, entonces
podemos diseñar métodos para efectuar dichas operaciones.

## Uso de métodos

Los métodos más comunes se consideran propiedades `getter` y `setter`
las cuales tienen el objetivo de recuperar o actualizar los atributos
internos de la clase, para protegerlos de un mal uso externo, manteniendo
así la integridad de los datos.

Otro uso de los métodos es poder computar valores inferidos a partir de
los atributos ya conocidos. Por ejemplo, si una clase posee un arreglo
de productos, los cuales poseen cada uno un precio, entonces podríamos
diseñar un método que calcule el precio total de todos los productos.

Algunas otras aplicaciones de los métodos sería poder generar reportes
de texto o en archivos, para verificar que la clase se comporte 
correctamente o sus valores sean almacenados en archivos de texto
o bases de datos.

## Argumentos de método y valores de retorno

Los métodos tienen una sintaxis familiar a las funciones de `C/C++`
los cuales parten de definir un tipo de retorno, seguido del nombre
del método y entre paréntesis la lista de parámetros soportados
separados por coma.

    SINTAXIS: DECLARACIÓN DE UN MÉTODO

    R nombre(T1 parámetro1, T2 parámetro2, ...) <BLOQUE>

Dónde `R` es el tipo de dato de retorno esperado, por ejemplo,
`void` si el método no espera devolver nada, `int` si espera
retornar un entero, `double` si espera retornar un decimal largo,
`U` si espera retornar una referencia a un objeto de la clase `U`.

También los métodos podrían indicar un nivel de acceso
antes del tipo de retorno, cómo podría ser `public`, `protected`
o `private` (se verá más adelante).

> Ejemplo de un método para la clase `Venta`

```java
import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> productos;
    
    // ... contructores
    
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    
    public double calcularPrecioTotal() {
        double total = 0.0;
        
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        
        return total;
    }

}
```

## Variables y métodos estáticos

Algunas clases que no dependen de atributos o métodos internos
para poder hacer operaciones, suelen definir atributos y métodos
estáticos. Esto significa que dichos métodos y atributos no
dependen de ser instanciados, por lo que, no tienen acceso
a una referencia interna `this`.

A estos atributos y métodos estáticos se les consideran
de nivel clase. Es decir, pueden ser accedidos y utilizados
directamente desde la clase y cualquier atributo y métodos
podría ser consumido sin pasar por una instancia `new`.

Los métodos estáticos tienen acceso a los atributos estáticos
y otros métodos estáticos.

> Ejemplo de la clase `Calculadora` que tiene atributos y
> métodos estáticos que puden ser utilizados sin una instancia

```java
public class Calculadora {
    
    public static double ans = 0.0; // Atributo estático
    // Disponible desde Calculadora.ans
    
    // Método estático disponible desde Calculadora.suma(...)
    public static void suma(double valor) {
        ans += valor; // Actualiza el atributo estático
    }
    
    // Método estático disponible desde Calculadora.getPantalla()
    public static String getPantalla() {
        return String.format("[ %010d ]", ans); // Accede al atributo estático
    }
    
}
```

Para consumir los atributos y métodos estáticos no hace falta crear
una instancia de la clase. Simplemente a través de la clase se consumen.

> Ejemplo de una clase `CalculadoraTest` que tiene un punto de entrada
> que consume los atributos y métodos estáticos

```java
public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora.suma(20);
        Calculadora.suma(30);
        System.out.println(Calculadora.ans);
        System.out.println(Calculadora.getPantalla());
    }
    
}
```

Los atributos estáticos son compartidos y accedidos en cualquier parte
del programa.

Algunos ejemplos de métodos estáticos de clases importantes son:

    String.format(<formato>, <argumentos ...>) -> Devuelve un String con los valores formateados
    Integer.parseInt(<texto>) -> Devuelve un entero a partir de un texto
    Math.cos(<decimal>) -> Devuelve el coseno de un número double
    Arrays.toString(<arreglo T[]>) -> Devuelve un String con los valores del arreglo en forma de texto

## Cómo se transfieren argumentos a métodos

Cuándo definimos un método con parámetros, estos esperan recibir los parámetros
al llamar el método. 

Los valores pasados como parámetros se llaman argumentos.

Si los tipos de datos son primitivos, se enviará una copia de los valores,
pero si los valores son **TIPO CLASE**, entonces se mandará una referencia
de los objetos.

Por ejemplo, para una clase llamada `OperacionesUtil`, 
un método `double suma(double a, double b)` espera recibir dos
parámetros de tipo `double` y devolver otro decimal como salida. 
Entonces, los valores enviados serán reconocidos como los argumentos del método.
Así la llamada sería algo como `operacion.suma(1, 2)`, por lo que los
valores de `1` y `2` serán copiados a las variables tipo `double` llamadas
`a` y `b`. 

Pero si tenemos un método como `void agregarProducto(Producto producto)`
para una clase llamada `Tienda`, entonces, esperaríamos enviar en su llamada
un argumento de tipo `Producto`, como `miTienda.agregarProducto(pepsi)`.
En este caso, una referencia al mismo objeto `pepsi` de la clase `Producto`
será mandada al método. Es decir, lo que le ocurra al objeto `pepsi`
o `producto` dentro del método, afectará al objeto referenciado, ya que
ambos hacen referencia al mismo objeto. Por lo que debemos ser cuidados
de enviar copias de objetos, o manipularlos de forma responsable y
advertir que los cambios al objeto podrían afectarlo permanentemente.

## Sobrecarga de un método

Cuándo existen dos o más métodos con el mismo nombre, pero con diferentes
parámetros, esto se denomina **sobrecarga de métodos**. Es decir,
un mismo nombre de método podría recibir diferentes parámetros
para hacer diferentes funcionalidades.

> Ejemplo de la clase `Contador` con sobrecarga de métodos

```java
import java.util.Scanner;

public class Contador {

    int conteo = 0;

    // Incrementa el conteo en 1
    void incrementar() {
        this.conteo++;
    }

    // Incrementa el conteo según el valor
    void incrementar(int valor) {
        this.conteo += valor;
    }

    // Incrementa el conteo según los números en un texto
    void incrementar(String texto) {
        Scanner scanner = new Scanner(texto);
        
        while (scanner.hasNextInt()) {
            this.conteo += scanner.nextInt();
        }
    }

}
```

Así podríamos usar el método `incrementar(...)` en sus diferentes polimorfismos.

> Ejemplo de la clase `ContadorTest` consumiendo el método incrementar en sus
> diferentes funciones

```java
public class ContadorTest {

    public static void main(String[] args) {
        
        Contador miContador = new Contador();
        
        miContador.incrementar(); // Incrementa el conteo en 1
        System.out.println(miContador.conteo); // 1
        miContador.incrementar(10); // Incrementa el conteo en 10
        System.out.println(miContador.conteo); // 11
        miContador.incrementar("4 5 6"); // Incrementa el conteo en 15 
        System.out.println(miContador.conteo); // 26
        
    }
    
}
```