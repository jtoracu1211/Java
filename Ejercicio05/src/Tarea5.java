import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu DNI: ");
        String dni = teclado.nextLine().toUpperCase();
        if (dni.matches("[0-9]{8}[A-HJ-NP-TV-Z]")) {
            System.out.println("DNI válido");
        } else {
            System.out.println("DNI inválido");
        }
    }
}
