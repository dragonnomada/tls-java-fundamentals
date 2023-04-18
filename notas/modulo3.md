# Módulo 3:

## Data in a Cart

En Java existen valores simples, que pueden ser inferidos de valores literales o extraídos en forma directa de algún 
escáner o archivo.

Estos valores tienen asociado un **tipo de dato**, el cual determina que formato tiene el valor, y si este podrá 
usarse en alguna expresión lógica/artimética o de alguna otra forma.

Los tipos de datos más comunes son:

| Tipo de Dato  | Clase Asociada | Valor asociado            | Ejemplo                          | Descripción                                             |
|---------------|----------------|---------------------------|----------------------------------|---------------------------------------------------------|
| `boolean`     | `Boolean`      | *Valor lógico*            | `boolean completado = false;`    | Almacena un valor verdadero (`true`) o  falso (`false`) | 
| `short`       | `Short`        | *Número entero corto*     | `short categoria = 4;`           | Almacena un valor entero de 16 bits.                    |
| `int`         | `Integer`      | *Número entero*           | `int edad = 18;`                 | Almacena un valor entero de 32 bits.                    |
| `long`        | `Long`         | *Número entero largo*     | `long id = 1798435633324l;`      | Almacena un valor entero de 64 bits.                    |
| `float`       | `Float`        | *Número decimal simple*   | `float peso = 78.2f;`            | Almacena un valor decimal en 32 bits.                   | 
| `double`      | `Double`       | *Número decimal doble*    | `double pi = 3.1415926549;`      | Almacena un valor decimal en 64 bits.                   |
| `byte`        | `Byte`         | *Número entero muy corto* | `byte b = 123;`                  | Almacena el valor de un byte (de -128 a 127).           |
| `char`        | `Character`    | *Caracter simple*         | `char letra = 'x';`              | Almacena el valor de un caracter ASCII.                 |
| `String`      | `String`       | *Texto largo*             | `String mensaje = "Hola mundo";` | Almacena el valor de una secuencia caracteres.          |

## Introducción a variables

Las variables son etiquetas que permiten acceder directamente a la memoria y almacenar valores.

Las variables tienen asociado un tipo de dato, el cual determinará que tipo de valor se puede guardar en la variable.

Las variables pueden asignar un valor o reasignarlo (reemplazarlo) según sea necesario.

Las variables necesitan ser declaradas para poder ser utilizadas.

> Ejemplo de una variable capaz de almacenar un número entero para la edad de una persona.

```java
public class Ejemplo301 {

    public static void main(String[] args) {
        
        int edad; // Declara la variable `edad` de tipo entero (tipo `int`)
        
        edad = 19;

        System.out.print("La edad es: ");
        System.out.println(edad);
        
        edad = 25;

        System.out.print("La edad ha cambiado, ahora es: ");
        System.out.println(edad);
        
    }
    
}
```

## Trabajar con cadenas

Los textos son cadenas de caracteres que representan mensajes.

Los textos son de lo más utilizados en un programa para imprimir mensajes o generar reportes.

Los textos pueden ser construidos a partir de cadenas literales, la concatenación de cadenas y valores o el 
ensamblado de un texto más complejo mediante el constructor de textos.

> Por ejemplo, el siguiente programa muestra la impresión de diferentes textos literales.

```java
public class Ejemplo302 {

    public static void main(String[] args) {
        System.out.println("Hola Java");
        System.out.println("Este es un mensaje");
        System.out.println("Este texto será mostrado en otra línea");
        System.out.println("Dependiendo de la terminal, podrían no estar soportados caracteres especiales 😣");
    }
    
}
```

> Ejemplo de un programa que concatena texto a partir de otras variables

```java
public class Ejemplo303 {

    public static void main(String[] args) {
        
        String nombre = "Ana Ming";
        int edad = 27;
        float peso = 45.8f;
        double estatura = 1.78951234;
        boolean casado = false;
        char grupo = 'A';
        byte codigo = 17;

        System.out.println("NOMBRE: " + nombre + " " + 
                "EDAD: " + edad + " años " +
                "PESO: " + peso + " kilogramos " +
                "ESTATURA: " + estatura + " metros\n" +
                "CASADO?: " + casado + " " +
                "GRUPO: " + grupo + " " +
                "CÓDIGO: " + codigo
        );
        
    }
    
}
```

> Ejemplo de la construcción de un texto mediante `StringBuilder`

```java
public class Ejemplo304 {

    public static void main(String[] args) {

        String nombre = "Ana Ming";
        int edad = 27;
        float peso = 45.8f;
        double estatura = 1.78951234;
        boolean casado = false;
        char grupo = 'A';
        byte codigo = 17;

        StringBuilder builder = new StringBuilder();

        builder.append("NOMBRE: ");
        builder.append(nombre);
        builder.append("\n");

        builder.append("EDAD: ");
        builder.append(edad);
        builder.append(" años\n");

        builder.append("PESO: ");
        builder.append(peso);
        builder.append(" kilogramos\n");

        builder.append("ESTATURA: ");
        builder.append(estatura);
        builder.append(" metros\n");

        builder.append("CASADO?: ");
        builder.append(casado);
        builder.append("\n");

        builder.append("GRUPO: ");
        builder.append(grupo);
        builder.append("\n");

        builder.append("CÓDIGO: ");
        builder.append(codigo);
        builder.append("\n");

        System.out.println(builder.toString());

    }

}
```

## Trabajar con números

Los números pueden ser enteros o decimales, cortos o largos. Los más comunes son `int` para un entero cualquiera y 
`double` para un decimal cualquiera. Sin embargo, podemos usar `byte`, `short`, `long`, `float`, etc.

> Ejemplo de operaciones entre enteros

```java
public class Ejemplo305 {

    public static void main(String[] args) {

        int a = 123;
        int b = 456;

        int c = a + b;
        int d = a * b;
        int e = b / a;
        int f = b % a;

        System.out.println(
                "c = " + c + "\n" +
                "d = " + d + "\n" +
                "e = " + e + "\n" +
                "f = " + f + "\n"
        );

    }

}
```

> Ejemplo de operaciones entre decimales

```java
public class Ejemplo306 {

    public static void main(String[] args) {

        double a = 1.23;
        double b = 4.56;

        double c = a + b;
        double d = a * b;
        double e = b / a;
        double f = Math.pow(a, b);
        double g = b * Math.sin(a);

        System.out.println(
                "c = " + c + "\n" +
                "d = " + d + "\n" +
                "e = " + e + "\n" +
                "f = " + f + "\n" +
                "g = " + g + "\n"
        );

    }

}
```

## Manipulación de datos numéricos

Existe una clase estándar para poder leer valores desde la entrada estándar (generalmente la terminal) y desde archivos.

Esta clase se llama `Scanner` y permite recuperar los siguientes valores extraídos (escaneados) desde el flujo de 
entrada definido (generalmente `System.in` o un archivo).

Para leer valores que quiera ingresar el usuario al programa, podemos crear un `Scanner` y leer los próximos valores 
sobre la línea actual.

> Ejemplo de un programa que lee la edad de un usuario

```java
import java.util.Scanner;

public class Ejemplo307 {

    public static void main(String[] args) {

        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");

        edad = scanner.nextInt();

        System.out.println(
                "😒 ¿Seguro que tienes " + edad + " años?"
        );

    }

}
```

Si deseamos leer sobre la siguiente línea debemos advertirlo con `scanner.nextLine()`;

> Ejemplo de un programa que lee la `estatura` y el `peso` de una persona, para determinar su índice de masa corporal 
> (el `imc`).

```java
import java.util.Scanner;

public class Ejemplo308 {

    public static void main(String[] args) {

        double estatura, peso;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu estatura: ");
        estatura = scanner.nextDouble();

        scanner.nextLine(); // Ya no hay más datos sobre esta línea
        // Por lo que leemos el resto de la línea

        System.out.print("Ingresa tu peso: ");
        peso = scanner.nextDouble();

        scanner.nextLine(); // Ya no hay más datos sobre esta línea
        // Por lo que leemos el resto de la línea

        double imc = peso / Math.pow(estatura, 2); // peso entre estatura al cuadrado

        System.out.println(
                "El índice de masa corporal es: " + imc
        );

    }

}
```

## Ejercicios

1. Crea un reporte usando concatenación para los datos de un producto (nombre, código de barras, precio, existencias, 
   etc).
2. Crea el mismo reporte usando un `StringBuilder`.
3. Captura los datos del producto usando `Scanner`.
4. Crea un programa que pida los datos de una póliza de seguros y muestre su reporte.
5. Compila y ejecuta el programa anterior usando `javac` y `java` directamente.