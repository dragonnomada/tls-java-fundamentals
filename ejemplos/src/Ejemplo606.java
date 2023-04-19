public class Ejemplo606 {

    public static void main(String[] args) {

        String texto = "123";

        int a = Integer.parseInt(texto);

        System.out.println(a);

        String texto2 = "123.45678";

        double b = Double.parseDouble(texto2);

        System.out.println(b);

        String texto3 = "TRUE"; // "TRUE", "true", "false", "FALSE"

        boolean c = Boolean.parseBoolean(texto3);

        System.out.println(c);

    }

}
