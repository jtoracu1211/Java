package Tarea1;

public class Circulo extends Elipse{
    public Circulo(String color, String nombre, Punto centro, double radio) {
        super(color, nombre, centro, radio, radio);
    }
    public String toString(){
        String cadena =super.toString();
        cadena=cadena.replace("radioMayor","radio");
        int pos=cadena.lastIndexOf(",");
        cadena=cadena.substring(0,pos);
        return cadena;
    }
}
