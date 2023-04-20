import java.util.Scanner;

public class PagableTest {
    static Scanner scanner = new Scanner(System.in);
    static void pagar(IPagable pagable) {
        double precio = pagable.getPrecio();
        System.out.println("Por pagar: $" + precio);
        System.out.print("Dame la cantidad $: ");
        double cantidad = scanner.nextDouble();
        System.out.println("Se pagó: $" + cantidad);
        double cambio = cantidad - precio;
        System.out.println("Cambio: $" + cambio);
        System.out.println("El producto fue pagado");
    }
    public static void main(String[] args) {

        // IPagable -> Interfaz Singular
        // * double getPrecio()
        // () -> double
        pagar(() -> 17.5);
        pagar(() -> 20.99);

    }

}
