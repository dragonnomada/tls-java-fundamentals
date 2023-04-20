import java.util.Scanner;

public class CodigoS304 {

    public static void main(String[] args) {

        System.out.println("Selecciona una opción:");
        System.out.println("1. Saludar con Hola");
        System.out.println("2. Mostrar una carita feliz");
        System.out.println("3. Decir adiós");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Elije bien: ");
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Hola mundo");
                break;

            case 2:
                System.out.println("ಥ_ಥ");
                break;

            case 3:
                System.out.println("Bye bye");
                break;

            default:
                System.out.println("Opción no válida 😒");
                break;
        }

    }

}
