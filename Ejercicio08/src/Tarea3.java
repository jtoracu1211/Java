import java.util.Arrays;

public class Tarea3 {
    public static int [][] matriz = new int [5][3];
    public static void asignar_valores() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i][j] = (int) ((Math.random()*31)+20);
            }
        }
    }
    public static void menor_fila() {
        for (int i = 0; i < matriz.length; i++) {
            int aux = matriz[i][0];
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j] < aux){
                    aux = matriz[i][j];
                }
            }
            System.out.println("El elemento menor de la fila " + (i+1) + " es: " + aux);
        }
    }
    public static void mayor_columna() {
        for (int i = 0; i < matriz[0].length; i++) {
            int aux = matriz[0][i];
            for (int j = 0; j < matriz.length; j++) {
                if(matriz[j][i] > aux){
                    aux = matriz[j][i];
                }
            }
            System.out.println("El elemento mayor de la columna " + (i+1) + " es: " + aux);
        }
    }
    public static void main(String[] args) {
        asignar_valores();
        // Para comprobar los valores de la matriz, escribir "System.out.println(Arrays.deepToString(matriz));" aquí
        menor_fila();
        mayor_columna();
    }
}
