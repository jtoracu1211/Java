import java.util.Scanner;

public class Tarea3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String patron = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";
        System.out.println("Introduce tu direccion IP");
        String ip = teclado.nextLine();
        if (ip.matches(patron)) {
            System.out.println("La IP es correcta");
        } else {
            System.out.println("La IP es incorrecta");
        }
    }
}