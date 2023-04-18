import java.util.Scanner;

public class CodigoS102 {

    public static void main(String[] args) {

        double centigrados;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame los grados centígrados: ");
        centigrados = scanner.nextDouble();

        double fahrenheit = 1.8 * centigrados + 32;

        System.out.printf("Grados Centígrados: %.2f %n", centigrados);
        System.out.printf("Grados Fahrenheit: %.2f %n", fahrenheit);

    }

}
