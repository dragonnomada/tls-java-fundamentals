import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    String nombre;
    ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", jugadores=" + Arrays.toString(jugadores.toArray()) +
                '}';
    }

    void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    void quitarJugador(int numero) {
        Jugador jugadorAQuitar = null;

        for (Jugador jugador : this.jugadores) {
            if (jugador.numero == numero) {
                jugadorAQuitar = jugador;
            }
        }

        if (jugadorAQuitar != null) {
            this.jugadores.remove(jugadorAQuitar);
        }
    }

}
