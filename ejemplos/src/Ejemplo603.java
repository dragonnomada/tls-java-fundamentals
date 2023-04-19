import java.util.Scanner;

public class Ejemplo603 {

    public static void main(String[] args) {

        String mensaje = "Hola reportate a RH para tu despido.\nJaja no es cierto\n23";

        Scanner scanner = new Scanner(mensaje);

        //String linea = scanner.findInLine("Jaja");

        //System.out.println(linea);

        String linea1 = scanner.nextLine();
        String linea2 = scanner.nextLine();
        int numero = scanner.nextInt();

        System.out.println(linea1);
        System.out.println(linea2);
        System.out.println(numero * numero);

        scanner = new Scanner(mensaje);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

    }

}
