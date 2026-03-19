package Tarea1;

public class Ordenador {
    protected String cod_rep;
    protected String cod_cli;
    protected String descripcion;
    protected double presupuesto;
    protected int estado;

    public Ordenador(String cod_rep, String cod_cli, String descripcion) {
        this.cod_rep = cod_rep;
        this.cod_cli = cod_cli;
        this.descripcion = descripcion;
        this.presupuesto = 0;
        this.estado = 0;
    }

    public String getCod_rep() {
        return cod_rep;
    }

    public void setCod_rep(String cod_rep) {
        this.cod_rep = cod_rep;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ordenador [cod_rep=" + cod_rep 
        + ", cod_cli=" + cod_cli + ", descripcion=" 
        + descripcion + ", precio=" + presupuesto 
        + ", estado=" + estado + "]";
    }
}
