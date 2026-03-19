package Tarea2;

public class Persona {
    protected String nombre, apellido, dni, estadoCivil;

    public Persona(String nombre, String apellido, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nDNI: " + dni +
                "\nEstado Civil: " + estadoCivil;
    }
}
