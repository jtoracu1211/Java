package Tarea1;

public class Garantia extends Ordenador {
    private String fechaCompra;

    public Garantia(String cod_reparacion, String cod_cliente, String descripcion, String fechaCompra) {
        super(cod_reparacion, cod_cliente, descripcion);
        this.fechaCompra = fechaCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}