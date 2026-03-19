package Tarea2;

public class Principal {
    public static void main(String[] args) {
        Ficha ficha = new Ficha();
        for (int i = 1; i <= 5; i++)
            ficha.arriba();
        System.out.println(ficha.toString());
        for (int i = 1; i <= 6; i++)
            ficha.derecha();
        System.out.println(ficha.toString());
        ficha.abajo();
        ficha.abajo();
        System.out.println(ficha.toString());
        for (int i = 1; i <= 4; i++)
            ficha.izquierda();
        System.out.println(ficha.toString());
        for (int i = 1; i <= 7 + 1; i++)
            ficha.undo();
        System.out.println(ficha.toString());
        for (int i = 1; i <= 3 + 1; i++)
            ficha.redo();
        System.out.println(ficha.toString());
        ficha.arriba();
        System.out.println(ficha.toString());
        ficha.redo();
        System.out.println(ficha.toString());
    }
}