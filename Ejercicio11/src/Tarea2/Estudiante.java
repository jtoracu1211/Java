package Tarea2;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellido, String dni, String estadoCivil, String curso) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        return super.toString() + "\nCurso: " + curso;
    }
}
