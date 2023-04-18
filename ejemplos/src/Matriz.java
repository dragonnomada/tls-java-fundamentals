public class Matriz {

    double[][] datos;
    int filas;
    int columnas;

    Matriz(int n, int m) {
        datos = new double[n][m];

        this.filas = n;
        this.columnas = m;
    }

    Matriz(int n) {
        datos = new double[n][n];

        this.filas = n;
        this.columnas = n;
    }

    void set(int i, int j, double valor) {
        this.datos[i][j] = valor;
    }

    double get(int i, int j) {
        return this.datos[i][j];
    }

    Matriz transponer() {
        Matriz otraMatriz = new Matriz(this.columnas, this.filas);

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                otraMatriz.set(j, i, this.get(i, j));
            }
        }

        return otraMatriz;
    }

    void mostrarPantalla() {
        System.out.printf("--- MATRIZ %dx%d ---%n", this.filas, this.columnas);
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                System.out.printf("%6.2f ", this.get(i, j));
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

}
