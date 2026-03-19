import java.util.Scanner;

public class Tarea6 {
    public static Scanner teclado = new Scanner(System.in);
    public static String[] nombres = new String[10];
    public static int[] edades = new int[nombres.length];
    public static void introducir_nombres_edades(){
        for(int i = 0; i < nombres.length ; i++){
            System.out.print("Introduce un nombre: ");
            nombres[i] = teclado.nextLine();
            System.out.print("Introduce la edad: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Error, introduce un número entero");
                teclado.nextLine();
            }
            edades[i] = teclado.nextInt();
            teclado.nextLine();
        }
    }
    public static void cantidad_personas(){
        int cont = 0;
        for(int i = 0; i < nombres.length ; i++){
            if (nombres[i].matches("^[aAmM].*") && edades[i] >= 18){
                cont++;
            }
        }
        System.out.println("Número de personas cuyo nombre empieza por A o M y que además son mayores de edad: " + cont);
    }
    public static void orden_edades(){
        for (int k = 0; k < nombres.length - 1; k++) {
            for (int f = 0; f < nombres.length - 1 - k; f++) {
                if (edades[f] > edades[f + 1]) {
                    int aux1;
                    aux1 = edades[f];
                    edades[f] = edades[f + 1];
                    edades[f + 1] = aux1;
                    String aux2 = nombres[f];
                    nombres[f] = nombres[f + 1];
                    nombres[f + 1] = aux2;
                }
            }
        }
    }
    public static void listado_menores(){
        for (int k = 0; k < nombres.length - 1; k++) {
            if (edades[k] < 18){
                System.out.println(nombres[k] + ", edad: " + edades[k]);
            }
        }
    }
    public static void main(String[] args){
        introducir_nombres_edades();
        cantidad_personas();
        orden_edades();
        listado_menores();
        System.out.println("Persona de mayor edad: " + nombres[nombres.length - 1]);
    }
}
