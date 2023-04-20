public class Robot2D {

    int x = 0;
    int y = 0;

    void avanzarNorte() {
        this.y = this.y + 1;
    }

    void avanzarSur() {
        this.y = this.y - 1;
    }

    void avanzarEste() {
        this.x = this.x + 1;
    }

    void avanzarOeste() {
        this.x = this.x - 1;
    }

    void describir() {
        System.out.printf("Robot (%d, %d) %n", this.x, this.y);
    }

    boolean estaEnOrigen() {
        boolean origenX = this.x == 0;
        boolean origenY = this.y == 0;

        boolean origen = origenX && origenY;

        return origen;
        //return this.x == 0 && this.y == 0;
    }

    @Override
    public String toString() {
        return "Robot2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
