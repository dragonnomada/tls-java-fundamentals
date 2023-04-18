public class Robot2DTest {

    public static void main(String[] args) {

        Robot2D robot = new Robot2D();

        robot.describir();

        robot.avanzarNorte();
        robot.describir();

        robot.avanzarEste();
        robot.describir();

        robot.avanzarSur();
        robot.describir();

        robot.avanzarOeste();
        robot.describir();

        if (robot.estaEnOrigen()) {
            System.out.println("El robot está en el origen");
        } else {
            System.out.println("El robot no está en el origen");
        }

    }

}
