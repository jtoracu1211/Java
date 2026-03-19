import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double actual, anterior, diferencia;
        System.out.println("Introduzca la lectura actual: ");
        actual = teclado.nextDouble();
        System.out.println("Introduzca la lectura anterior: ");
        anterior = teclado.nextDouble();
        diferencia = actual-anterior;

        if (diferencia >= 0 && diferencia <=100){
            System.out.println("La factura cuesta: " + ((diferencia * 0.3) + 0.6) + "€");
        }else if (diferencia > 100 && diferencia <= 250){
            System.out.println("La factura cuesta: " + ((30 + ((diferencia - 100) * 0.2)) + 0.6) + "€");
        }else if (diferencia > 250){
            System.out.println("La factura cuesta: " + ((60 + ((diferencia - 250) * 0.15)) + 0.6) + "€");
        }else{
            System.out.println("Eror, datos incorrentos");
        }
        teclado.close();
    }
}
