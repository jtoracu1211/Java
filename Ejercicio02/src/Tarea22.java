import java.util.Scanner;

public class Tarea22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca sueldo: ");
        double sueldo = teclado.nextDouble();

        System.out.println("Introduzca años de antigüedad: ");
        int antiguedad = teclado.nextInt();

        if (sueldo < 300 && antiguedad >= 10){
            sueldo = sueldo * 1.2;
            System.out.println("Se le otrogará: " + sueldo);
        }else if (sueldo < 300 && antiguedad < 10){
            sueldo = sueldo * 1.05;
            System.out.println("Se le otrogará: " + sueldo);
        }else{
            System.out.println("Se le otrogará: " + sueldo);
        }
        teclado.close();
    }
}
