import java.util.Scanner;

public class Tarea06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        double base = teclado.nextDouble();
        System.out.println("Introduzca el porcentaje de descuento: ");
        double descuento = teclado.nextDouble();
        System.out.println("Introduzca el tipo de IVA: ");
        double IVA = teclado.nextDouble();
        System.out.println("La base imponible es: " + base);
        System.out.println("El porcentaje descuento es: " + descuento);
        System.out.println("El  tipo IVA es: " + IVA);
        System.out.println("El total de la factura es: " + ((base * ((100 - descuento) / 100)) + ((base * ((100 - descuento) / 100)) * (IVA / 100))));
        teclado.close();
    }
}
