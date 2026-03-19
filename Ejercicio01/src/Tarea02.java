import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor de x: ");
        x = teclado.nextInt();
        System.out.println("Introduzca el valor de y: ");
        y = teclado.nextInt();
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("El valor de la suma es: " + (x + y));
        System.out.println("El valor de la resta es: " + (x - y));
        System.out.println("El valor de la división es: " + (x / y));
        System.out.println("El valor de la multiplicacion es: " + (x * y));
        teclado.close();
    }
}
