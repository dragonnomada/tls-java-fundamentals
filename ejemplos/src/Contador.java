public class Contador {

    int conteo = 0;

    void incrementar() {
        conteo = conteo + 1;
    }

    void decrementar() {
        conteo = conteo - 1;
    }

    public static void main(String[] args) {

        // Instanciar un objeto de la clase Contador
        // * Crear un objeto de la clase Contador
        //   que retenga su propia memoria
        //   y aplique sus operaciones
        // SINTAXIS: Declaramos la variable
        //           de tipo Contador, creando
        //           el objeto contador
        Contador contador;

        // Instanciación: Reservar un nuevo objeto
        contador = new Contador();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        System.out.printf("El conteo es: %d %n", contador.conteo);

        contador.decrementar();
        contador.decrementar();
        contador.decrementar();
        contador.decrementar();

        System.out.printf("El conteo es: %d %n", contador.conteo);

    }

}
