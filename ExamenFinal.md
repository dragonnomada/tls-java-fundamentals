# Curso de Java Fundamentals TLS - Examen Final

Instructor: [Alan Badillo Salas](mailto:alan@nomadacode.com)

> NOMBRE COMPLETO:

> FECHA:

## Instrucciones

El siguiente examen contiene reactivos de distintos tipos:

1. `Selecciona la opción correcta` - Indica la opción más correcta entre las opciones
2. `Pregunta abierta` - Explica lo más breve posible (máximo un párrafo) la pregunta
3. `Selecciona el código correcto` - Indica el código correcto entre las variantes

> Por cada pregunta anota el número de pregunta
> y la respuesta (solo indica el inciso o la respuesta corta).

<div style="page-break-after: always"></div>

## Módulo 1

- Definición de programa Java
- Introducción a programas informáticos
- Funciones clave del lenguaje Java
- Tecnología y entorno de desarrollo Java
- Ejecución/prueba de un programa Java

### Pregunta 101 - Selecciona la opción correcta

> ¿Qué es un programa de Java?

    A) Un código fuente que contiene una clase
    B) Una clase que posee un método principal `main`
    C) Un código máquina compilado de una clase

> RESPUESTA:

### Pregunta 102 - Selecciona la opción correcta

> ¿Qué es un código fuente y un código máquina?

    A) El código fuente es un programa legible por el humano y el código máquina un programa entendible por la máquina
    B) El código fuente es entendible por la máquina y el código máquina por el humano
    C) El código fuente es un archivo de texto y el código máquina un archivo binario

> RESPUESTA:

### Pregunta 103 - Selecciona la opción correcta

> ¿Qué tipo de paradigma de programación usa Java?

    A) Programación Funcional
    B) Programación Basada en Clases
    C) Programación Orientada a Objetos

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 104 - Selecciona la opción correcta

> ¿Qué significa Java SE?

    A) Java Standard Edition
    B) Java Software Environment
    C) Java Security Enterprise

> RESPUESTA:

### Pregunta 105 - Selecciona el código correcto

> Suponemos que hay un archivo llamado Hola.java
> ¿Qué líneas en la terminal usamos para compilar el programa?

    A)

```bash
$ java Hola.java
```

    B)

```bash
$ java -c Hola.java
```

    C)

```bash
$ javac Hola.java
```

> RESPUESTA:

<div style="page-break-after: always"></div>

## Módulo 2

- Creación de una clase Java Main Class
- Clases Java
- Método principal

### Pregunta 201 - Selecciona el código correcto

> ¿Cuál es la sintaxis correcta para definir una clase llamada `Main` en Java?

    A)

```java
class Main {
    public void main(String[] args) {
        // ...
    }
}
```

    B)

```java
class Main {
    public static main(String[] args) {
        
    }
}
```

    C)

```java
class Main {
    public static void main(String[] args) {
        
    }
}
```

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 202 - Selecciona el código correcto

> ¿Cuál es la sintaxis correcta para una clase llamada `Producto`?

    A)

```java
class Producto {
    
    long id
    String nombre
    double precio
    
}
```

    B)

```java
class Producto {
    
    long id;
    String nombre;
    double precio;
    
}
```

    C)

```java
class Producto {
    
    long id;
    string nombre;
    double precio;
    
}
```

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 203 - Pregunta abierta

> Dicta en palabras el método principal 
> `public static void main(String[] args)`

    EJEMPLO: 

    Si el código fuera:
    
    double x = (123 + 2) / 4;

    El dictado sería:

    double x igual abre paréntesis
    123 más 2 cierra paréntesis
    división 4 punto y coma

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 3

- Data in a Cart
- Introducción a variables
- Trabajar con cadenas
- Trabajar con números
- Manipulación de datos numéricos

### Pregunta 301 - Pregunta abierta

> Escribe seis tipos de datos distintos

    NOTA: Pueden ser primitivos o de alguna clase

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

### Pregunta 302 - Selecciona la opción correcta

> ¿Cuál describe mejor la construcción de una variable?

    A) Palabra new seguido de nombre igual a valor punto y coma
    B) Tipo de dato seguido de nombre igual a valor punto y coma
    C) Palabra var seguido de nombre igual a valor punto y coma

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 303 - Selecciona el código correcto

> ¿Qué código imprime correctamente las variables?

    A)

```java
class Pregunta303 {
    public static void main(String[] args) {
        String nombre = "Luis";
        int edad = 23;
        System.out.println('Nombre: ' + nombre + ' edad: ' + edad);
    }
}
```

    B)

```java
class Pregunta303 {
    public static void main(String[] args) {
        String nombre = 'Luis';
        int edad = 23;
        System.out.println("Nombre: " + nombre + " edad: " + edad);
    }
}
```

    C)

```java
class Pregunta303 {
    public static void main(String[] args) {
        String nombre = "Luis";
        int edad = 23;
        System.out.println("Nombre: " + nombre + " edad: " + edad);
    }
}
```

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 304 - Pregunta abierta

> ¿Cuál es el valor de `int resultado = 17 % 6;`?

    NOTA: El módulo o residuo de `A mod B`
          es la cantidad entera que sobra
          de B contenido en A.

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

### Pregunta 305 - Pregunta abierta

> Escribe las sentencias para crear un escáner
> de la clase `java.util.Scanner` y capturar
> un número entero de la entrada estándar

    NOTA: Debes escribir las líneas de código
          y no es necesario que imprimas algo en 
          la pantalla.

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 4

- Gestión de varios elementos
- Trabajar con condiciones
- Trabajar con listas de elementos
- Procesamiento de listas de elementos

### Pregunta 401 - Selecciona la opción correcta

> ¿Cuál es la sintaxis correcta para crear un arreglo de 100 elementos?

    A) T[100] arreglo;
    B) T[] arreglo = new T[100];
    C) ArrayList<T> arreglo = new ArrayList<100>();

> RESPUESTA:

### Pregunta 402 - Selecciona la opción correcta

> ¿Qué recibe una condicional simple `if`?

    A) Un valor lógico `true` o `false`
    B) Una expresión relacional
    C) Un expresión de comparación

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 403 - Selecciona el código correcto

> ¿Cuál es la forma correcta de crear una lista de tipo `String`?

    A)

```java
import java.util.ArrayList;

class Pregunta403 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
    }
}
```

    B)

```java
import java.util.ArrayList;

class Pregunta403 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList(String);
    }
}
```

    C)

```java
import java.util.ArrayList;

class Pregunta403 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
    }
}
```

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 405 - Pregunta abierta

> Dada una lista de frutas, escribe el código para
> agregar una fruta a la lista `frutas`

    NOTA: Debes suponer que la lista llamada `frutas` ya existe.

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 5

- Descripción de objetos y clases
- Trabajar con objetos y clases
- Definición de campos y métodos
- Declaración, instanciación e inicialización de objetos
- Trabajar con referencias de objetos

### Pregunta 501 - Selecciona la opción correcta

> ¿Qué describe mejor a una clase y un objeto?

    A) La clase diseña atributos y métodos
       y el objeto es una referencia a 
       un contexto en la memoria para esos atributos 
       y métodos
    B) La clase contiene variables y métodos
       y el objeto es una variable de la clase
    C) La clase instancia objetos y los objetos
       son referencias a la clase

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 502 - Pregunta abierta

> Escribe el código para crear una instancia de la clase
> llamada `TiendaOnline`

    NOTA: Debes suponer que la clase `TiendaOnline`
          ya existe y tiene un constructor sin parámetros

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

### Pregunta 503 - Pregunta abierta

> Escribe el código para una clase llamada `Punto`
> que contenga el atributo `x` y `y` de tipo `double`
> y un método llamado `getX()` que devuelva un `double`
> con el valor de `x` y un método llamado `getY()`
> que devuelva el valor de `y`

    NOTA: Debes escribir el código de toda la clase

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

### Pregunta 504 - Pregunta abierta

> Escribe el código correcto para crear dos instancias
> de la clase `Punto` e imprimir los valores de `x`
> y de `y`.

    NOTA: Puedes llamarle a las instancias `p1` y `p2`

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

### Pregunta 505 - Pregunta abierta

> ¿Qué le pasa a una variable de tipo `Punto` que 
> es igual a otro punto?

    NOTA: Por ejemplo, si `p2 = p1;` ambos de la clase `Punto`

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 6

- Manipulación y formato de datos en el programa
- Uso de la clase String
- Uso de la documentación de la API de Java
- Uso de la clase StringBuilder
- Más información sobre tipos de dato primitivos
- Operadores numéricos restantes
- Promoción y conversión de variables

### Pregunta 601 - Selecciona el código correcto

> ¿Qué código es correcto para imprimir variables con formato?

    A)

```java
class Pregunta601 {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 26;
        double peso = 78.24;
        System.out.printf("NOMBRE: %s %n", nombre);
        System.out.printf("EDAD: %d %n", edad);
        System.out.printf("PESO: %d %n", peso);
    }
}
```

    B)

```java
class Pregunta601 {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 26;
        double peso = 78.24;
        System.out.printf("NOMBRE: %s %n", nombre);
        System.out.printf("EDAD: %d %n", edad);
        System.out.printf("PESO: %.2f %n", peso);
    }
}
```

    C)

```java
class Pregunta601 {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 26;
        double peso = 78.24f;
        System.out.printf("NOMBRE: %s %n", nombre);
        System.out.printf("EDAD: %d %n", edad);
        System.out.printf("PESO: %.2f %n", peso);
    }
}
```

> RESPUESTA:

### Pregunta 602 - Selecciona el código correcto

> Selecciona el uso correcto de `StringBuilder`

    A)

```java
class Pregunta602 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hola ");
        builder.append("mundo");
        System.out.printf(builder.toString());
    }
}
```

    B)

```java
class Pregunta602 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.add("Hola ");
        builder.add("mundo");
        System.out.printf(builder.toString());
    }
}
```

    C)

```java
class Pregunta602 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hola ");
        builder.append("mundo");
        System.out.printf(builder.getString());
    }
}
```

> RESPUESTA:

### Pregunta 603 - Pregunta abierta

> Dado un texto `String texto = "435.23"`.
> Escribe el código para convertirlo a `double numero = ...;`.

    NOTA: Debes usar el método de parseo correcto de la clase
          asociada a `double`

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 7:

- Creación y uso de métodos
- Uso de métodos
- Argumentos de método y valores de retorno
- Variables y métodos estáticos
- Cómo se transfieren argumentos a métodos
- Sobrecarga de un método

### Pregunta 701 - Pregunta abierta

> Escribe el código de un método llamado `suma`
> que reciba dos parámetros de tipo `double`
> nombrados como `a` y `b` y devuelva
> un valor de tipo `double` con la suma de los
> parámetros.

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

### Pregunta 702 - Selecciona la opción correcta

> ¿Qué es la sobrecarga de métodos?

    A) Crear métodos del mismo nombre con tipo de retorno
    B) Crear métodos del mismo nombre con sufijos diferentes
    C) Crear métodos del mismo nombre con parámetros distintos

> RESPUESTA:

<div style="page-break-after: always"></div>

## Módulo 8
 
- Uso de encapsulación
- Control de Acceso
- Encapsulación
- Sobrecarga de constructores

### Pregunta 801 - Pregunta abierta

> Escribe el código para una clase llamada `Jarra`
> con el atributo `int capacidadMaxima;`
> y el atributo `int capacidadActual`.
> Crea dos constructores distintos
> que inicialicen los atributos.

    NOTA: Puedes suponer valores de cero por defecto.    

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 9

- Más información sobre condicionales
- Operadores relacionales y condicionales
- Más métodos de utilizar las construcciones if/else
- Uso de sentencias Switch
- Utilización del depurador NetBeans

## Pregunta 901 - Pregunta abierta

> Escribe la condición correcta del siguiente código:

    SI LA EDAD ES MAYOR O IGUAL A 18 Y PESO MENOR ESTRICTO A 80

```java
class Pregunta901 {
    public static void main(String[] args) {
        int edad = 24;
        double peso = 63.2;
        if (******) {
            System.out.println("BIENVENIDO");
        }
    }
}
```

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 10

- Trabajando con Arrays, Loops y Fechas
- Trabajar con fechas
- Análisis de la matriz args
- Matrices bidimensionales
- Construcciones en bucle alternativas
- Anidación de bucles
- Clase ArrayList

### Pregunta 1001 - Pregunta abierta

> Escribe código para un iterador que vaya de `25` a `75`
> e imprima el valor de la variable `i` iterada,
> con incrementos de `5`.

    SINTAXIS:

    for (<inicalización>; <condición>; <incremento>) {
        ...
    }

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

### Pregunta 1002 - Pregunta abierta

> Explica la diferencia entre un arreglo y una lista

    NOTA: Usa una respuesta corta

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

## Módulo 11

- Uso de herencia
- Visión general de la herencia
- Trabajar con subclases y superclases
- Sustitución de métodos en la superclase
- Introducción al polimorfismo
- Creación y ampliación de clases abstractas

### Pregunta 1101 - Selecciona la opción correcta

> ¿Qué es la herencia?

    A) Extender una clase llamada `superclase` en
       otra clase llamada `subclase`
    B) Derivar una clase padre en una clase hija
    C) Crear una clase que copia los atributos
       y métodos de la `superclase` en la `subclase`

> RESPUESTA:

### Pregunta 1102 - Pregunta abierta

> ¿Qué es el polimorfismo?

> RESPUESTA:

    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •
    •

<div style="page-break-after: always"></div>

### Pregunta 1103 - Selecciona la opción correcta

> ¿Cuándo una clase se puede comportar como otra?

    A) La `subclase` se puede comportar como la `superclase`
    B) La `superclase` se puede comportar como la `subclase`
    C) La `subclase` no puede comportarse como la `superclase`

> RESPUESTA:

<div style="page-break-after: always"></div>

## Módulo 12

- Uso de interfaces
- Polimorfismo en clases de fundación de JDK
- Uso de la interfaz List
- Introducción a las expresiones lambda

### Pregunta 1201 - Selecciona el código correcto

> ¿Cuál es la sintaxis para declarar una interfaz llamada `IProducto`?

    A)

    class IProducto {
        String getDescripcion();
        double getPrecio();
        int getExistencias();
    }

    B)

    interface IProducto {
        String getDescripcion();
        double getPrecio();
        int getExistencias();
    }

    C)

    abstract class IProducto {
        String getDescripcion();
        double getPrecio();
        int getExistencias();
    }

> RESPUESTA:

<div style="page-break-after: always"></div>

### Pregunta 1202 - Selecciona el código correcto

> ¿Cuál es el código correcto para de una expresión lambda usada
> dentro del método objeto.foo(...)?

    A)

```java
class Pregunta1202 {
    public static void main(String[] args) {
        // ...
        objeto.foo((a, b) -> {
            ...
        });
    }
}
```

    B)

```java
class Pregunta1202 {
    public static void main(String[] args) {
        // ...
        objeto.foo((a, b) => {
            ...
        });
    }
}
```

    C)

```java
class Pregunta1202 {
    public static void main(String[] args) {
        // ...
        objeto.foo(lambda: (a, b) {
            ...
        });
    }
}
```

> RESPUESTA:

<div style="page-break-after: always"></div>

## Módulo 13

- Manejo de excepciones
- Visión general
- Propagación de excepciones
- Captura y devolución de excepciones
- Manejo de varias excepciones y errores

### Pregunta 1301 - Selecciona el código correcto

> ¿Qué código controla correctamente la excepción?

    A)

```java
import java.io.File;
import java.util.Scanner;

class Pregunta1301 {
    public static void main(String[] args) {
        File file = new File("C:\\...\\datos.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            System.out.println(line);
        } catch() {
            System.out.println("Algo salió mal");
        }
    }
}
```

    B)

```java
import java.io.File;
import java.util.Scanner;

class Pregunta1301 {
    public static void main(String[] args) {
        File file = new File("C:\\...\\datos.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            System.out.println(line);
        } catch(Exception e) {
            System.out.println("Algo salió mal");
        }
    }
}
```

    C)

```java
import java.io.File;
import java.util.Scanner;

class Pregunta1301 {
    public static void main(String[] args) {
        File file = new File("C:\\...\\datos.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            System.out.println(line);
        } catch (Exception) {
            System.out.println("Algo salió mal");
        }
    }
}
```

> RESPUESTA:

### Pregunta 1302 - Selecciona la opción correcta

> ¿Cómo podemos propagar una excepción en un método?

    A) void foo() throw new Exception { ... }
    B) void foo() throws Exception { ... }
    C) void foo() throw Exception { ... }

> RESPUESTA: