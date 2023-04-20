import java.util.ArrayList;

public class CodigoS402 {

    public static void main(String[] args) {

        ArrayList<Double> calificaciones = new ArrayList<>();

        calificaciones.add(10.0);
        calificaciones.add(9.0);
        calificaciones.add(9.5);
        calificaciones.add(5.0);

        calificaciones.forEach(valor -> {
            System.out.println(valor);
        });

    }

}
