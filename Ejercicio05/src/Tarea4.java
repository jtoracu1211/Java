import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número (si es hexadecimal debe empezar con #): ");
        String num = teclado.nextLine();
        if (num.matches("^#[0-9a-fA-F]{0,10}")) {
            System.out.println("El número es hexadecimal");
        }else {
            System.out.println("No es un número hexadecimal");
        }
    }
}
