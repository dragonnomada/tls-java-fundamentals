public class Ejemplo502 {

    public static void main(String[] args) {

        Matriz matriz = new Matriz(4, 6);

        matriz.set(2, 4, 8);
        matriz.set(3, 1, -1);
        matriz.set(1, 1, 100);

        matriz.mostrarPantalla();

    }

}
