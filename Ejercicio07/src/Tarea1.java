import java.util.Scanner;

public class Tarea1 {
    public static Scanner teclado = new Scanner(System.in);
    public static String[] nombres = new String[10];
    public static int[] edades = new int[10];
    public static int opcion = 0;
    public static void intrdoucir_datos(){
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
    public static void cargar_menu(){
        System.out.println("1. Listado personas de edad dada");
        System.out.println("2. Comprobación edad de persona dada");
        System.out.print("Elija una opción: ");
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
        int edad;
        System.out.print("Escriba una edad: ");
        while (!teclado.hasNextInt()) {
            System.out.print("Error, introduce un número entero: ");
            teclado.nextLine();
        }
        edad = teclado.nextInt();
        teclado.nextLine();
        Boolean edadIgual = false;
        for(int i = 0; i < edades.length ; i++){
            if(edades[i]==edad){
                System.out.println(nombres[i]);
                edadIgual = true;
            }
        }
        if(!edadIgual){
            System.out.println("No hay nadie con esa edad");
        }
    }
    public static void opcion2(){
        String nombre;
        System.out.print("Escriba un nombre: ");
        nombre = teclado.nextLine();
        Boolean nombreIgual = false;
        for(int i = 0; i < nombres.length ; i++){
            if(nombre.equals(nombres[i])){
                System.out.println(edades[i]);
                nombreIgual = true;
            }
        }
        if(!nombreIgual){
            System.out.println("No hay nombre con ese nombre");
        }
    }
    public static void main(String[] args) {
        intrdoucir_datos();
        cargar_menu();
        if (opcion==1){
            opcion1();
        }else if(opcion==2){
            opcion2();
        }
    }
}
