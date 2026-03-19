import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = "S";
        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Introduce la referencia (2 letras mayúsculas y 4 dígitos): ");
            String referencia = teclado.nextLine();
            while(!referencia.matches("[A-Z]{2}[0-9]{4}")) {
                System.out.println("Referencia inválida, introdúcela de nuevo: ");
                referencia = teclado.nextLine();
            }
            System.out.println("Introduce la cantidad (entero): ");
            String cantidad = teclado.nextLine();
            while(!cantidad.matches("[0-9]+")) {
                System.out.println("Cantidad inválida, introdúcela de nuevo: ");
                cantidad = teclado.nextLine();
            }
            System.out.println("Introduce el precio (double): ");
            String precio = teclado.nextLine();
            while(!precio.matches("[0-9]+(\\.[0-9]+)?")) {
                System.out.println("Precio inválido, introdúcelo de nuevo: ");
                precio = teclado.nextLine();
            }
            System.out.println("Producto registrado correctamente.");
            System.out.println("¿Quieres introducir otro producto? (S/N): ");
            continuar = teclado.nextLine();
        }
        System.out.println("Registro finalizado");
    }
}
