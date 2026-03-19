import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea01 {
    private String matricula;
    private int maxBateria;
    private String descripcion;
    private LocalDate fechaMat;
    private int nivelBateria;
    private boolean servicio;
    public Tarea01(String matricula, int maxBateria, String descripcion, String fechaMat, int nivelBateria, boolean servicio) {
        this.matricula = matricula;
        this.maxBateria = maxBateria;
        this.descripcion = descripcion;
        this.fechaMat = LocalDate.parse(fechaMat,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.nivelBateria = nivelBateria;
        this.servicio = servicio;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getMaxBateria() {
        return maxBateria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getFechaMat() {
        return fechaMat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public int getNivelBateria() {
        return nivelBateria;
    }
    public boolean getServicio() {
        return servicio;
    }
    public void utilizarEnergia() {
        if (this.nivelBateria == 0) {
            System.out.println("La bateria esta totalmente agotada");
        } else {
            this.nivelBateria--;
            if (getPorcentajeBateria() > 10) this.servicio = true;
            else this.servicio = false;
        }
    }
    public void recargarEnergia() {
        if (this.nivelBateria == this.maxBateria) {
            System.out.println("La bateria ya esta al maximo");
        } else {
            this.nivelBateria++;
            if (getPorcentajeBateria() > 10) this.servicio = true;
            else this.servicio = false;
        }
    }
    public int getPorcentajeBateria() {
        return (this.nivelBateria * 100) / this.maxBateria;
    }
    public static void main(String[] args) {
        Tarea01 miCoche = new Tarea01("JTT2664", 70000, "Tesla Model 3 V2", "01/12/2021", 32561, true);
        System.out.println("El porcentaje de la bateria es: " + miCoche.getPorcentajeBateria());
        System.out.println("El estado del servicio es: " + miCoche.getServicio());
        for (int i = 1; i < 30000; i++) miCoche.utilizarEnergia();
        System.out.println("El porcentaje de la bateria es: " + miCoche.getPorcentajeBateria());
        System.out.println("El estado del servicio es: " + miCoche.getServicio());
        for (int i = 1; i < 30000; i++) miCoche.recargarEnergia();
        System.out.println("El porcentaje de la bateria es: " + miCoche.getPorcentajeBateria());
        System.out.println("El estado del servicio es: " + miCoche.getServicio());
    }
}