import java.util.Scanner;

public class Tarea3 {
    public static String[] paises = new String[5];
    public static double[] poblacion = new double[5];
    public static void introducir_datos(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < paises.length ; i++){
            System.out.print("Introduce un país: ");
            paises[i] = teclado.nextLine();
            System.out.print("Introduce la población: ");
            while (!teclado.hasNextDouble()) {
                System.out.println("Error, introduce un número");
                teclado.nextLine();
            }
            poblacion[i] = teclado.nextDouble();
            teclado.nextLine();
        }
    }
    public static void orden_alfabetico(){
        for (int k = 0; k < paises.length - 1; k++) {
            for (int f = 0; f < 4 - k; f++) {
                if (paises[f].compareTo(paises[f + 1]) > 0) {
                    String aux;
                    aux = paises[f];
                    paises[f] = paises[f + 1];
                    paises[f + 1] = aux;
                }
            }
        }
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }
    public static void orden_poblacion(){
        for (int k = 0; k < poblacion.length - 1; k++) {
            for (int f = 0; f < poblacion.length - 1 - k; f++) {
                if (poblacion[f] > poblacion[f + 1]) {
                    double aux;
                    aux = poblacion[f];
                    poblacion[f] = poblacion[f + 1];
                    poblacion[f + 1] = aux;
                }
            }
        }
        for (int i = 0; i < poblacion.length; i++) {
            System.out.printf("%11.0f", poblacion[i]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        introducir_datos();
        orden_alfabetico();
        orden_poblacion();
    }
}
