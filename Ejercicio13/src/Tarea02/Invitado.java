package Tarea02;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
public class Invitado implements Comparable<Invitado> {
    protected String nombre;
    protected LocalDate fecha_nacimiento;
    public Invitado(String nombre, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public int getEdad() {
        int anios = Period.between(fecha_nacimiento, LocalDate.now()).getYears();
        return anios;
    }
    public String toString() {
        return "Invitado{" +
                " nombre='" + nombre + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                '}';
    }
    public int compareTo(Invitado otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
    public static Comparator<Invitado> ORDEN_EDAD = new Comparator<Invitado>() {
        public int compare(Invitado o1, Invitado o2) {
            return o1.getEdad() - o2.getEdad();
        }
    };
}
