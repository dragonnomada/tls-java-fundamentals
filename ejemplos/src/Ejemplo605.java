public class Ejemplo605 {

    public static void main(String[] args) {

        int suma = 0;

        // 1 + 6 + 11 + 16 + 21 + 27 + ... + 91 + 97
        // for (int i = 1; i <= 100; i += 5) {

        // 1 + 2 + 3 + 4 + 5 + ... + 98 + 99 + 100
        for (int i = 1; i <= 100; i++) {
            suma += i; // suma = suma + i
        }

        System.out.println(suma);

    }

}
