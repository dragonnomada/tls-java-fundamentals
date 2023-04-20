# Módulo 6

## Manipulación y formato de datos en el programa

Los datos generalmente se representan o convierten en textos para poder 
generar reportes de sus valores, aunque también se podría la operación
inversa de convertir textos a números o hacer conversiones entre tipos de datos.

Cuando queremos imprimir o generar reportes de texto, solemos utilizar:

- `String concat` - Concatenación de textos, usando el operador `+` entre textos y valores.
- `StringBuilder | StringBuffer` - Construye un `String` a partir de agregar textos o valores.
- `System.out.print | System.out.println` - Imprime textos o valores en un sólo parámetro con o sin salto de línea.
- `System.out.printf` - Imprime dado un forma que contiene `%s`, `%d`, `%f`, etc. Los valores formateados con texto.
- `String.format` - Es equivalente a `System.out.printf`, pero usado para generar un texto con formato sin imprimirlo 
  directamente.

## Uso de la clase String

`String` es una clase principal muy utilizada para el manejo de textos.
Esta tiene diferentes capacidades, como calcular el número de caracteres
(la longitud de la cadena de texto), extraer una subcadena o subsecuencia,
comparar cadenas de texto, y otras cosas que acepta el objeto de tipo `String`.

> Ejemplo de construcción de texto con formato

```java
public class Ejemplo601 {

    public static void main(String[] args) {

        String reporte = "";

        reporte += "--- Reporte ---\n"; // Equivale a `reporte = reporte + ...`
        reporte += String.format("1 + 2 = %d %n", 1 + 2);
        reporte += String.format("[%d] %s (%.2f) %n", 34, "Hola mundo", 3.1416);

        System.out.println(reporte);
        System.out.println(reporte.length());
        System.out.println(reporte.getBytes());
        System.out.println(reporte.toUpperCase());
        System.out.println(reporte.toLowerCase());
        System.out.println(reporte.charAt(8));
        System.out.println(reporte.substring(4, 10));
        System.out.println(reporte.indexOf("Hola"));
        System.out.println(reporte.contains("[34]"));
        System.out.println(reporte.contains("[35]"));
        System.out.println(reporte.replace("3.14", "XXXX"));

    }

}
```

## Uso de la documentación de la API de Java

La documentación oficial del API de Java se puede consultar en
[https://docs.oracle.com/javase/8/docs/api/](https://docs.oracle.com/javase/8/docs/api/)

## Uso de la clase StringBuilder

El `StringBuilder` permite crear un texto a partir de ir agregando valores.

  SINTAXIS: Construir un builder

  StringBuilder builder = new StrinBuilder();

  builder.append(<valor 1>);
  builder.append(<valor 2>);
  builder.append(<valor 3>);
  builder.append(<valor 4>);
  builder.append(<valor 5>);

> Uso de `StringBuilder`

```java
public class Ejemplo604 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Hola");
        builder.append(" ");
        builder.append("mundo");
        builder.append(" ");
        builder.append("🗺️");
        builder.append("\n");
        builder.append(123);
        builder.append(" ");
        builder.append(88 + 77);
        builder.append("\n");
        builder.append(true);
        builder.append("\n");
        builder.append("...");

        String texto = builder.toString();

        System.out.println(texto);

    }

}
```

## Más información sobre tipos de dato primitivos

Los tipos primitivos generalmente están dados en minúsculas, como `int`, `double`, 
`byte`, `boolean`. Cada uno tiene una clase asociada como `Integer`, `Double`,
`Byte`, `Boolean`, `Character`, etc.

Los tipos primitivos copian sus valores al pasar de una variable a otra
a diferencia de los objetos, los cuales solo copian una referencia al mismo
objeto. Es decir, los datos primitivos se copian, por lo que no pueden
modificarse al mismo tiempo de dos variables distintas, cada variable
tendrá una copia del valor asignado.

## Operadores numéricos restantes

> Acumular valores

  variable = variable + <valor>;
  
  variable += <valor>;

> Substraer valores

  variable = variable - <valor>;
  
  variable -= <valor>;

> Otros operadores

  variable++; // variable = variable + 1; variable += 1
  variable++; // devuelve el valor y luego lo incrementa
  ++variable; // incrementa el valor y luego lo devuelve
  variable--; // variable = variable - 1; variable -= 1
  variable--; //devuelve el valor y luego lo decrementa
  --variable; // decrementa el valor y luego lo devuelve
  variable *= <valor>; // variable = variable * <valor>
  variable /= <valor>; // variable = variable / <valor>
  variable %= <valor>; // variable = variable % <valor>
  variable &= <valor>; // variable = variable & <valor>
  variable |= <valor>; // variable = variable | <valor>

> Ejemplo del operar `++` usado en el `for` y el operador `+=` para acumular
> la suma de 1 + 2 + 3 + 4 + ... + i + ... + 99 + 100

```java
public class Ejemplo605 {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i; // suma = suma + i
        }

        System.out.println(suma);

    }

}
```

## Promoción y conversión de variables

Una variable tiene asociado un tipo de datos `T nombre` y hay veces que un tipo
de dato cabe dentro de otro tipo de dato o podemos forzar su conversión de manera
explícita.

  CONVERSIONES IMPLÍCITAS
  
  byte b = 64;

  shot s1 = b; // Convierte byte -> short
  int i1 = b; // Convierte byte -> int
  int i2 = s1; // Convierte short -> int
  float f1 = b; // Convierte byte -> float
  float f2 = s1; // Convierte short -> float
  float f3 = i1; // Convierte int -> float
  float f4 = i2; // Convierte int -> float
  ...

  CONVERSIONES EXPLÍCITAS

  double x = 123.4567891234321;

  int i1 = (int) x; // Convierte double -> int
  short s1 = (short) x; // Convierte double -> short
  byte b1 = (byte) x; // Convierte double -> byte
  byte b2 = (byte) i1; // Convierte int -> byte
  char c1 = (char) i1; // Convierte int -> byte
  ...
  
También podemos extraer números de textos mediante el éscaner o mediante
las clases de apoyo.

  CONVIERTE UN TEXTO A NÚMERO
  
  Integer.parseInt(<texto>)

  CONVIERTE UN TEXTO A DECIMAL
  
  Double.parseDouble(<texto>)

  CONVIERTE UN TEXTO A VALOR LÓGICO
  
  Boolean.parseBoolean(<texto>)

  EXTRAER VALORES DE UN TEXTO
  
  Scanner scanner = new Scanner(<texto>);
  
  scanner.nextInt();
  scanner.nextDouble();
  scanner.nextBoolen();