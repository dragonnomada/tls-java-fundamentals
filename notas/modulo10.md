# Módulo 10

## Trabajando con Arrays, Loops y Fechas

Los arreglos son datos replicados de un mismo tipo de dato y se utilizan
para reservar memoria fija. Por ejemplo, cuándo deseamos manipular en
una sola variable 10 calificaciones, 100 productos o 50 textos, todos
de tamaño fijo.

Para acceder a los valores podemos usar los corchetes (`[]`) y asignar,
modificar o recuperar sus valores.

    SINTAXIS: Creación de un arreglo

    T[] nombre = new T[<tamaño entero fijo>];

    nombre[<i>] = <valor>;

    T valor = nombre[<j>];

**Nota:** Los valores se inicializan en el valor por defecto
del tipo de dato: Sí es numérico comenzará en cero y si es objeto
comenzará en `null`.

Una alternativa a los arreglos es usar listas de la clase `ArrayList`
o similar, para poder almacenar desde ningún elemento (lista vacía)
hasta todos los elementos que deseemos agregar.

La capacidad de las listas será el tamaño de memoria RAM disponible
para el programa.

Para agregar elementos a una lista usamos el método `add(<valor>)`
o `add(<índice>, <valor>)` y para quitar elementos usamos
`remove(<valor>)` o `remove(<índice>)`.

Las listas en general guardan objetos a menos que especifiquemos
a que tipo de clase pertenece el elemento.

    SINTAXIS: Listas genéricas

    * import java.util.ArrayList;

    ArrayList lista = new ArrayList();

    lista.add(<objeto 1>);
    lista.add(<objeto 2>);
    lista.add(<objeto 3>);
    lista.add(<objeto n>);

    lista.get(<índice>); // Recupera el elemento en ese índice
    lista.set(<índice>, <valor>); // Reemplaza el elemento en ese índice

    lista.remove(<objeto 1>);
    lista.remove(<índice entero como 0, 1, 2, ...>);

    lista.size(); // Devuelve un entero con el número de elementos en la lista
    
    lista.clear(); // Vacía la lista

    SINTAXIS: Lista específica de la clase U

    ArrayList<U> lista = new ArrayList<U>();
    
    --- Alternativamente --

    ArrayList<U> lista = new ArrayList<>();

Los ciclos iteradores también conocidos como iteradores o `loops`, permiten
recorrer elementos por índice o por elemento.

Cuando recorremos un índice para partir de un valor inicial, comprobar
si no ha llegado a un valor final e incrementar su valor tras ejecutar
cada bloque. Entonces hablamos de un ciclo iterador tradicional (por índice).

    SINTAXIS: Ciclo iterador tradicional (por índice)

    for (<inicializador>; <condición de paro>; <incremento>) <bloque>

    GENERALMENTE:

    for (int i = <valor inicial>; i < <valor final>; i++) <bloque>

    EJEMPLO:

    int s = 0;

    for (int i = 1; i <= 100; i++) {
        s = s + i * i; // La suma es la suma anterior más la i^2  
    }

    System.out.println(s); // Imprimimos la suma de los cuadrados
    // desde 1, hasta 100 (s = 1^2 + 2^2 + 3^2 + ... + 98^2 + 99^2 + 100^2)

Cuándo el índice no es de interés, pero los elementos de una lista o
un arreglo si lo son, entonces podemos recorrer cada elemento con
una variante del ciclo iterador `for` conocida como `for-each`.

    SINTAXIS: Ciclo iterador por elemento

    for (T elemento : <lista | arreglo>) <el bloque por cada elemento>

    EJEMPLO:

    ArrayList<String> frutas = new ArrayList<>();

    frutas.add("Manzana 🍎");
    frutas.add("Pera 🍐");
    frutas.add("Mango 🥭");
    frutas.add("Piña 🍍");
    frutas.add("Coco 🥥");

    for (String fruta : frutas) {
        System.out.printf("Quiero comer una %s %n", fruta);
    }

    --- Usando arreglos en lugar de listas ---

    String[] frutas = new String[5];

    frutas[0] = "Manzana 🍎";
    frutas[1] = "Pera 🍐";
    frutas[2] = "Mango 🥭";
    frutas[3] = "Piña 🍍";
    frutas[4] = "Coco 🥥";

    for (String fruta : frutas) {
        System.out.printf("Quiero comer una %s %n", fruta);
    }

Finalmente un tipo de dato muy importante es el de fecha
y tenemos muchos tipos de fechas:

- `java.util.Date`
- `java.util.Calendar`
- `java.sql.Date`
- `java.sql.Time`
- `java.sql.Timestamp`
- `java.security.Timestamp`
- `java.time.LocalDate`
- `java.time.LocalDateTime`
- `java.time.chrono.ChronoLocalDate`
- `java.time.chrono.ChronoLocalDateTime`

## Trabajar con fechas

Una de las fechas más importantes son `java.util.Calendar` y `java.time.LocalDate`.

El calendario consiste en una instancia a la que podemos irle sumando fechas como
en el siguiente ejemplo.

> Ejemplo de uso de la clase `Calendar`

```java
import java.util.Calendar;

public class Ejemplo1001 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(2023, 04, 19);

        calendar.add(Calendar.YEAR, 5);
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DAY_OF_MONTH, 23);
        calendar.add(Calendar.HOUR, 8);

        calendar.add(Calendar.YEAR, -1);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }

}
```

Podemos utilizar también la clase `LocalDate` o `LocalDateTime` (similar pero con 
soporte de horas, minutos y segundos).

> Documentación: 

- [https://docs.oracle.com/javase/8/docs/api/](https://docs.oracle.com/javase/8/docs/api/)

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejemplo1002 {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/

        LocalDate date = LocalDate.ofYearDay(2023, 145);

        System.out.println(date);

        // YYYY-MM-dd
        LocalDate date1 = LocalDate.parse("2023-04-19");

        System.out.println(date1);
        System.out.println(date1.format(DateTimeFormatter.ofPattern("YYYY, MM, dd")));
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
        System.out.println(date1.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(date1.format(
                DateTimeFormatter.ofPattern("YYYY (YY) MM (L LLL LLLL) dd (DD E EEE EEEE c ccc cccc e eee eeee)")
        ));

        System.out.println(LocalDate.now().format(
                DateTimeFormatter.ofPattern("d, M YYYY")
        ));

        System.out.println(LocalDate.now().format(
                DateTimeFormatter.ofPattern("d, LLLL YYYY")
        ));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame la fecha (día, mes año): ");
        LocalDate date2 = LocalDate.parse(
                scanner.nextLine(),
                DateTimeFormatter.ofPattern("d, LLLL yyyy"));

        System.out.println(date2.format(
                DateTimeFormatter.ofPattern("yyyy LLL d (D) EEEE")
        ));

    }

}
```

## Análisis de la matriz args

Cuándo creamos un programa, podemos enviarle parámetros al ejecutarlo.

Por ejemplo:

    class Hola {
    
        public static void main(String[] args) {

            for (String arg : args) {
                System.out.println(arg);
            }

        }

    }

## Matrices bidimensionales

Un arreglo bidimensional se puede conseguir modificando la sintaxis del arreglo tradicional.

    SINTAXIS: Arreglo unidimensional

    T[] arreglo = new T[<tamaño>];

    SINTAXIS: Arreglo bidimensional

    T[][] matriz = new T[<tamaño 1>][<tamaño 2>];

    EJEMPLO:

    int[][] matriz = new int[5][3];

    matriz[4][2] = 8;

## Construcciones en bucle alternativas

Los bucles o ciclos se pueden anidar para resolver algoritmos más complejos.

> Ejemplo de un ciclo condicional, que contiene un iterador, que contiene a su vez
> una condicional simple

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo1003 {

    public static void main(String[] args) {

        ArrayList<Integer> primos = new ArrayList<>();

        int n = 2;

        while (primos.size() < 100) {
            boolean esPrimo = true;
            for (int primo : primos) {
                if (n % primo == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                primos.add(n); // 2, 3, 5, 7, ...
            }
            n++; // 3, 4, 5, 6, 7, 8, ...
        }

        System.out.println(Arrays.toString(primos.toArray()));

    }

}
```

## Anidación de bucles

Los bucles anidados permiten hacer recorridos dentro de recorridos superiores.

```java
public class Ejemplo1004 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][6];

        matriz[0][3] = 8;
        matriz[3][2] = 5;
        matriz[1][4] = 3;
        matriz[2][1] = 6;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.printf("%d, %d: %d %n", i, j, matriz[i][j]);

            }

        }

    }

}
```

## Clase ArrayList

La clase `ArrayList` de `import java.util.ArrayList;` permite guardar objetos bajo dos 
modalidades:

1. `ArrayList lista = new ArrayList()` - Guarda objetos en general sin asociar ningún tipo de objeto
2. `ArrayList<T> list = new ArrayList<>()` - Guarda objetos solo de tipo `T` en la lista.

> Tabla de los métodos más importantes de `ArrayList`

| Método                       | Ejemplo                 | Descripción                                          |
|------------------------------|-------------------------|------------------------------------------------------|
| `.add(<elemento>)`           | `.add("Manzana 🍎")`    | Agrega un elemento de tipo `Object` o `T`            |
| `.add(<índice>, <elemento>)` | `.add(0, "Mango 🥭")`   | Agrega un elemento en el índice dado. * Debe existir |
| `.remove(<elemento>)`        | `.remove("Pera 🍐")`    | Quita un elemento dado el objeto                     |
| `.remove(<índice>)`          | `.remove(0)`            | Quita un elemento dado el su índice                  |
| `.get(<índice>)`             | `.get(1)`               | Devuelve el elemento del índice                      |
| `.set(<índice>, <elemento>)` | `.set(2, "Plátano 🍌")` | Reemplaza el elemento del índice                     |
| `.clear()`                   | `.clear()`              | Quita todos los elementos                            |
| `.size()`                    | `.size()`               | Devuelve un `int` con el número de elementos         |
