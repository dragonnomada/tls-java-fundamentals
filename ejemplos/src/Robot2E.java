public class Robot2E extends Robot2D {

    String nombre = "SIN NOMBRE";
    boolean encendido = false;

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    @Override
    public void avanzarNorte() {
        if (this.encendido) {
            // Llama al método definido en la clase superior
            // Es decir, de la superclase invoca ese método
            super.avanzarNorte();
        }
    }

    @Override
    public void avanzarSur() {
        if (this.encendido) {
            super.avanzarSur();
        }
    }

    @Override
    public void avanzarEste() {
        if (this.encendido) {
            super.avanzarEste();
        }
    }

    @Override
    public void avanzarOeste() {
        if (this.encendido) {
            super.avanzarOeste();
        }
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.encendido + " "
                + super.toString().replace("Robot2D", "Robot2E");
    }

}
