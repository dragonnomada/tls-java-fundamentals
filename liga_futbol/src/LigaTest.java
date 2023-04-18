public class LigaTest {

    public static void main(String[] args) {

        Equipo america = new Equipo("América");
        Equipo cruzAzul = new Equipo("Cruz Azul");
        Equipo tuzos = new Equipo("Tuzos");

        america.agregarJugador(
                new Jugador(1, "Memo Ochoa",
                        PosicionJugador.GUARDAMETA, true)
        );
        america.agregarJugador(
                new Jugador(10, "Oliver Atom",
                        PosicionJugador.CENTRAL, false)
        );
        america.agregarJugador(
                new Jugador(12, "Chicharito",
                        PosicionJugador.DEFENSA_CENTRAL, false)
        );

        cruzAzul.agregarJugador(
                new Jugador(11, "Jesús Corona",
                        PosicionJugador.GUARDAMETA, false)
        );
        cruzAzul.agregarJugador(
                new Jugador(20, "Steve Hyuga",
                        PosicionJugador.DELANTERO_DERECHO, true)
        );
        cruzAzul.agregarJugador(
                new Jugador(22, "Paco Palencia",
                        PosicionJugador.BANCA, false)
        );

        tuzos.agregarJugador(
                new Jugador(2, "Conejo Pérez",
                        PosicionJugador.GUARDAMETA, true)
        );
        tuzos.agregarJugador(
                new Jugador(23, "Chucky",
                        PosicionJugador.DELANTERO_IZQUIERDO, false)
        );
        tuzos.agregarJugador(
                new Jugador(8, "Benji Pice",
                        PosicionJugador.GUARDAMETA, false)
        );

        Liga mx = new Liga("MX");

        mx.inscribirEquipo(america);
        mx.inscribirEquipo(cruzAzul);
        mx.inscribirEquipo(tuzos);

        mx.generarReporte();

    }

}
