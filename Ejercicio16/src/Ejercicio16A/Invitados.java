package Ejercicio16A;

import java.time.LocalDate;

public class Invitados {

    protected String dni;
    protected String nombre;
    protected LocalDate fechaNacimiento;

    public Invitados(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    @Override
    public String toString() {
        return nombre + " - DNI: " + dni + " - Fecha de nacimiento: " + fechaNacimiento;
    }
}