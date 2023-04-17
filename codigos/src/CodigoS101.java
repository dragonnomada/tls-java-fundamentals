import java.util.Scanner;

public class CodigoS101 {

    public static void main(String[] args) {

        String nombre;
        double precio;
        String codigoBarras;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        nombre = scanner.nextLine();

        System.out.print("Dame el precio: ");
        precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el escáner

        System.out.print("Dame el código de barras: ");
        codigoBarras = scanner.nextLine();

        System.out.println(
                "NOMBRE: " + nombre + "\n" +
                "PRECIO: $" + precio + "\n" +
                "CÓDIGO DE BARRAS: " + codigoBarras + "\n"
        );

    }

}
