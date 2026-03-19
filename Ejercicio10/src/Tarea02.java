import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarea02 {
    private String nombre, ip, descripcion;
    private LocalDate fechaServicio;
    private Boolean web, dns, ftp;
    private int puertoWeb, puertoDns, puertoFtp;
    public Tarea02(String nombre, String ip, String descripcion, String fechaServicio, Boolean web, Boolean dns, Boolean ftp) {
        this.nombre = nombre;
        this.ip = ip;
        this.descripcion = descripcion;
        this.fechaServicio = LocalDate.parse(fechaServicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.web = web;
        this.dns = dns;
        this.ftp = ftp;
    }
    public void cambiarEstadoServicio(String servicio, Boolean estado){
        if (estado){
            if (servicio.equals("web")){
                this.web = true;
                this.puertoWeb = 80;
            }else if (servicio.equals("dns")){
                this.dns = true;
                this.puertoDns = 21;
            }else{
                this.ftp = true;
                this.puertoFtp = 53;
            }
        }else{
            if (servicio.equals("web")){
                this.web = false;
                this.puertoWeb = 0;
            }else if (servicio.equals("dns")){
                this.dns = false;
                this.puertoDns = 0;
            }else{
                this.ftp = false;
                this.puertoFtp = 0;
            }
        }
    }
    public void cambiarPuerto(String puerto, int numero){
        if (puerto.equals("web")){
            this.puertoWeb = numero;
        }else if (puerto.equals("dns")){
            this.puertoDns = numero;
        }else{
            this.puertoFtp = numero;
        }
    }
    public String getNombre() {
        return nombre;
    }
    public String getIp() {
        return ip;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getFechaServicio() {
        return fechaServicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public Boolean getWeb() {
        return web;
    }
    public Boolean getDns() {
        return dns;
    }
    public Boolean getFtp() {
        return ftp;
    }
    public int getPuertoWeb() {
        return puertoWeb;
    }
    public int getPuertoDns() {
        return puertoDns;
    }
    public int getPuertoFtp() {
        return puertoFtp;
    }
    public static void main(String[] args) {
        Tarea02 servidor1 = new Tarea02("servidorweb", "196.168.0.5", "web del instituto", "21/01/2024", true, false, false);
        System.out.println(servidor1.getNombre());
        System.out.println(servidor1.getIp());
        System.out.println(servidor1.getDescripcion());
        System.out.println(servidor1.getFechaServicio());
        System.out.println(servidor1.getWeb());
        System.out.println(servidor1.getDns());
        System.out.println(servidor1.getFtp());
        System.out.println(servidor1.getPuertoWeb());
        System.out.println(servidor1.getPuertoDns());
        System.out.println(servidor1.getPuertoFtp());
        servidor1.cambiarEstadoServicio("ftp", true);
        System.out.println(servidor1.getFtp());
        System.out.println(servidor1.getPuertoFtp());
        servidor1.cambiarPuerto("web", 8080);
        System.out.println(servidor1.getWeb());
        System.out.println(servidor1.getPuertoWeb());
    }
}
