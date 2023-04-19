public class Ejemplo901 {

    public static void main(String[] args) {

        int n = 1;

        int sumaImpares = 0;
        int sumaPares = 0;

        while (n < 100) {

            // Si `n` es divisible por 2 su residuo será de 0
            // es decir, será múltiplo de 2, por lo que será par
            if (n % 2 == 0) {
                sumaPares = sumaPares + n;
            } else {
                sumaImpares = sumaImpares + n;
            }

            // No olvidemos incrementar `n` o el programa se ciclará
            n = n + 1;

        }

        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);

    }

}
