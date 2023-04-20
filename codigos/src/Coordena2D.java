public class Coordena2D implements IPunto2D {

    double latitud;
    double longitud;

    public Coordena2D(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public double getX() {
        return this.longitud * 40075 / 180;
    }

    @Override
    public double getY() {
        return this.latitud * 40075 / 90;
    }
}
