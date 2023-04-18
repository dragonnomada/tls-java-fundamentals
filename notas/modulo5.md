# Módulo 5

## Descripción de objetos y clases

Una clase es un conjunto de `ATRIBUTOS` y `MÉTODOS`.

Los atributos dentro de una clase representan el estado que deberá retener el objeto. 
Por ejemplo, podemos pensar en una clase que diseña un cliente. 
¿Qué atributos o campos debería tener el cliente? Un `id` de tipo entero,
un `nombre` de tipo texto, una `direccion1` de tipo texto, una `direccion2`
de tipo texto, un `estaActivo` de tipo lógico y así sucesivamente.

> El atributo resuelve: Qué contiene el objeto

Los métodos dentro de una clase representan las acciones que deberá hacer el objeto.
Por ejemplo, podemos pensar en una clase que diseña una venta.
¿Qué métodos u operaciones debería tener la venta? 
Un `agregarProducto(Producto producto)`, un `quitarProducto(long productoId)`,
un `calcularTotalVenta()`, un `pagarEnEfectivo(double cantidad)`,
un `asignarVendedor(long empleadoId)`, un `asignarCliente(long clienteId)`,
y así sucesivamente.

> El método resuelve: Qué hace el objeto

El objeto es una variable que retiene el contexto creado por una clase.

El objeto es considerado como la memoria viva de una clase. Es decir,
cuándo creamos (instanciamos) un objeto, este va a crear un contexto de memoria
para retener todos los atributos y acceder a los métodos definidos por
la clase.

El objeto dentro de la clase suele ser accedido mediante `this`. Es decir,
la palabra reservada `this` se refiere a la instancia de la clase,
dentro de la misma clase.

A la instancia fuera la clase, se accede mediante la variable asignada. 
A eso se le conoce como referencias al objeto. Es decir, el objeto nunca es
manipulado directamente, sino, que se crea una referencia mediante `this` o
la varible de instanciación.

> Los objetos son almacenados en memoria y accedidos a través
> de referencias. Una referencia interna dentro de la clase
> se hace mediante `this`. Y una referencia externa fuera
> de la clase (por ejemplo, en otra clase o en un `main`)
> se hace mediante la variable de tipo `T` dónde `T` es la clase.

## Trabajar con objetos y clases
## Definición de campos y métodos
## Declaración, instanciación e inicialización de objetos
## Trabajar con referencias de objetos
## Realización de más acciones con matrices
## Introducción a NetBeans IDE
## Introducción a un caso de uso de liga de fútbol