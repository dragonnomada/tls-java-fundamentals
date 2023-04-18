public class CodigoS107 {

    public static void main(String[] args) {

        int[] valores = new int[5];

        valores[0] = 99;
        valores[1] = 104;
        valores[2] = 5;
        valores[3] = 480;
        valores[4] = 103;

        int mayor = Integer.MIN_VALUE;

        if (valores[0] > mayor) {
            mayor = valores[0];
        }
        if (valores[1] > mayor) {
            mayor = valores[1];
        }
        if (valores[2] > mayor) {
            mayor = valores[2];
        }
        if (valores[3] > mayor) {
            mayor = valores[3];
        }
        if (valores[4] > mayor) {
            mayor = valores[4];
        }

        System.out.printf("El valor mayor es: %d %n", mayor);
    }

}
