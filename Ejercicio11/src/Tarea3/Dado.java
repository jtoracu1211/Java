package Tarea3;

public class Dado {
    private int valor;

    public void lanzar() {
        valor = (int)(Math.random() * 6) + 1; // números del 1 al 6
    }

    public int getValor() {
        return valor;
    }
}
