import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo1003 {

    public static void main(String[] args) {

        ArrayList<Integer> primos = new ArrayList<>();

        int n = 2;

        while (primos.size() < 100) {
            boolean esPrimo = true;
            for (int primo : primos) {
                if (n % primo == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                primos.add(n); // 2, 3, 5, 7, ...
            }
            n++; // 3, 4, 5, 6, 7, 8, ...
        }

        System.out.println(Arrays.toString(primos.toArray()));

    }

}
