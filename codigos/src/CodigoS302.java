import java.time.LocalDate;

public class CodigoS302 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();

        System.out.println(estudiante1);

        Estudiante estudiante2 = new Estudiante("112233");

        System.out.println(estudiante2);

        Estudiante estudiante3 = new Estudiante("234567", "Pánfilo");

        System.out.println(estudiante3);

        Estudiante estudiante4 = new Estudiante("552121", "Peter",
                "Sociales");

        System.out.println(estudiante4);

        Estudiante estudiante5 = new Estudiante("334422", "Anita",
                "Diseño", LocalDate.of(2020, 5, 3));

        System.out.println(estudiante5);

        Estudiante estudiante6 = new Estudiante();

        // ¿Es correcto? No. No garantizamos la integridad de los datos
        estudiante6.matricula = "88888888888888888";
        estudiante6.nombre = "Hola mundo";
        estudiante6.carrera = "Politiquería";
        estudiante6.inscrito = LocalDate.of(1800, 9, 23);

        System.out.println(estudiante6);

        Estudiante estudiante7 = new Estudiante();

        estudiante7.setMatricula("8888888888888888");
        estudiante7.setNombre("Hola mundo");
        estudiante7.setCarrera("Politiquería");
        estudiante7.setInscrito(LocalDate.of(1800, 9, 23));

        System.out.println(estudiante7);

    }

}
