public class Jugador {

    int numero;
    String nombre;
    PosicionJugador posicion;
    boolean capitan;

    public Jugador(int numero, String nombre, PosicionJugador posicion, boolean capitan) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
        this.capitan = capitan;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PosicionJugador getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionJugador posicion) {
        this.posicion = posicion;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                ", capitan=" + capitan +
                '}';
    }

}
