package Tarea1;

public class Forma {
    protected String color, nombre;
    protected Punto centro;

    public Forma(String color, String nombre, Punto centro) {
        this.color = color;
        this.nombre = nombre;
        this.centro = centro;
    }

    public String toString() {
        return "Forma{" +
                "color: '" + color + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", centro: " + centro +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public void getColor() {
        System.out.println("Color: " + this.color);
    }
}
