import java.util.Scanner;

public class Tarea05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduzca su direccion: ");
        String direccion = teclado.nextLine();
        System.out.println("Introduzca su teléfono: ");
        String telefono = teclado.nextLine();
        System.out.println("El nombre es: " + nombre);
        System.out.println("La direccion es: " + direccion);
        System.out.println("El telefono es: " + telefono);
        teclado.close();
    }
}
