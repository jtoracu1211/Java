package Ejercicio16R;

public class Alergico extends Invitado {
    protected String alergias;

    public Alergico(String DNI, String nombre, String fecha_nacimiento, String alergias) {
        super(DNI, nombre, fecha_nacimiento);
        this.alergias = alergias;
    }

    public String getAlergias() {
        return alergias;
    }

    @Override
    public String toString() {
        return super.toString() + "Alergico{" +
                "alergias='" + alergias + '\'' +
                '}';
    }

}
