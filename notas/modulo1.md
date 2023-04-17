## Módulo 1

> Definición de programa Java

Un programa en Java es una clase que contiene un método especial
llamado `main`, el cual es público y estático.

Este define en su bloque todas las sentencias que
serán ejecutadas en orden.

Una sentencia puede ser:

* `Declarar una variable` - Crea una variable de algún tipo de dato para almacenar un valor.
* `Asignar una variable` - Asigna o reemplaza el valor de una variable según su tipo de dato.
* `Declarar y asignar una variable` - Declara una variable y asigna su valor inmediatamente.
* `Declarar múltiples variables` - Declara múltiples variables separadas por comas.
* `Declarar y asignar múltiples variables` - Declara y asigna múltiples variables separadas por coma.
* `Evaluar una expresión lógica/artimética` - Evalua una expresión lógica/aritmética de otras variables o literales.
* `Instanciar una clase` - Llama al constructor de una clase para crear una nueva instancia.
* `Instanciar un arreglo` - Crea una instancia especial de arreglo o matriz.
* `Condicionar la ejecución de un bloque` - Condiciona la ejecución de un bloque mediante `if`, `switch`, `while` o 
  `for`.
* `Llamar un método` - Produce la llamada a una función para opcionalmente retener un resultado.

Por ejemplo, el siguiente código muestra la definición de una clase llamada `Hola`, la cual es pública y ejecutable,
ya que posee un método público y estático que no retorna nada (tipo `void`) y recibe un arreglo de textos pasados
mediante la terminal (llamados `args`). Este tiene asociado un bloque con una única sentencia, la cual accede al
paquete `System.out` para ejecutar el método estático llamado `println`. Este último recibe un texto literal para 
imprimirlo en la salida estándar (generalmente la terminal de salida).

```java
public class Hola {
    public static void main(String[] args) {
        System.out.println("Hola Java");
    }
}
```

> Introducción a programas informáticos

* `Código Fuente` - Establece el programa legible para un humano
* `Compilador` - Traduce el código fuente en código máquina
* `Código Máquina` - Establece el programa legible para una máquina
* `Interprete` - Interpreta el código máquina en tiempo real
* `Máquina Virtual` - Traduce las instrucciones de la máquina virtual al sistema operativo

> Características principales del lenguaje Java

* `Orientado a Objetos` - Todo en Java es diseñado por una clase que retiene un estado y aplica operaciones
* `Interpretado` - Las instrucciones de Java pueden ser interpretadas en la máquina virtual
* `Portable` - Un programa está diseñado para la máquina virtual, y esta puede ser instalada en diversos sistemas 
               operativos como Windows, Linux, Mac, Solaris, Unix, BSD, etc.
* `Robusto` - Cuenta con un núcleo amplio y miles de librerías disponibles para hacer desarrollo de aplicaciones,
              servicios web, cómputo en la nube, machine learning y más.
* `Seguro` - Cuenta con herramientas de cifrado de código para exportar de forma segura librerías entre 
             equipos de trabajo.

> Tecnología y entorno de desarrollo Java

* `JDK (Java Development Kit)` - Es un conjunto de herramientas para compilar, ejecutar y monitorear programas de Java.
* `JRE (Java Runtime Environment)` - Es un conjunto de herramientas para ejecutar aplicaciones de java.
* `JSE (Java Standard Edition)` - Versión estándar para desarrollo de aplicaciones basadas en el escritorio.
* `JEE (Java Enterprise Edition)` - Versión empresarial para aplicaciones en grandes vólumenes de recursos.
* `JME (Java Mobile Edition)` - Versión móvil para teléfonos y dispositivos embebidos (como *Android*).

> Ejecución/prueba de un programa Java

    1. Crea un archivo llamado Hola.java

    2. Edita el código fuente

```java
public class Hola {
    public static void main(String[] args) {
        System.out.println("Hola Java");
    }
}
```

    3. Compila el código fuente mediante `javac` para generar el programa `Hola.class`

```text
$ cd <ruta al archivo Hola.java>

$ javac Hola.java

(Crea el archivo Hola.class)
```

    4. Ejecuta el programa `Hola.class` mediante `java` omitiendo la extensión

```text
$ cd <ruta al archivo Hola.class>

$ java Hola

>>> Hola Java
```

## Ejercicios

1. Crea un programa que diga tu nombre y correo
2. Compila el programa mediante `javac <nombre del archivo .java con extensión>`
3. Ejecuta el programa mediante `java <nombre del archivo .class sin extensión>`