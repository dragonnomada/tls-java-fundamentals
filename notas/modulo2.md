# Módulo 2:

## Creación de una clase Java Main Class

```java
public class SuperApp {

    // TODO: Atributos y métodos

}
```

## Clases Java

En Java las clases representan diseñadores de objetos, los cuales reservan la memoria necesaria para retener 
atributos y poder ejecutar métodos.

Una clase establece principalmente qué operaciones se pueden aplicar en un contexto.

> Por ejemplo, la siguiente clase llamada `Saludador` permite saludar a una persona de dos maneras diferentes.

```java
class Saludador {
    
    void saludar() {
        System.out.println("Hola, ¿Cómo estás?");
    }
    
    void despedirse() {
        System.out.println("Adión, que te vaya bien");
    }
    
}
```

Las clases también pueden retener variables conocidas como atributos del objeto o también como sus propiedades. 
Estas variables contenidas directamente sobre la clase estarán disponibles en cualquier método de la clase y podrán 
ser modificadas.

> Por ejemplo, la siguiente clase llamada `Contador` determina un atributo (una variable interna a la clase) llamado 
> `conteo`, el cual es de tipo entero (tipo `int`) y es modificado en dos métodos distintos.

```java
class Contador {
    
    int conteo = 0;
    
    void incrementar() {
        conteo = conteo + 1;
    }
    
    void decrementar() {
        conteo = conteo - 1;
    }
    
}
```

## Método principal

Las clases por si mísmas no son ejecutables, al menos que posean un `punto de ejecución` o `método principal` 
(también se suele llamar `método de ejecución`, `método de entrada` o `punto de entrada`).

Este método principal ejecutará todas las sentencias definidas, sin importar si usa o no la clase.

Cualquier método principal puede ejecutar lo que desee.

> Por ejemplo, la siguiente clase llamada `Demo`, contine un método principal que ejecuta el resultado de sumar `1 + 2`.

```java
class Demo {

    public static void main(String[] args) {
        
        int resultado = 1 + 2;

        System.out.println(resultado);
        
    }
    
}
```

La clase es independiente de lo que haga su punto de ejecución, aunque generalmente es usado para hacer pruebas 
sobre la clase u otras clases.

> Por ejemplo, la clase `Contador` podría contener un punto de ejecución que pruebe su funcionamiento.

```java
class Contador {
    
    int conteo = 0;
    
    void incrementar() {
        conteo = conteo + 1;
    }
    
    void decrementar() {
        conteo = conteo - 1;
    }

    public static void main(String[] args) {
        
        Contador contador = new Contador(); // Crea un objeto `contador` de la clase `Contador` 
        
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        System.out.println(contador.conteo); // Debería imprimir 3
        
        contador.decrementar();
        contador.decrementar();

        System.out.println(contador.conteo); // Debería imprimir 1
        
    }
    
}
```

## Ejercicios

1. Crea una clase llamada `ConvertidorTemperatura`
2. Agrega los siguientes métodos:
```java
class ConvertidorTemperatura {
    void centigradosToFahrenheit(double centigrados) {
        double fahrenheit = 1.8 * centigrados + 32;
        System.out.println(fahrenheit);
    }
    void fahrenheitToCentigrados(double fahrenheit) {
        double centigrados = (fahrenheit - 32) / 1.8;
        System.out.println(centigrados);
    }
}
```
3. Describe en palabras el código anterior. (Por ejemplo `Se define una clase llamada ..., la cual contiene ...`).
4. Describe en palabras qué operaciones deberías hacer para probar que los métodos anteriores funcionen. (Por 
   ejemplo, `Al comienzo del método principal se crea un objeto llamado ... de la clase ..., en la siguiente línea 
   se manda a llamar al método ...`).