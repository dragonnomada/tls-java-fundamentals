import java.util.Scanner;

public class Ejemplo402 {

    public static void main(String[] args) {

        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame tu edad: ");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Bienvenido");
        }

    }

}
