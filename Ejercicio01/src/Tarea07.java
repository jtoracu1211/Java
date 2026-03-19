import java.util.Scanner;

public class Tarea07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de horas trabajadas: ");
        int horas = teclado.nextInt();
        System.out.println("Introduzca el coste horario: ");
        double coste = teclado.nextDouble();
        System.out.println("El informático debe cobrar: " + horas * coste);
        teclado.close();
    }
}
