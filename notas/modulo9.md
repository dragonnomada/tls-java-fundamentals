# Módulo 9

## Más información sobre condicionales

Las condicionales son estructuras que permiten evaluar un bloque
de sentencias, solo si un valor lógico es verdadero.

    SINTAXIS: Condicional simple

    if (<valor lógico>) <bloque>

Un valor lógico puede obtenerse de una expresión lógica
o directamente creando una variable booleana. En cualquier
caso la condicional `if` tomará un valor `true` o `false`
para determinar si el bloque de sentencias asociado
deberá ser ejecutado o no.

Otros tipos de condicionales es la estructura `switch`
que toma un valor de entrada y determina si el valor
coincide en alguno de los casos. Esto sirve para
ejecutar múltiples casos de acuerdo al valor
que coincida en algúno de los posibles casos.

    SINTAXIS: Condicional de selección

    switch (<valor>) {

        case <valor 1>:
            <bloque 1>
            break;
    
        case <valor 2>:
            <bloque 2>
            break;
    
        case <valor 3>:
            <bloque 3>
            break;
    
        case <valor n>:
            <bloque n>
            break;
    
        default:
            <bloque por defecto en caso que ningún caso se cumpla>
            break;

    }

Cuándo queremos repetir un bloque mientras una condición se cumpla,
podemos sustituir `if` por `while`, haciendo que después de 
ejecutar el bloque asociado, se vuelva a evaluar la condición
y se determine repetir nuevamente el bloque. Después de ejecutar
el bloque la condición será evaluada nuevamente y el bloque se
seguirá repitiendo mientras la condición se cumpla.

    SINTAXIS: Ciclo condicional

    while (<valor lógico>) <bloque>

Si queremos ejecutar el bloque la primera vez y luego evaluar
la condición para determinar si el bloque debería repetirse
podemos invertir la forma de la condicional `while` por `do-while`
de modo que primero evaluará el bloque y luego la condición.

    SINTAXIS: Ciclo condicional inverso

    do <bloque> while (<valor lógico>);

## Operadores relacionales y condicionales

Existen diferentes operados que permiten comparar valores
y crear diferentes expresiones lógicas.

> Tabla de operadores relacionales

| Operador | Ejemplo  | Descripción                                                         |
|----------|----------|---------------------------------------------------------------------|
| `>`      | `a > b`  | Devuelve `true` si el valor de `a` es mayor estrictamente al de `b` |
| `>=`     | `a >= b` | Devuelve `true` si el valor de `a` es mayor o igual al valor de `b` |
| `<`      | `a < b`  | Devuelve `true` si el valor de `a` es menor estrictamente al de `b` |
| `<=`     | `a <= b` | Devuelve `true` si el valor de `a` es menor o igual al valor de `b` |
| `==`     | `a == b` | Devuelve `true` si el valor de `a` es el mismo valor de `b`         |
| `!=`     | `a != b` | Devuelve `true` si el valor de `a` es distinto al valor de `b`      |

> Tabla de operadores lógicos

> Tabla de operadores lógicos

| Operador | Ejemplo             | Descripción                                               |
|----------|---------------------|-----------------------------------------------------------|
| `&&`     | `a > b && a < c`    | Devuelve `true` si ambas condiciones son verdaderas       |
| `// `    | `casado // trabaja` | Devuelve `true` si alguna de las condiciones es verdadera |
| `! `     | `!(a > b)`          | Invierte la condición de `true` a `false` y viceversa     |

Una expresión lógica siempre devolverá un valor lógico
`true` o `false`, por lo que podrá ser usada directamente
en un `if` o `while` o ser retenida en una variable de
tipo `boolean`.

## Más métodos de utilizar las construcciones if/else

Podemos anidar las estructuras unas dentro de otras para
obtener resultados más amplios.

Por ejemplo, si tenemos un ciclo condicional que determine
incrementar un número mientras este sea menor a `100` y
adentro queremos sumar el valor solo si este es impar.

> Ejemplo de la suma de números impares y los números pares menores a `100`.

```java
public class Ejemplo901 {

    public static void main(String[] args) {

        int n = 1;

        int sumaImpares = 0;
        int sumaPares = 0;

        while (n < 100) {

            // Si `n` es divisible por 2 su residuo será de 0
            // es decir, será múltiplo de 2, por lo que será par
            if (n % 2 == 0) {
                sumaPares = sumaPares + n;
            } else {
                sumaImpares = sumaImpares + n;
            }

            // No olvidemos incrementar `n` o el programa se ciclará
            n = n + 1;

        }

        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);

    }

}

```

## Uso de sentencias Switch

La estructura `switch` es muy utilizada sobre
valores finitos o enumeraciones.

Veamos un ejemplo usando enumeraciones:

> Ejemplo de un programa que saluda según el tipo de persona

````java
enum TipoPersona {
    HOMBRE,
    MUJER,
    ROBOT,
    ALIENIGENA
}

public class Ejemplo902 {

    public static void main(String[] args) {

        TipoPersona persona = TipoPersona.HOMBRE;

        switch (persona) {

            case HOMBRE:
                System.out.println("Hola señorino");
                break;

            case MUJER:
                System.out.println("Hola señorina");
                break;

            case ROBOT:
                System.out.println("101010101010");
                break;

            case ALIENIGENA:
                System.out.println("👽👾🛸🛰️");
                break;

            default:
                System.out.println("??????????");
                break;

        }

    }

}
````

## Utilización del depurador NetBeans

Al pulsar clic sobre el número de línea de código se creará
un punto de interrupción. Con el ícono de depurar (un bicho)
en lugar del ícono de ejecutar (un triángulo), se ejecutará
el código y se pausará en los puntos de interrupción.

Al depurar el programa se mostrará una ventana con las
variables creadas hasta ese momento y sus valores. Y también
un conjunto de íconos que nos permitirán avanzar línea por línea
(*step over*) o profundizar en cada línea de ejecución (*step into*).

Al darle reanudar el programa continuará hasta el siguiente punto
de interrupción o hasta finalizar.