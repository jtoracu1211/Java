import java.util.Scanner;

public class Tarea09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, n_correctas;
        System.out.println("Introduzca el número de preguntas del examen");
        n = teclado.nextInt();
        System.out.println("Introduzca el nombre de preguntas correctas");
        n_correctas = teclado.nextInt();
        if ((n_correctas * 100 / n ) >= 90){
            System.out.println("Nivel avanzado");
        }else if (75 <= (n_correctas * 100 / n )){
            System.out.println("Nivel intermedio");
        }else if (50 <= (n_correctas * 100 / n )){
            System.out.println("Nivel básico");
        }else{
            System.out.println("Fuera de nivel");
        }
        teclado.close();
    }
}