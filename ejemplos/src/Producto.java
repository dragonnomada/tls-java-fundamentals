public class Producto {

    long id;
    String nombre;
    String descripcion;
    double precio;
    int existencias;

    public Producto(long id) {
        this.id = id;
        this.nombre = "SIN NOMBRE";
        this.descripcion = "SIN DESCRIPCIÓN";
        this.precio = 0.01;
        this.existencias = 0;
    }

    public Producto(long id, String nombre, double precio, int existencias) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = "SIN DESCRIPCIÓN";
        this.precio = precio;
        this.existencias = existencias;
    }

    public Producto(long id, String nombre, String descripcion, double precio, int existencias) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getExistencias() {
        return this.existencias;
    }

    public void actualizarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        if (precio >= 0.01) {
            this.precio = precio;
        } else {
            this.precio = 0.01;
        }
    }

    public void setExistencias(int existencias) {
        if (existencias >= 0) {
            this.existencias = existencias;
        } else {
            this.existencias = 0;
        }
    }
}
