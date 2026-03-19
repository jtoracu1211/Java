import java.util.Scanner;

public class Tarea7 {
    public static Scanner teclado = new Scanner(System.in);
    public static String[] empleados = new String[3];
    public static int[][] faltas = new int[3][];
    public static void introducir_nombres() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
            empleados[i] = teclado.nextLine();
        }
    }
    public static void introducir_faltas() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.print("\n¿Cuántos días ha faltado " + empleados[i] + "?: ");
            while (!teclado.hasNextInt()) {
                System.out.print("Error, introduce un número entero: ");
                teclado.nextLine();
            }
            int cantidad = teclado.nextInt();
            teclado.nextLine();
            faltas[i] = new int[cantidad];
            for (int j = 0; j < cantidad; j++) {
                System.out.print("Introduce el número del día faltado (" + (j + 1) + " de " + cantidad + "): ");
                while (!teclado.hasNextInt()) {
                    System.out.print("Error, introduce un número entero: ");
                    teclado.nextLine();
                }
                faltas[i][j] = teclado.nextInt();
                teclado.nextLine();
            }
        }
    }
    public static void imprimir_faltas() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("El número de faltas de " + empleados[i] + " es de: " + faltas[i].length + " día(s).");
        }
    }
    public static void empleado_menorFaltas() {
        int indiceMenor = 0;
        int menorFaltas = faltas[0].length;
        for (int i = 1; i < faltas.length; i++) {
            if (faltas[i].length < menorFaltas) {
                menorFaltas = faltas[i].length;
                indiceMenor = i;
            }
        }
        System.out.println("\nEl empleado que faltó menos días es: " + empleados[indiceMenor] + " (" + menorFaltas + " día(s)).");
    }
    public static void main(String[] args) {
        introducir_nombres();
        introducir_faltas();
        imprimir_faltas();
        empleado_menorFaltas();
    }
}
