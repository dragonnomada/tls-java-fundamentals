public class Robot2ETest {

    public static void main(String[] args) {

        Robot2D robot1 = new Robot2D();

        robot1.avanzarNorte();

        System.out.println(robot1); // Robot2D{x=0, y=1}

        Robot2D robot2 = new Robot2D();

        robot2.avanzarOeste();

        System.out.println(robot2); // Robot2D{x=-1, y=0}

        Robot2E robot3 = new Robot2E();

        robot3.asignarNombre("Arturito");

        robot3.encender();

        robot3.avanzarNorte();

        System.out.println(robot3); // Arturito true Robot2E{x=0, y=1}

    }

}
