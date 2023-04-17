import java.util.Scanner;

public class Ejemplo308 {

    public static void main(String[] args) {

        double estatura, peso;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu estatura: ");
        estatura = scanner.nextDouble();

        scanner.nextLine(); // Ya no hay más datos sobre esta línea
        // Por lo que leemos el resto de la línea

        System.out.print("Ingresa tu peso: ");
        peso = scanner.nextDouble();

        scanner.nextLine(); // Ya no hay más datos sobre esta línea
        // Por lo que leemos el resto de la línea

        double imc = peso / Math.pow(estatura, 2); // peso entre estatura al cuadrado

        System.out.println(
                "El índice de masa corporal es: " + imc
        );

    }

}
