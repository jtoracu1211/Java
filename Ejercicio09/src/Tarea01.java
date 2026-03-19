import java.util.Scanner;

public class Tarea01 {
    private static int numero;

    public static void inicializar(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
    }

    public static void imprimir(int n){
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        inicializar();
        imprimir(numero);
    }
}
