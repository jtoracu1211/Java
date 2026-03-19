package Tarea2;

public class Personal extends Empleado {
    private String zona;

    public Personal(String nombre, String apellido, String dni, String estadoCivil, String anyoIncorporacion, String numeroAsociado, String zona) {
        super(nombre, apellido, dni, estadoCivil, anyoIncorporacion, numeroAsociado);
        this.zona = zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String toString() {
        return super.toString() + "\nZona: " + zona;
    }
}
