# Sintaxis

## Declarar una variable

    T nombre;

## Asignar o reasignar el valor de una variable

    nombre = <valor | expresión>;

## Declarar y asignar una variable

    T nombre = <valor | expresión>;

## Instanciar un objeto de la clase `U`

    U objeto = new U();

> **Nota:** Algunos objetos requieren parámetros en su construcción, por ejemplo, 
`Scanner scanner = new Scanner(System.in)` o `File file = new File("C:\\...")`.

## Condicional simple

    if (<expresión lógica | valor booleano>) {
        <bloque de sentencias...>
    }

## Condicional doble

    if (<condición>) {
        <bloque de sentencias si se cumple la condición...>
    } else {
        <bloque de sentencias si no se cumple la condición...>
    }

## Condicional múltiple
    
    if (<condición 1>) {
        <bloque de sentencias si se cumple la condición 1...>
    } else if (<condición 2>) {
        <bloque de sentencias si se cumple la condición 2...>
    } else if (<condición 3>) {
        <bloque de sentencias si se cumple la condición 3...>
    } else if (<condición n>) {
        <bloque de sentencias si se cumple la condición n-ésima...>
    } else {
        <bloque de sentencias si no se cumple la condición...>
    }

## Ciclo condicional simple

    while (<expresión lógica | valor lógico>) {
        <bloque de sentencias mientras se cumple la condición...>
    }

> **Nota:** La condición será evaluada nuevamente cuándo se procesen las sentencias del bloque y si es verdadera 
> volverá a ejecutar el bloque.

## Ciclo condicional directo

    do {
        <bloque de sentencias mientras se cumple la condición...>
    } while (<expresión lógica | valor lógico>);

> **Nota:** El bloque será ejecutado la primera vez, luego determinará si debe ser repetido dada la condición.

## Ciclo iterativo simple

    for (<valor inicial>; <condición>; <incremento>) {
        <bloque de sentencias con acceso al valor (iterador)...>
    }

> **Nota:** Generalmente el iterador suele ser del tipo: `for (int i = 0; i < 100; i++)` para recorrer los valores 
> desde el `0` hasta el `99`.