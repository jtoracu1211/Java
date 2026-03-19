import java.util.Scanner;

public class Tarea17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el día: ");
        byte dia = teclado.nextByte();

        System.out.println("Introduzca el mes: ");
        byte mes = teclado.nextByte();

        System.out.println("Introduzca el año: ");
        teclado.nextShort();

        if (dia == 25 && mes == 12) {
            System.out.println("Esta fecha corresponde a Navidad");
        }else{
            System.out.println("Esta fecha no corresponde a Navidad");
        }
        teclado.close();
    }
}
