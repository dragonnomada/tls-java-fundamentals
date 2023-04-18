import java.util.Scanner;

public class CodigoS104 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        System.out.println("Selecciona una opción:");
        System.out.println("1. Capturar y reportar producto");
        System.out.println("2. Capturar y reportar poliza");

        System.out.print("Dame la opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            String nombre;
            double precio;
            String codigoBarras;

            System.out.print("Nombre del producto: ");
            nombre = scanner.nextLine();

            System.out.print("Precio del producto: ");
            precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Código de barras: ");
            codigoBarras = scanner.nextLine();

            System.out.println("---------- PRODUCTO ------------");
            System.out.printf("Nombre: %s %n", nombre);
            System.out.printf("Precio: $%.2f %n", precio);
            System.out.println("--------------------------------");
            System.out.printf("Código de barras: %s %n", codigoBarras);
            System.out.println("--------------------------------");
        }

        if (opcion == 2) {
            String folio;
            String descripcion;
            long clienteId;
            double monto;

            System.out.print("Folio de la poliza: ");
            folio = scanner.nextLine();

            System.out.print("Descripción de la poliza: ");
            descripcion = scanner.nextLine();

            System.out.print("ID Cliente: ");
            clienteId = scanner.nextLong();
            scanner.nextLine();

            System.out.print("Monto: ");
            monto = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("----------- POLIZA -------------");
            System.out.printf("FOLIO: %s %n", folio);
            System.out.printf("Descripción: %s %n", descripcion);
            System.out.println("--------------------------------");
            System.out.printf("Cliente ID: %d %n", clienteId);
            System.out.println("--------------------------------");
            System.out.printf("MONTO: $%.2f %n", monto);
            System.out.println("--------------------------------");
        }

    }

}
