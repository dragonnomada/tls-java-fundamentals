import java.util.Scanner;

public class Ejemplo307 {

    public static void main(String[] args) {

        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");

        edad = scanner.nextInt();

        System.out.println(
                "😒 ¿Seguro que tienes " + edad + " años?"
        );

    }

}
