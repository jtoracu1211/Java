import java.util.*;
public class Tarea11 {
    public static int[] botellas = new int[100];
    public static void asignar_impurezas(){
        for (int i = 0; i < 50; i++) {
            botellas[(int) (Math.random()*100)]++;
        }
    }
    public static void comprobar_aceptadas(){
        int aceptadas = 0;
        for (int i = 0; i < botellas.length; i++) {
            if (botellas[i] == 0) {
                aceptadas++;
            }
        }
        System.out.println("Se aceptaron: " + aceptadas + " botellas");
    }
    public static void main(String[] args) {
        asignar_impurezas();
        comprobar_aceptadas();
    }
}
