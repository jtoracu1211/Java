import java.util.Scanner;

public class Tarea10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre;
        System.out.println("Introduzca su nombre");
        nombre = teclado.nextLine();

        int horas;
        System.out.println("Introduzca número de horas trabajadas: ");
        horas = teclado.nextInt();

        double coste;
        System.out.println("Introduzca el salario por hora: ");
        coste = teclado.nextDouble();

        double salario_bruto;
        if (horas <= 35){
            salario_bruto = coste * horas;
        }else{
            salario_bruto = (35 * coste) + (((horas - 35) * coste) * 1.25);
        }

        double impuestos;
        if (salario_bruto <= 50){
            impuestos = 0;
        }else if (salario_bruto <= 90){
            impuestos = (salario_bruto - 50) * 0.25;
        }else{
            impuestos = 10 + ((salario_bruto - 90) * 0.45);
        }

        double salario_neto = salario_bruto - impuestos;

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + salario_bruto + "€");
        System.out.println("Tasas: " + impuestos + "€");
        System.out.println("Salario neto: " + salario_neto + "€");
        teclado.close();
    }
}
