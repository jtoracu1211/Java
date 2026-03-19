import java.util.Scanner;

public class Tarea2 {
    public static int[] notasA = new int[5], notasB = new int[5];
    public static Scanner teclado = new Scanner(System.in);
    public static void introducir_notasA(){
        for (int i = 0; i < notasA.length; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            while (!teclado.hasNextInt()) {
                System.out.print("Error, introduce un número entero: ");
                teclado.nextLine();
            }
            notasA[i] = teclado.nextInt();
            teclado.nextLine();
        }
    }
    public static void introducir_notasB(){
        for (int i = 0; i < notasB.length; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            while (!teclado.hasNextInt()) {
                System.out.print("Error, introduce un número entero: ");
                teclado.nextLine();
            }
            notasB[i] = teclado.nextInt();
            teclado.nextLine();
        }
    }
    public static void calcular_promedio(){
        int sumaA = 0;
        for (int i = 0; i < notasA.length; i++) {
            sumaA += notasA[i];
        }
        sumaA = sumaA / notasA.length;
        int sumaB = 0;
        for (int i = 0; i < notasB.length; i++) {
            sumaB += notasB[i];
        }
        sumaB = sumaB / notasB.length;
        if (sumaA > sumaB) {
            System.out.println("El curso A tuvo mayor promedio que el curso B");
        }else if (sumaA < sumaB) {
            System.out.println("El curso B tuvo mayor promedio que el curso A");
        }else{
            System.out.println("Ambos cursos tienen el mismo promedio");
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce las notas del curso A:");
        introducir_notasA();
        System.out.println("Introduce las notas del curso B:");
        introducir_notasB();
        calcular_promedio();
    }
}
