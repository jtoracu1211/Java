package Ejercicio16;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Invitado implements Comparable<Invitado>{
    protected String dni, nombre,fechaNacimiento;

    public Invitado(String dni, String nombre, String fechaNacimiento) {
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

    public int getEdad(){
        LocalDate fecha_nac = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int anios = Period.between(fecha_nac, LocalDate.now()).getYears();
        return anios;
    }

    public int compareTo(Invitado otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
}
