import java.util.ArrayList;

public class Ejemplo1005 {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(
                new Producto(123, "Coca cola")
        );

        productos.add(
                new Producto(456, "Pepsi")
        );

        System.out.println(productos.get(0));
        System.out.println(productos.get(1));

        productos.get(0).setPrecio(17.5);

        System.out.println(productos.get(0));

    }

}
