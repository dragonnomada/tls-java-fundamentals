import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo403 {

    public static void main(String[] args) {

        ArrayList calificaciones = new ArrayList();

        calificaciones.add(10);
        calificaciones.add(6);
        calificaciones.add(8);
        calificaciones.add(7);

        calificaciones.remove(0);

        System.out.println(Arrays.toString(calificaciones.toArray()));

    }

}
