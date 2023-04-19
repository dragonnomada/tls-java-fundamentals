# Módulo 4

## Gestión de varios elementos

Cuando queremos utilizar una variable para almacenar múltiples elementos podemos crear un arreglo.

El arreglo es un tipo de dato replicado, que conforma una variable especial.

Esta variable de tipo arreglo tendrá acceso a todos los elementos almacenados y podrá accederlos o reemplazarlos 
mediante índices que comienzan en cero (`0`).

La sintaxis es:

    T[] nombre = new T[tamaño];

Dónde `T` es el tipo de dato del arreglo, por ejemplo, `int`, `double`, `String`, etc. Y `tamaño` es un entero que 
determinará el número de elementos que deseamos en el arreglo.

> Ejemplo de un arreglo de números que almacena las `10` calificaciones enteras de un grupo.

```java
public class Ejemplo401 {

    public static void main(String[] args) {

        int[] calificaciones = new int[10];

        calificaciones[0] = 10;
        calificaciones[1] = 8;
        calificaciones[2] = 6;
        calificaciones[3] = 7;
        calificaciones[4] = 9;
        calificaciones[5] = 5;
        calificaciones[6] = 10;
        calificaciones[7] = 8;
        calificaciones[8] = 6;
        calificaciones[9] = 10;
        // calificaciones[10] = 5; // ERROR: Sólo podemos tener el índice del 0 al 9
        // Porque la longitud del arreglo es de 10, es decir, hay 10 posibles índices
        // partiendo del 0 hasta llegar al 9 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9).
        // Cualquier índice fuera de ese intervalo no será válido.

        System.out.println("Primera calificación: " + calificaciones[0]);
        System.out.println("Segunda calificación: " + calificaciones[1]);
        System.out.println("Tercera calificación: " + calificaciones[2]);
        System.out.println("Última calificación: " + calificaciones[9]);
        System.out.println("Penúltima calificación: " + calificaciones[8]);
        System.out.println("Antepenúltima calificación: " + calificaciones[7]);

    }

}
```

Es posible que requiramos saber en algún momento cuántos elementos tiene un arreglo, para ello podemo usar la 
propiedad `length` del arreglo. Por ejemplo, `calificaciones.length`

## Trabajar con condiciones

Las condiciones se basan en evaluar una expresión lógica o tomar una variable booleana para determinar si un bloque 
de código asociado debería ser ejecutado.

La sintaxis de una condicional simple es:

    if (<expresión lógica / valor booleano>) <bloque>

Dónde `<expresión lógica / valor booleano>` puede ser una expresión lógica como `edad > 18`, `precio <= 20`, 
`edad>= 60`, `precio < 100`, `edad == 25`, `precio != 50`. O el valor de una variable booleana como 
`boolean casado = true;` para que quede la expresión como `if (casado) <bloque>`. 

El bloque es una pareja de llaves que contendrá todas las sentencias a utilizar.

> Ejemplo de una condicional que determina si un usuario leído desde el escáner puede ingresar al sistema.

```java
import java.util.Scanner;

public class Ejemplo402 {

    public static void main(String[] args) {

        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame tu edad: ");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Bienvenido");
        }

    }

}
```

## Trabajar con listas de elementos

La clase `ArrayList` permite guardar objetos para utilizarlos posteriormente. En su modo básico guardará los objetos 
y permitirá recuperarlos. Pero tendremos que hacer una conversión del objeto al tipo de dato que conocemos previamente.

La sintaxis es la siguiente:

    ArrayList lista = new ArrayList()

Los métodos más comunes para agregar y quitar elementos son `lista.add(<elemento>)` y 
`lista.remove(<índice>)` que agregarán y quitarán elementos.

> Ejemplo de una lista de elementos

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo403 {

    public static void main(String[] args) {

        ArrayList calificaciones = new ArrayList();

        calificaciones.add(10);
        calificaciones.add(6);
        calificaciones.add(8);
        calificaciones.add(7);

        calificaciones.remove(0);

        System.out.println(Arrays.toString(calificaciones.toArray()));

    }

}
```

## Procesamiento de listas de elementos

Podemos recorrer cada elemento de un arreglo o una lista mediante la estructura `for-each` la cual tomará cada 
elemento y lo retendrá en una variable, para después hacer uso de esta en un bloque.

La sintaxis es la siguiente:

    for (T elemento : lista) <bloque con acceso al elemento>

> Ejemplo de una lista de objetos recorrida

```java
import java.util.ArrayList;

public class Ejemplo405 {

    public static void main(String[] args) {

        ArrayList frutas = new ArrayList();

        frutas.add("Manzana");
        frutas.add("Kiwi");
        frutas.add("Melón");
        frutas.add("Mango");
        frutas.add("Pera");

        for (Object fruta : frutas) {
            System.out.println(fruta);
        }

    }

}
``` 

Observa que el tipo de dato `T` es `Object`, ya que la lista de elementos no especificó que tipo de dato era.

## Ejercicios

1. Crea un arreglo de números decimales de tamaño 5 y agrega diferentes valores en cada índice.
2. Determina cuál es valor más grande usando codicionales. Pista: Necesitarás una variable que guarde el valor más 
   grande encontrado en cada índice.
