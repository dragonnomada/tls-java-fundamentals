# Módulo 8

## Uso de encapsulación

El concepto de *encapsulamiento* sirve para proteger a los atributos y métodos
definidos dentro de una clase.

Esto nos permite garantizar que un objeto desde afuera no pueda acceder
a los atributos de una clase y modificarlos por error o intencionadamente.

Proteger la integridad de los datos es la principal tarea al diseñar una clase.
Para así garantizar siempre su correcto funcionamiento.

Generalmente los atributos de una clase son marcados como privados para la clase 
y si se desea acceder a un atributo desde afuera, se creará un `getter` o `setter`
para manipular el atributo de forma segura.

## Control de Acceso

Existen cuatro niveles de acceso que se puden marcar en atributos y métodos
y las clases solo podrán ser internas o públicas, según queramos que estén
disponibles o no fuera del proyecto.

> Tabla de niveles de acceso en atributos y métodos

| Nivel de acceso | Tipo         | Visibilidad                                 | Descripción                                                          |
|-----------------|--------------|---------------------------------------------|----------------------------------------------------------------------|
| `public`        | Público      | Cualquier proyecto o paquete                | Permite acceder desde afuera de clase                                |
| `internal`      | *Por defecto | Dentro del mismo paquete                    | Permite acceder desde afuera de clase, pero solo en el mismo paquete |
| `protected`     | Protegido    | Dentro de la misma clase y clases derivadas | Permite acceder dentro de clase y las subclases                      |
| `private`       | Protegido    | Dentro de la misma clase                    | Permite acceder solo dentro de clase                                 |

**Nota:** El nivel de acceso `internal` no tiene que ser marcado, ya que es el nivel de acceso por defecto.
Este funciona como `public`, pero solo para las clases dentro del mismo paquete.

## Encapsulación

La forma más común de encapsulamiento es marcar todos los atributos y métodos privados, o protegidos
si se desea que se modifiquen en clases derivadas (subclases).

Se usan las propiedades `getter` y `setter`, que son métodos con el prefijo `get` o `set` que
permiten recuperar los valores de los atributos o actualizarlos.

> Ejemplo de la clase `Producto` con `getters` y `setters`

```java
public class Producto {

    private long id;
    private String nombre;
    private double precio;
    private int existencias;

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
}
```

Observa que los métodos de tipo `get` devuelven los valores de los atributos,
mientras que los métodos de tipo `set` reciben nuevos valores para actualizar
los atributos.

Podríamos condicionar que se actualicen los valores verificando que los
nuevos valores cumplan nuestras reglas de negocio. Por ejemplo, determinar
actualizar el precio solo si es mayor a cero, o impedir que se actualicen
las existencias si el nuevo valor es negativo.

## Sobrecarga de constructores

Al construir un objeto usamos el constructor por defecto que no hace nada.
Pero podemos definir múltiples constructores para determinar cómo deberían
ser actualizados los atributos.

El constructor es un método especial con el mismo nombre que la clase
y este no marca ningún retorno.

Los constructores pueden ser sobrecargados con diferentes parámetros
y podrían ser públicos, internos, protegidos y privados como cualquier
método en particular.

> Ejemplo de la clase `Producto` con diferentes constructores sobrecargados.

```java
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Producto {

    private long id;
    private String nombre;
    private double precio;
    private int existencias;

    public Producto() {
        this.id = 0;
        this.nombre = "SIN NOMBRE";
        this.precio = 0.0;
        this.existencias = 0;
    }

    public Producto(long id) {
        this.id = id;
        this.nombre = "SIN NOMBRE";
        this.precio = 0.0;
        this.existencias = 0;
    }

    public Producto(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.precio = 0.0;
        this.existencias = 0;
    }

    public Producto(long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = 0;
    }

    public Producto(long id, String nombre, double precio, int existencias) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    public Producto(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        this.id = scanner.nextLong();
        this.nombre = scanner.nextLine();
        this.precio = scanner.nextDouble();
        this.existencias = scanner.nextInt();
    }

}
```

Observa que para un crear un objeto de la clase `Producto` tendremos múltiples
formas de hacerlo, por ejemplo, `Producto miProducto = new Producto()`, que creará
un producto de `id` cero, sin nombre, precio cero y existencias cero. También
podríamos usar otro constructor como `Producto miProducto = new Producto(34, "Coca Cola")`
que usará el constructor `public Producto(long id, String nombre)` o
podríamos usar `Producto miProducto = new Producto(new File("C:\\datos\\coca-cola.txt"))`
que usará un escáner para extraer los datos del producto usando el constructor
`public Producto(File file) throws FileNotFoundException`.

