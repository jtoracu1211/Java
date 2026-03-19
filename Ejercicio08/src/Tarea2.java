import java.util.Arrays;
import java.util.Scanner;

public class Tarea2 {
    public static Scanner teclado = new Scanner(System.in);
    public static int n, m;
    public static int [][] matriz;
    public static void n_filas() {
        System.out.print("Introduce la cantidad de filas de la matriz: ");
        n = 0;
        while (n <= 1) {
            if (!teclado.hasNextInt()) {
                System.out.print("Error, introduce un número entero: ");
                teclado.nextLine();
            } else {
                n = teclado.nextInt();
                teclado.nextLine();
                if (n <= 1) {
                    System.out.print("Error, escribe un número mayor que 1: ");
                }
            }
        }
    }
    public static void n_columnas() {
        System.out.print("Introduce la cantidad de columnas de la matriz: ");
        m = 0;
        while (m <= 1) {
            if (!teclado.hasNextInt()) {
                System.out.print("Error, introduce un número entero: ");
                teclado.nextLine();
            } else {
                m = teclado.nextInt();
                teclado.nextLine();
                if (m <= 1) {
                    System.out.print("Error, escribe un número mayor que 1: ");
                }
            }
        }
    }
    public static void generar_valores() {
        matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz [i][j] = (int) (Math.random()*100);
            }
        }
    }
    public static void cambiar_filas() {
        for (int i = 0; i < m; i++) {
            int aux = matriz[0][i];
            matriz[0][i] = matriz[1][i];
            matriz[1][i] = aux;
        }
    }
    public static void imprimir_esquinas() {
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("Esquina superior izquierda de la matriz: " + matriz [0][0]);
        System.out.println("Esquina superior derecha de la matriz: " + matriz [0][m-1]);
        System.out.println("Esquina inferior izquierda de la matriz: " + matriz [n-1][0]);
        System.out.println("Esquina inferior derecha de la matriz: " + matriz [n-1][m-1]);
    }
    public static void main(String[] args) {
        n_filas();
        n_columnas();
        generar_valores();
        // Con poner "System.out.println(Arrays.deepToString(matriz));" aquí, puedes comrpobar si los valores de la matriz están bien generados
        cambiar_filas();
        imprimir_esquinas();
    }
}
