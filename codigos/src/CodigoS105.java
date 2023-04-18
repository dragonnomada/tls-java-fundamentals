import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodigoS105 {

    public static void main(String[] args) {

        // 1. Crear un escáner
        Scanner scanner = new Scanner(System.in);

        // 2. Necesitamos saber cuántas frutas leer
        System.out.print("¿Cuántas frutas quieres ingresar? ");
        int numDeFrutas = scanner.nextInt();
        scanner.nextLine();

        // 3. Crear una lista vacía
        ArrayList frutas = new ArrayList();

        // 4. Mientras la lista tenga menos elementos que los que desean leer
        while (frutas.size() < numDeFrutas) {
            //      4.1 Leer una fruta del usuario
            System.out.printf("Dame el nombre de la fruta %d: ", frutas.size());
            String fruta = scanner.nextLine();
            //      4.2 Agregar la fruta a la lista
            frutas.add(fruta);
        }

        System.out.println(Arrays.toString(frutas.toArray()));

        // 5. Suponer que la fruta de mayor longitud es el texto vacío
        String frutaMayor = "";

        // 6. Para cada fruta en las frutas
        for (Object fruta : frutas) {
            //      6.1 Si la fruta tiene más caracteres que la maxima fruta
            if (fruta.toString().length() > frutaMayor.length()) {
                //             6.1.1 Actualizar la máxima fruta a esta fruta
                //frutaMayor = fruta.toString();
                frutaMayor = (String) fruta;
            }
        }

        // 7. Imprimir la fruta de longitud máxima
        System.out.printf("La fruta de mayor longitud es: %s %n", frutaMayor);

    }

}
