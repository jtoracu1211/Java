import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cantidad;
        System.out.print("Introduzca la cantidad: ");
        cantidad = teclado.nextDouble();
        double centimos = cantidad * 100;

        int mon50 = (int) (centimos / 50);
        int mon20 = (int) ((centimos % 50) / 20);
        int mon10 = (int) (((centimos % 50) % 20) / 10);
        int mon5 = (int) ((((centimos % 50) % 20) % 10) / 5);
        int mon2 = (int) (((((centimos % 50) % 20) % 10) % 5) / 2);
        int mon1 = (int) (((((centimos % 50) % 20) % 10) % 5) % 2);

        System.out.println("La cantidad " + cantidad + " está formada por: ");
        System.out.println(mon50 + " monedas de 50 céntimos");
        System.out.println(mon20 + " monedas de 20 céntimos");
        System.out.println(mon10 + " monedas de 10 céntimos");
        System.out.println(mon5 + " monedas de 5 céntimos");
        System.out.println(mon2 + " monedas de 2 céntimos");
        System.out.println(mon1 + " monedas de 1 céntimo");
        teclado.close();
    }
}
