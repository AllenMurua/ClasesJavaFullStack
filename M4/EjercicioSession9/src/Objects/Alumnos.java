package Objects;

public class Alumnos extends Profesors{
    private String tareasPendientes;
    private Profesors profesor;

    public Alumnos() {
    }

    public Alumnos(String tareasPendientes, String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.tareasPendientes = tareasPendientes;
    }

    public Alumnos(String nombre, String fechaNacimiento, String tareasPendientes, Profesor profesor) {
        super(nombre, fechaNacimiento);
        this.tareasPendientes = tareasPendientes;
        this.profesor = profesor;
    }

    public String getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(String tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    public Profesors getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesors profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "tareasPendientes='" + tareasPendientes + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
