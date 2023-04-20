public class CodigoS303 {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        boolean aMayorB = a > b; // true
        boolean aMenorB = a < b; // false

        if (a > b) {
            System.out.println("A es mayor que B (expresión directa)");
        }

        if (aMayorB) {
            System.out.println("A es mayor que B (valor de la variable)");
        }

        if (true) {
            System.out.println("Este bloque debería ejecutarse");
        }

        if (false) {
            System.out.println("Este bloque NO DEBERÍA ejecutarse");
        }

        if (aMenorB) {
            System.out.println("A es MENOR que B");
        }

        if (!aMenorB) {
            System.out.println("IMPRIME ESTE BLOQUE PORQUE aMenorB no es cierto, pero lo negamos");
        }

        boolean casado = true;
        boolean trabaja = false;
        boolean conflictos = casado && !trabaja || !casado && trabaja;

        if (conflictos) {
            System.out.println("Conflictos seguros porque es casado y no trabaja");
        }

        int x = 3;
        int y = 8;
        int z = 11;

        if (x + y < z || (x < 10 && y > 8) || (x > 3 || y < 5)) {
            System.out.println("SI SE EJECUTA");
        }

    }

}
