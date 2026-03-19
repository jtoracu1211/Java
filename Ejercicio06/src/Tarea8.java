import java.util.*;

public class Tarea8 {
    public static String[] vector = new String[10];
    public static Scanner teclado = new Scanner(System.in);
    public static String cadena;
    public static Boolean coincide = false;

    public static void cadenas_vector() {
        for (int i = 0; i < vector.length; i++){
            System.out.println("Introduce una cadena para la posición " + (i + 1) + ": ");
            vector[i] = teclado.nextLine();
        }
    }

    public static void escribe_cadena() {
        System.out.println("Escribe una cadena: ");
        cadena = teclado.nextLine();
    }
    public static void comprobar() {
        for (int i = 0; i < vector.length; i++){
            if (vector[i].equals(cadena)){
                System.out.println("Esta cadena pertenece a la posición: " + (i + 1));
                coincide = true;
            }
        }
    }
    public static void no_coincide() {
        if (!coincide){
            System.out.println("Esa cadena no coincide con ninguna de las del vector");
        }
    }
    public static void main(String[] args) {
        cadenas_vector();
        escribe_cadena();
        comprobar();
        no_coincide();
    }
}
