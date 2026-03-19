import java.util.Scanner;

public class Tarea21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor de x: ");
        double x = teclado.nextDouble();

        System.out.println("Introduzca el valor de y: ");
        double y = teclado.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Las coordenadas están en el primer cuadrante");
        }else if(x < 0 && y > 0){
            System.out.println("Las coordenadas están en el segundo cuadrante");
        }else if(x <0 && y < 0){
            System.out.println("Las coordenadas están en el tercer cuadrante");
        }else{
            System.out.println("Las coordenadas están en el cuarto cuadrante");
        }
        teclado.close();
    }
}
