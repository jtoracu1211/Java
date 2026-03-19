package Tarea2;

import java.util.Stack;
public class Ficha {
    private short x;
    private short y;
    static Stack<Ficha> done = new Stack<Ficha>();
    static Stack<Ficha> undone = new Stack<Ficha>();
    Ficha() {
        this.x = 0;
        this.y = 0;
    }
    Ficha(short x, short y) {
        this.x = x;
        this.y = y;
    }
    public void arriba() {
        this.y += 1;
        done.push(new Ficha(this.x, this.y));
        undone.clear();
    }
    public void abajo() {
        this.y -= 1;
        done.push(new Ficha(this.x, this.y));
        undone.clear();
    }
    public void izquierda() {
        this.x -= 1;
        done.push(new Ficha(this.x, this.y));
        undone.clear();
    }
    public void derecha() {
        this.x += 1;
        done.push(new Ficha(this.x, this.y));
        undone.clear();
    }
    public boolean undo() {
        if (done.isEmpty()) return false;
        Ficha ficha = done.pop();
        this.x = ficha.x;
        this.y = ficha.y;
        undone.push(ficha);
        return true;
    }
    public boolean redo() {
        if (undone.isEmpty()) return false;
        Ficha ficha = undone.pop();
        this.x = ficha.x;
        this.y = ficha.y;
        return true;
    }
    public String toString() {
        return "Ficha (" + x + "," + y + ") ";
    }
}