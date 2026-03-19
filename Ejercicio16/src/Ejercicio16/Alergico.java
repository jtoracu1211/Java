package Ejercicio16;

public class Alergico extends Invitado{
    private String alergeno;

    public Alergico(String dni, String nombre, String fechaNacimiento, String alergeno) {
        super(dni, nombre, fechaNacimiento);
        this.alergeno = alergeno;
    }

    public String getAlergeno() {
        return alergeno;
    }
}
