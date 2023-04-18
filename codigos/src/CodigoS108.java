import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CodigoS108 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:\\data\\poliza.txt");

        Scanner scanner = new Scanner(file);

        String folio = scanner.nextLine();

        String descripcion = scanner.nextLine();

        long clienteId = scanner.nextLong();
        scanner.nextLine();

        double monto = scanner.nextDouble();
        scanner.nextLine();

        double latitud = scanner.nextDouble();
        double longitud = scanner.nextDouble();
        //scanner.nextLine();

        System.out.println("----- POLIZA -------");
        System.out.printf("FOLIO: %s %n", folio);
        System.out.printf("DESCRIPCIÓN: %s %n", descripcion);
        System.out.println("----------------------");
        System.out.printf("CLIENTE ID: %d %n", clienteId);
        System.out.println("----------------------");
        System.out.printf("MONTO: %.2f %n", monto);
        System.out.println("----------------------");
        System.out.printf("UBICACIÓN: (%.6f, %.6f) %n", latitud, longitud);
        System.out.println("----------------------");

    }

}
