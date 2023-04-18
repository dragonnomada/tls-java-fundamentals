import java.util.ArrayList;
import java.util.Arrays;

public class Liga {

    String nombre;

    ArrayList<Equipo> equipos;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "nombre='" + nombre + '\'' +
                ", equipos=" + Arrays.toString(equipos.toArray()) +
                '}';
    }

    void inscribirEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    void generarReporte() {

        System.out.printf("--- LIGA %s ---%n", this.nombre);

        System.out.println("EQUIPOS INSCRITOS:");

        System.out.println("---------------------------------------");

        for (Equipo equipo : this.equipos) {
            System.out.printf("%s (%d)%n", equipo.getNombre(),
                    equipo.jugadores.size());
        }

        System.out.println("---------------------------------------");

        for (Equipo equipo : this.equipos) {

            System.out.printf("=== %s (%d) ===%n", equipo.getNombre(),
                    equipo.jugadores.size());

            System.out.println("=======================================");

            for (Jugador jugador : equipo.jugadores) {
                System.out.printf("%d. [CAPITÁN=%B] %s (%s)%n",
                        jugador.getNumero(), jugador.isCapitan(),
                        jugador.getNombre(), jugador.getPosicion());
            }

            System.out.println("=======================================");

        }

    }

}
