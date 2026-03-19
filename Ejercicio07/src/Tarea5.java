import java.util.Scanner;

public class Tarea5 {
    public static String[] encuestadores = new String[5];
    public static int[] dia1 = new int[encuestadores.length], dia2 = new int[encuestadores.length], dia3 = new int[encuestadores.length], sumaDias = new int[encuestadores.length];
    public static Boolean[] encuestasDiarias = new Boolean[encuestadores.length];
    public static Scanner teclado = new Scanner(System.in);
    public static void introducir_encuestadores(){
        for (int i = 0; i < encuestadores.length; i++) {
            System.out.print("Escriba el nombre del encuestador " + (i + 1) + ": ");
            encuestadores[i] = teclado.nextLine();
        }
    }
    public static void encuestas_dias(){
        for (int i = 0; i < encuestadores.length; i++) {
            dia1[i] = (int) (Math.random() * 501);
        }
        for (int i = 0; i < encuestadores.length; i++) {
            dia2[i] = (int) (Math.random() * 501);
        }
        for (int i = 0; i < encuestadores.length; i++) {
            dia3[i] = (int) (Math.random() * 501);
        }
        for (int i = 0; i < encuestadores.length; i++) {
            sumaDias[i] = dia1[i] + dia2[i] + dia3[i];
        }
    }
    public static void minimo_diario(){
        for (int i = 0; i < encuestadores.length; i++) {
            if (dia1[i] >= 100 && dia2[i] >= 100 && dia3[i] >= 100) {
                encuestasDiarias[i] = true;
            }else{
                encuestasDiarias[i] = false;
            }
        }
    }
    public static void maximo_encuestador(){
        for (int k = 0; k < encuestadores.length - 1; k++) {
            for (int f = 0; f < encuestadores.length - 1 - k; f++) {
                if (sumaDias[f] > sumaDias[f + 1]) {
                    int aux1;
                    aux1 = sumaDias[f];
                    sumaDias[f] = sumaDias[f + 1];
                    sumaDias[f + 1] = aux1;
                    int aux2;
                    aux2 = dia1[f];
                    dia1[f] = dia1[f + 1];
                    dia1[f + 1] = aux2;
                    int aux3;
                    aux3 = dia2[f];
                    dia2[f] = dia2[f + 1];
                    dia2[f + 1] = aux3;
                    int aux4;
                    aux4 = dia3[f];
                    dia3[f] = dia3[f + 1];
                    dia3[f + 1] = aux4;
                    String aux5;
                    aux5 = encuestadores[f];
                    encuestadores[f] = encuestadores[f + 1];
                    encuestadores[f + 1] = aux5;
                    Boolean aux6;
                    aux6 = encuestasDiarias[f];
                    encuestasDiarias[f] = encuestasDiarias[f + 1];
                    encuestasDiarias[f + 1] = aux6;
                }
            }
        }
    }
    public static void dinero_ganado(){
        for (int i = 0; i < encuestadores.length; i++) {
            System.out.println(encuestadores[i] + ": " + sumaDias[i] + " encuestas realizadas.");
            if (i == encuestadores.length - 1) {
                System.out.println("También gana 200 € ya que es el encuestador que más encuestas realizó.");
                sumaDias[i] = sumaDias[i] + 200;
            }
            if (encuestasDiarias[i] == true){
                System.out.println("También gana 100 € ya que realizó más de 100 encuestas diarias.");
                sumaDias[i] = sumaDias[i] + 100;
            }
            System.out.println("En total gana: " +  sumaDias[i] + " €");
        }
    }
    public static void main(String[] args) {
        introducir_encuestadores();
        encuestas_dias();
        minimo_diario();
        maximo_encuestador();
        dinero_ganado();
    }
}
