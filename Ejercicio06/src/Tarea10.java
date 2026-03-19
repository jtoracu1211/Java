import java.util.Scanner;

public class Tarea10 {
    public static int[] contadorNotas = new int[11];
    public static void leerNotas() {
        Scanner teclado = new Scanner(System.in);
        int nota;
        System.out.println("Introduce notas entre 0 y 10 (una negativa para terminar): ");
        nota = teclado.nextInt();
        while (nota >= 0) {
            if (nota <= 10) {
                contadorNotas[nota]++;
            } else {
                System.out.print("Nota fuera de rango (0-10). Inténtalo de nuevo.");
            }
            System.out.println("Escribe una nota: ");
            nota = teclado.nextInt();
        }
    }
    public static void mostrarResultados() {
        for (int i = 0; i < contadorNotas.length; i++) {
            System.out.println("Nota " + i + ": " + contadorNotas[i] + " veces");
        }
    }
    public static void main(String[] args) {
        leerNotas();
        mostrarResultados();
    }
}
