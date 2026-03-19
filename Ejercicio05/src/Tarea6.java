import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una fecha (dd/mes/aa)(el mes debe estar escrito así: ene/feb/mar...): ");
        String fecha = teclado.nextLine().toLowerCase();
        String patron = "^(0[1-9]|[12][0-9]|3[01])/(ene|feb|mar|abr|may|jun|jul|ago|sep|oct|nov|dic)/[0-9]{2}$";
        if (fecha.matches(patron)) {
            System.out.println("Fecha válida");
        }else{
            System.out.println("Fecha inválida");
        }
    }
}
