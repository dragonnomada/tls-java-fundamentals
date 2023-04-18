public class RelojTest {

    public static void main(String[] args) {

        Reloj reloj = new Reloj();

        reloj.mostrarPantalla(); // 00:00:00

        reloj.avanzarSegundos();
        reloj.avanzarSegundos();
        reloj.avanzarSegundos();
        reloj.avanzarSegundos();
        reloj.avanzarSegundos();

        reloj.mostrarPantalla(); // 00:00:05

        while (true) {
            reloj.avanzarSegundos();
            reloj.mostrarPantalla();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
