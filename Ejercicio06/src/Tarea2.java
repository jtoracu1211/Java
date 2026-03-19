import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] examenes = new int[30];
        for (int i = 0; i < examenes.length; i++) {
            examenes [i] = (int) (Math.random()*11);
        }
        System.out.print("Introduce una nota: ");
        int nota = -1;
        while (nota < 0 || nota > 10) {
            if (!teclado.hasNextInt()) {
                System.out.print("Error, introduce un número entero: ");
                teclado.nextLine();
            } else {
                nota = teclado.nextInt();
                teclado.nextLine();
                if (nota < 0 || nota > 10) {
                    System.out.print("Error, escribe un número mayor que 1: ");
                }
            }
        }
        int contador = 0;
        for (int i = 0; i < examenes.length; i++) {
            if (examenes[i] == nota) {
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("No hay ningún examen con esta nota");
        }else {
            System.out.println("Cantidad de exámenes con esa nota: " + contador);
        }
    }
}
