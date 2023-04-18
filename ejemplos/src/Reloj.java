public class Reloj {

    int segundos = 0;
    int minutos = 0;
    int horas = 0;

    void avanzarSegundos() {
        this.segundos = this.segundos + 1;
        if (this.segundos == 60) {
            this.segundos = 0;
            this.avanzarMinutos();
        }
    }

    void avanzarMinutos() {
        this.minutos = this.minutos + 1;
        if (this.minutos == 60) {
            this.minutos = 0;
            this.avanzarHoras();
        }
    }

    void avanzarHoras() {
        this.horas = this.horas + 1;
    }

    void mostrarPantalla() {
        System.out.printf("%02d:%02d:%02d%n", this.horas, this.minutos, this.segundos);
    }

}
