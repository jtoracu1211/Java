package Tarea2;

public class Empleado extends Persona {
    protected String anyoIncorporacion;
    protected String numeroTrabajador;

    public Empleado(String nombre, String apellido, String dni, String estadoCivil, String anyoIncorporacion, String numeroTrabajador) {
        super(nombre, apellido, dni, estadoCivil);
        this.anyoIncorporacion = anyoIncorporacion;
        this.numeroTrabajador = numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String toString() {
        return super.toString() + "\nAño de incorporacion: " + anyoIncorporacion +
                "\nNumero de Trabajador: " + numeroTrabajador;
    }
}
