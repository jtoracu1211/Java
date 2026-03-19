package Tarea3;

public class Jugador {
    private Dado dado1;
    private Dado dado2;

    public Jugador() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void lanzarDados() {
        dado1.lanzar();
        dado2.lanzar();
    }

    public int getDado1() {
        return dado1.getValor();
    }

    public int getDado2() {
        return dado2.getValor();
    }

    public int sumaDados() {
        return getDado1() + getDado2();
    }

    public int contarSeises() {
        int contador = 0;
        if (getDado1() == 6) contador++;
        if (getDado2() == 6) contador++;
        return contador;
    }
}
