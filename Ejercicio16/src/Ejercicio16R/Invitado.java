package Ejercicio16R;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Invitado implements Comparable<Invitado> {
    protected String DNI;
    protected String nombre;
    protected String fecha_nacimiento;

    public Invitado(String DNI, String nombre, String fecha_nacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public int getEdad() {

        LocalDate fecha_nac = LocalDate.parse(fecha_nacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int anios = Period.between(fecha_nac, LocalDate.now()).getYears();
        return anios;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                '}';
    }

    public int compareTo(Invitado otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    public static Comparator<Invitado> ORDEN_EDAD = new Comparator<Invitado>() {
        @Override
        public int compare(Invitado o1, Invitado o2) {
            return o1.getEdad() - o2.getEdad();
        }
    };
}
