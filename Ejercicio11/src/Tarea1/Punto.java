package Tarea1;

public class Punto {
    public int coordenadaX, coordenadaY;

    public Punto (int coordenadaX, int coordenadaY){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String toString(){
        return "coordenada X = " + coordenadaX + " coordenada Y = " + coordenadaY;
    }
}
