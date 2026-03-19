package Tarea01;

import java.util.Comparator;
public class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;
    private double valoracion;
    public Producto(String nombre, double precio, double valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.valoracion = valoracion;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public double getValoracion() {
        return valoracion;
    }
    public String toString() {
        return "nombre= " + nombre + '\'' +
                ", precio=" + precio +
                ", valoracion=" + valoracion;
    }
    public int compareTo(Producto otro) {
        return Double.compare(this.getValoracion(), otro.getValoracion());
    }
    public static Comparator<Producto> ORDEN_PRECIO = new Comparator<Producto>() {
        public int compare(Producto o1, Producto o2) {
            return Double.compare(o1.getPrecio(), o2.getPrecio());
        }
    };
}
