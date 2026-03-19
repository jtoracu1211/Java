package Tarea2;

public class Profesor extends Empleado {
    private String departamento;

    public Profesor(String nombre, String apellido, String dni, String estadoCivil, String anyoIncorporacion, String numeroAsociado, String departamento) {
        super(nombre, apellido, dni, estadoCivil, anyoIncorporacion, numeroAsociado);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento;
    }
}
