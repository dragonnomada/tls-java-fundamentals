import java.util.Scanner;

public class CodigoS301Ejercicio {

    public static void main(String[] args) {

        double s1, s2, s3;
        double m, a;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa S1 S2 S3: ");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();

        scanner.nextLine();

        m = (s1 + s2 + s3) / 2;

        a = Math.sqrt(m * (m - s1) * (m - s2) * (m - s3));

        System.out.printf("Área = %.4f %n", a);

    }

}