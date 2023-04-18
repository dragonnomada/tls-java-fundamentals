class Contador {
    int conteo = 0;
    void incrementar() {
        // this es la referencia interna al objeto
        this.conteo = this.conteo + 1;
    }
}

public class CodigoS201 {

    public static void main(String[] args) {

        new Contador(); // objeto basura 1
        new Contador(); // objeto basura 2
        new Contador(); // objeto basura 3
        new Contador(); // objeto basura 4

        Contador miContador; // variable tipo objeto
        // Capaz de guardar la referencia a un objeto

        // Crear un nuevo objeto y almacenar su referencia
        miContador = new Contador(); // objeto referenciado

        // miContador es una referencia
        miContador.conteo = miContador.conteo + 1;

        Contador otroContador; // variable de tipo objeto
        // Capaz de guardar la referencia a un objeto
        // de tipo Contador

        otroContador = miContador; // ambas variables
        // hacen referencia al mismo objeto

    }
}
