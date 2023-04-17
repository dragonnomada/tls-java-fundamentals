public class Ejemplo401 {

    public static void main(String[] args) {

        int[] calificaciones = new int[10];

        calificaciones[0] = 10;
        calificaciones[1] = 8;
        calificaciones[2] = 6;
        calificaciones[3] = 7;
        calificaciones[4] = 9;
        calificaciones[5] = 5;
        calificaciones[6] = 10;
        calificaciones[7] = 8;
        calificaciones[8] = 6;
        calificaciones[9] = 10;
        // calificaciones[10] = 5; // ERROR: Sólo podemos tener el índice del 0 al 9
        // Porque la longitud del arreglo es de 10, es decir, hay 10 posibles índices
        // partiendo del 0 hasta llegar al 9 (0, 1, 2, 3, 4, 5, 6, 7, 8, 9).
        // Cualquier índice fuera de ese intervalo no será válido.

        System.out.println("Primera calificación: " + calificaciones[0]);
        System.out.println("Segunda calificación: " + calificaciones[1]);
        System.out.println("Tercera calificación: " + calificaciones[2]);
        System.out.println("Última calificación: " + calificaciones[9]);
        System.out.println("Penúltima calificación: " + calificaciones[8]);
        System.out.println("Antepenúltima calificación: " + calificaciones[7]);

    }

}
