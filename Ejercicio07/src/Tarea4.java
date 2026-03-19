import java.util.Arrays;
import java.util.Scanner;

public class Tarea4 {
    public static int[] numeros = new int[20], menores = new int[5], mayores = new int[5];
    public static Scanner teclado = new Scanner(System.in);
    public static int opcion = 0;
    public static void generar_valores(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 301) + 500) ;
        }
    }
    public static void elegir_opcion(){
        System.out.println("1. Orden ascendente (de menor a mayor)");
        System.out.println("2. Orden descendente (de mayor a menor");
        System.out.print("Elige una opción: ");
        while (opcion < 1 || opcion > 2) {
            if (!teclado.hasNextInt()) {
                System.out.println("Error, introduce un número entero.");
                teclado.nextLine();
                System.out.print("Elija una opción: ");
            } else {
                opcion = teclado.nextInt();
                teclado.nextLine();
                if (opcion < 1 || opcion > 2) {
                    System.out.print("Error, elija 1 o 2: ");
                }
            }
        }
    }
    public static void opcion1(){
        for (int k = 0; k < numeros.length - 1; k++) {
            for (int f = 0; f < numeros.length - 1 - k; f++) {
                if (numeros[f] > numeros[f + 1]) {
                    int aux;
                    aux = numeros[f];
                    numeros[f] = numeros[f + 1];
                    numeros[f + 1] = aux;
                }
            }
        }
        for (int k = 0; k < 5; k++) {
            menores[k] = numeros[k];
        }
        for (int k = 0; k < numeros.length; k++) {
            if (numeros.length - k <= 5){
                mayores[k + 5 - numeros.length] = numeros[k];
            }
        }
    }
    public static void opcion2(){
        for (int k = 0; k < numeros.length - 1; k++) {
            for (int f = 0; f < numeros.length - 1 - k; f++) {
                if (numeros[f] < numeros[f + 1]) {
                    int aux;
                    aux = numeros[f];
                    numeros[f] = numeros[f + 1];
                    numeros[f + 1] = aux;
                }
            }
        }
        for (int k = 0; k < 5; k++) {
            mayores[k] = numeros[k];
        }
        for (int k = 0; k < numeros.length; k++) {
            if (numeros.length - k <= 5){
                menores[k + 5 - numeros.length] = numeros[k];
            }
        }
    }
    public static void mostrar_vectores(){
        System.out.println("Valores de todos los números:");
        for (int k = 0; k < numeros.length; k++) {
            System.out.println(numeros[k]);
        }
        System.out.println("Valores de los 5 números más pequeños:");
        for (int k = 0; k < menores.length; k++) {
            System.out.println(menores[k]);
        }
        System.out.println("Valores de los 5 números más grandes:");
        for (int k = 0; k < mayores.length; k++) {
            System.out.println(mayores[k]);
        }
    }
    public static void main(String[] args) {
        generar_valores();
        elegir_opcion();
        if (opcion == 1) {
            opcion1();
        }else if (opcion == 2) {
            opcion2();
        }
        mostrar_vectores();
    }
}
