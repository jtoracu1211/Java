package Ejercicio16A;

import java.time.LocalDate;

public class Alergenos extends Invitados {

    private String alergias; // separados por comas

    public Alergenos(String dni, String nombre, LocalDate fechaNacimiento, String alergias) {
        super(dni, nombre, fechaNacimiento);
        this.alergias = alergias;
    }

    public String getAlergias() {
        return alergias;
    }

    @Override
    public String toString() {
        return super.toString() + " - Alergias: " + alergias;
    }
}
