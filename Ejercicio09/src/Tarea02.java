import java.util.Scanner;

public class Tarea02 {

    public static int Entrada() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos años has estado trabajando");
        return teclado.nextInt();
    }

    public static int Calculos(int anyostrabajados) {
        return anyostrabajados / 3;
    }

    public static void Imprimir(int trienio2) {
        System.out.println("Has trabajado " + trienio2 + " trienios");
    }

    public static void main(String[] args) {
        int anyos = Entrada();
        int trienio = Calculos(anyos);
        Imprimir(trienio);
    }
}