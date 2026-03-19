import java.util.Arrays;

public class Tarea1 {
    public static void main(String[] args) {
        int[] valores = new int[8];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random()*100 + 1);;
        }
        System.out.println("Valores: " + Arrays.toString(valores));

        int suma1 = 0;
        for (int i = 0; i < valores.length; i++) {
            suma1 += valores[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + suma1);

        int suma2 = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 36) {
                suma2 += valores[i];
            }
        }
        System.out.println("La suma de los elementos mayores a 36 es: " + suma2);

        int contador = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 50) {
                contador++;
            }
        }
        System.out.println("La cantidad de elementos mayores a 50 es: " + contador);
    }
}
