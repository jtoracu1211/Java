import java.util.Scanner;

public class Tarea6 {
    public static Scanner teclado = new Scanner(System.in);
    public static int[][] matriz = new int[5][];
    public static void tamanyo_matriz() {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[i + 1];
        }
    }
    public static void introducir_valores() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce " + (i + 1) + " valores para la fila " + (i + 1) + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Columna " + (j+1) + ": ");
                while (!teclado.hasNextInt()) {
                    System.out.print("Error, introduce un número entero: ");
                    teclado.nextLine();
                }
                matriz[i][j] = teclado.nextInt();
                teclado.nextLine();
            }
        }
    }
    public static void imprimir_valores() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("\nFila " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Columna " + (j+1) + ": " + matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tamanyo_matriz();
        introducir_valores();
        imprimir_valores();
    }
}
