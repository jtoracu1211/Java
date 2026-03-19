package Tarea1;

public class Rectangulo extends Forma{
    protected double ladoMenor, ladoMayor;
    public Rectangulo(String color, String nombre, Punto centro, double ladoMenor, double ladoMayor) {
        super(color, nombre, centro);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public String toString() {
        return "Rectangulo{" +
                "color: '" + color + '\'' +
                ", nombre: '" + nombre + '\'' +
                ", centro: " + centro +
                ", ladoMenor: " + ladoMenor +
                ", ladoMayor: " + ladoMayor +
                 '}';
    }

    public double area() {
        return ladoMenor * ladoMayor;
    }

    public double perimetro() {
        return 2 * (ladoMenor + ladoMayor);
    }

    public void cambiarTamano(double factor) {
        this.ladoMenor = ladoMenor * factor;
        this.ladoMayor = ladoMayor * factor;
    }
}
