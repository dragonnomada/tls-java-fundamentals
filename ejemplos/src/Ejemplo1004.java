public class Ejemplo1004 {

    public static void main(String[] args) {

        int[][] matriz = new int[4][6];

        matriz[0][3] = 8;
        matriz[3][2] = 5;
        matriz[1][4] = 3;
        matriz[2][1] = 6;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 6; j++) {

                System.out.printf("%d, %d: %d %n", i, j, matriz[i][j]);

            }

        }

    }

}
