import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre (entre 5 y 20 caracteres de longiyud, tiene que empezar por una letra y solo puede contener, letras, números o guiones): ");
        String nombre = teclado.nextLine();
        while(!(nombre.matches("^[a-zA-Z][a-zA-Z0-9_-]{4,19}$"))){
            System.out.println("Error, el nombre no tiene una longitud dentro del intervalo dicho y/o no empieza por una letra y/o tiene un carácter no permitido, introduce otro: ");
            nombre = teclado.nextLine();
        }
    }
}
