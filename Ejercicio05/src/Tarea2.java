import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la fecha: ");
        String fecha =  teclado.nextLine();
        if (fecha.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(20\\d{2})")){
            System.out.println("El formato es correcto");
        }else{
            System.out.println("El formato es incorrecto");
        }
    }
}
