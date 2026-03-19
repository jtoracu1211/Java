import java.util.Scanner;

public class Tarea1 {
    public static int [][] numeros = new int [2][5];
    public static Scanner teclado = new Scanner(System.in);
    public static void asignar_numeros (){
        for (int i = 0; i < numeros[0].length; i++) {
            System.out.println("Columna " + (i + 1) + ".");
            for (int j = 0; j < numeros.length; j++) {
                System.out.print("Introduce un número para la posición " + (j+1) + ": ");
                while (!teclado.hasNextInt()) {
                    System.out.print("Error, introduce un número entero: ");
                    teclado.nextLine();
                }
                numeros[j][i] = teclado.nextInt();
                teclado.nextLine();
            }
        }
    }
    public static void imprimir_numeros (){
        for (int i = 0; i < numeros[0].length; i++) {
            System.out.println("\nColumna " + (i + 1) + ".");
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Fila " + (j + 1) + ": " +  numeros[j][i]);
            }
        }
    }
    public static void main(String[] args) {
        asignar_numeros();
        imprimir_numeros();
    }
}
