import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante {

    String matricula;
    String nombre;
    String carrera;
    LocalDate inscrito;

    public Estudiante() {
        this.matricula = "000000";
        this.nombre = "SIN NOMBRE";
        this.carrera = "SIN CARRERA";
        this.inscrito = LocalDate.of(1970, 1, 1);
    }

    public Estudiante(String matricula) {
        this.matricula = matricula;
        this.nombre = "SIN NOMBRE";
        this.carrera = "SIN CARRERA";
        this.inscrito = LocalDate.of(1970, 1, 1);
    }

    public Estudiante(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = "SIN CARRERA";
        this.inscrito = LocalDate.of(1970, 1, 1);
    }

    public Estudiante(String matricula, String nombre, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.inscrito = LocalDate.of(1970, 1, 1);
    }

    public Estudiante(String matricula, String nombre, String carrera, LocalDate inscrito) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.inscrito = inscrito;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() == 6) {
            this.matricula = matricula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.matches("[A-z][a-z]+\\s*[A-z]*[a-z]*\\s*[A-z]*[a-z]*")) {
            this.nombre = nombre;
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        ArrayList<String> carreras = new ArrayList<>();
        carreras.add("Matemáticas");
        carreras.add("Física");
        carreras.add("Computación");
        carreras.add("Humanidades");
        carreras.add("Sociales");
        carreras.add("Diseño");
        if (carreras.indexOf(carrera) >= 0) {
            this.carrera = carrera;
        }
    }

    public LocalDate getInscrito() {
        return inscrito;
    }

    public void setInscrito(LocalDate inscrito) {
        if (inscrito.getYear() >= 2000) {
            this.inscrito = inscrito;
        }
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", inscrito=" + inscrito +
                '}';
    }
}
