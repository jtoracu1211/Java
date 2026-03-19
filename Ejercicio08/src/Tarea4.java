import java.util.*;
public class Tarea4 {
    public static int[][] matriz = new int[3][4];
    public static int[] sumaFilas = new int[3], sumaColumnas = new int[4];
    public static void generar_valores() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.random() * 39) + 2;
            }
        }
    }
    public static void sumas() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFilas[i] = sumaFilas[i] + matriz[i][j];
                sumaColumnas[j] = sumaColumnas[j] + matriz[i][j];
            }
        }
    }
    public static void imprimir_sumaFilas(){
        System.out.println("Suma de cada fila:");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }
    }
    public static void imprimir_sumaColumnas(){
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < sumaColumnas.length; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas[j]);
        }
    }
    public static void main(String[] args) {
        generar_valores();
        // Para comprobar los valores de la matriz, escribir "System.out.println(Arrays.deepToString(matriz));" aquí
        sumas();
        imprimir_sumaFilas();
        imprimir_sumaColumnas();
    }
}
