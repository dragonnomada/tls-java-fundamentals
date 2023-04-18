import java.util.Scanner;

public class CodigoR102 {

    public static void main(String[] args) {

        double cx, cy, r;

        double px, py;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame cx cy r: ");
        cx = scanner.nextDouble();
        cy = scanner.nextDouble();
        r = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Dame px py: ");
        px = scanner.nextDouble();
        py = scanner.nextDouble();
        scanner.nextLine();

        double dx = px - cx;
        double dy = py - cy;

        double d = Math.sqrt(dx * dx + dy * dy);

        // SINTAXIS: if (<condición>) <bloque verdadero> else <bloque falso>
        if (d <= r) {
            System.out.println("✅ El punto está dentro del círculo");
        } else {
            System.out.println("❌ El punto está fuera del círculo");
        }

    }

}
