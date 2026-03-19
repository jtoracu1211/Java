package Tarea1;

public class Cuadrado extends Rectangulo {
    public Cuadrado(String color, String nombre, Punto centro, double ladoMenor, double ladoMayor) {
        super(color, nombre, centro, ladoMenor, ladoMayor);
    }

    public String toString() {
        String cadena = super.toString();
        cadena = cadena.replace("ladoMayor", "lado");
        int pos = cadena.lastIndexOf(",");
        cadena = cadena.substring(0, pos);
        return cadena;
    }
}