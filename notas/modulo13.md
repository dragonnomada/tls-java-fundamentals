# Módulo 13

## Manejo de excepciones

Algunos métodos pueden marcar un `throws Exception` o alguna excepción en particular.

Las excepciones son posibles errores que se podrían generar durante la ejecución
del código. Todas derivan de la clase `java.lang.Exception`.

Entonces, dichos métodos nos van exigir controlar la excepción de dos formas:

1. `Propagar la excepción` - Significa que nuestro método también es marcado como `throws Exception`
2. `Controlar la excepción` - Significa envolver el código en `try-catch`

## Visión general

Algunas clases muy importantes o incluso nuestras propias clases
hacen que los métodos puedan provocar excepciones. Esto significa
que hubo un comportamiento no esperado que podría provocar un error
dentro del código.

Por ejemplo, la clase `Scanner` puede escanear valores desde un archivo,
pero el archivo podría no existir. Entonces el método constructor
`new Scanner(File)` generá una excepción.

Por lo que tenemos dos formas de resolverlo:

1. `Propagar la excepción` - Es decir no hacernos responsables y dejar que falle con `throws Exception`
2. `Controlar la excepción` - Es decir usar `try-catch` para determinar que pasa si falla

## Propagación de excepciones

Todos los métodos que sean marcados como `throws Exception` propagarán
las excepciones ocurridas en su código. Es decir, estos métodos
no hacen nada por controlar la excepción y en lugar de ello las propagan.
Para que quién consuma el método se haga responsable.

Esto es muy útil cuándo nosotros no queremos resolver el problema
de una forma específica y le dejamos al programador que use nuestro método
que se haga carga de controlar la excepción con sus propias estrategias.
Por ejemplo, podría determinar mostrar una alerta en la terminal,
mostrar una alerta gráfica, guardar el error en base datos, etc.

> Ejemplo de la propagación de error en una clase llamada `Producto`

```java
import java.util.Scanner;

public class Producto {

    long id;
    String nombre;
    double precio;
    int existencias;

    // Propagamos la excepción new Scanner(File) -> Producto(File)
    public Producto(File file) throws Exception {
        Scanner scanner = new Scanner(file); // Throws FileNotFoundException
        this.id = scanner.nextLong();
        this.nombre = scanner.nextLine();
        this.precio = scanner.nextDouble();
        this.existencias = scanner.nextInt();
    }

}
```

Las excepciones propagadas en algún momento llegarán o otro método
y si no se desea controlar la excepción ese otro método también
deberá propagarla.

> Ejemplo de un método main que sigue propagando la excepción

```java
class ProductoTest {

    public static void main(String[] args) throws Exception {
        // Throws Exception
        Producto producto = new Producto(new File("C:\\...\\coca-cola.txt"));

        System.out.println(producto.id);
        System.out.println(producto.nombre);
        System.out.println(producto.precio);
        System.out.println(producto.existencias);
    }
    
}
```

## Captura y devolución de excepciones

Nosotros podemos controlar la excepción si envolvemos la ejecución dentro
de la estructura `try` y controlamos la excepción en el bloque del `catch`.

    SINTAXIS: Controlar una excepción con try-catch

    try {
        ... código que haga un throws Exception
    } catch (Exception e) {
        ... código para solucionar la excepción
        // Por ejemplo, imprimir una alerta
        // Crear un reporte
        // Finalizar el programa
    }

> Ejemplo de `ProductoTest` con control de excepciones

```java
class ProductoTest {

    public static void main(String[] args) {
        try {
            // Throws Exception
            Producto producto = new Producto(new File("C:\\...\\coca-cola.txt"));

            System.out.println(producto.id);
            System.out.println(producto.nombre);
            System.out.println(producto.precio);
            System.out.println(producto.existencias);
        } catch (Exception e) {
            System.out.println("No se puede cargar el producto desde ese archivo");
        }
    }
    
}
```

## Manejo de varias excepciones y errores

Podemos también anidar múltiples tipos de excepciones para
poder controlar de forma más específica diversas situaciones.

> Ejemplo de una clase que controla múltiples Excepciones

```java
class PruebaTest {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        
        // Operaciones con la tienda.
        
        try {
            tienda.generarFacturaDiaria();
        } catch (TiendaAbiertaException e) {
            System.out.println("No se pudo realizar el corte caja porque la tienda no ha cerrado sus sistemas");
        } catch (TiendaProductosVaciosException e) {
            System.out.println("No hubo ventas, no se puede generar la factura 🥲");
        } catch (Exception e) {
            System.out.println("Ocurrió otro tipo de excepción, no se pudo facturar");
            e.printStackTrace();
        }
    
}
```