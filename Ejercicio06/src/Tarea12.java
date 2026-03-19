import java.util.Scanner;

public class Tarea12 {
    public static Scanner teclado = new Scanner(System.in);
    public static int[] cromos = new int[100];
    public static int opcion, num, cantidad;
    public static void mostrarMenu() {
        System.out.println("1. Entrada de un cromo nuevo");
        System.out.println("2. Consulta de un cromo");
        System.out.println("3. Lista de cromos repetidos");
        System.out.println("4. Lista de cromos pendientes");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }
    public static void entradaCromo() {
        System.out.print("Introduce número de cromo (1-100): ");
        num = teclado.nextInt();
        if (num < 1 || num > 100) {
            do {
                System.out.println("Número inválido, introduce otro: ");
                num = teclado.nextInt();
            } while (num < 1 || num > 100);
        }
        cromos[num - 1]++;
        System.out.println("Cromo añadido correctamente.");
    }
    public static void consultarCromo() {
        System.out.print("Introduce cromo a consultar (1-100): ");
        num = teclado.nextInt();
        if (num < 1 || num > 100) {
            do {
                System.out.println("Número inválido, introduce otro: ");
                num = teclado.nextInt();
            } while (num < 1 || num > 100);
        }
        cantidad = cromos[num - 1];
        if (cantidad == 0) {
            System.out.println("No tienes ese cromo.");
        } else {
            System.out.println("Tienes el cromo " + num + " " + cantidad + " veces.");
        }
    }
    public static void listarRepetidos() {
        boolean hayRepetidos = false;
        System.out.println("Cromos repetidos:");
        for (int i = 0; i < cromos.length; i++) {
            if (cromos[i] > 1) {
                System.out.println("Cromo " + (i + 1) + ": " + cromos[i]);
                hayRepetidos = true;
            }
        }
        if (!hayRepetidos) {
            System.out.println("No tienes ningún cromo repetido.");
        }
    }
    public static void listarPendientes() {
        boolean hayPendientes = false;
        System.out.println("Cromos pendientes:");
        for (int i = 0; i < cromos.length; i++) {
            if (cromos[i] == 0) {
                System.out.println("Cromo " + (i + 1));
                hayPendientes = true;
            }
        }
        if (!hayPendientes) {
            System.out.println("No te falta ningún cromo.");
        }
    }
    public static void main(String[] args) {
        opcion = 0;
        while (opcion != 5) {
            mostrarMenu();
            opcion = teclado.nextInt();
            if (opcion == 1) {
                entradaCromo();
            } else if (opcion == 2) {
                consultarCromo();
            } else if (opcion == 3) {
                listarRepetidos();
            } else if (opcion == 4) {
                listarPendientes();
            } else if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida.");
            }
        }
    }
}
