import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio {
    private String Nombre;
    private String Apellidos;
    private LocalDate Fecha_inscripcion;
    private Double Cuota;

    public Socio(String Nombre, String Apellidos, String Fecha_inscripcion, Double Cuota) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.Fecha_inscripcion = LocalDate.parse(Fecha_inscripcion, formatter);
        this.Cuota = Cuota;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public LocalDate getFecha_inscripcion() {
        return Fecha_inscripcion;
    }

    public Double getCuota() {
        return Cuota;
    }

    //para cambiar en un futuro el precio de la cuota
    public void setCuota(Double Cuota) {
        this.Cuota = Cuota;
    }

    //para ver bien los datos de los socios
    public String toString(){

        //creamos el formato de la fecha
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Si tuviesemos la fecha en local date en vez de en String lo hacemos y ponemos la fecha en ese formato .format(dtf);
        return Nombre + " " + Apellidos + " - Cuota: " + Cuota + " -Fecha de inscripción" + Fecha_inscripcion ;
    }
}