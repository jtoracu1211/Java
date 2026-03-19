package Tarea1;

public class Elipse extends Forma{
    protected double radioMayor;
    protected double radioMenor;
    static final double PI=3.1415;
    public Elipse(String color, String nombre, Punto centro, double radioMayor, double radioMenor) {
        super(color, nombre, centro);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    public double area(){
        return PI*radioMayor*radioMenor;
    }
    public String toString() {
        return super.toString()+
                "radioMayor=" + radioMayor +
                ", radioMenor=" + radioMenor ;
    }
}