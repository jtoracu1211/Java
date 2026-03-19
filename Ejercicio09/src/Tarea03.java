import java.util.Scanner;

public class Tarea03 {
    public static final double PI = 3.1416;
    private double radio;
    public double getArea() {
        return radio * radio * PI;
    }
    public double getPerimetro() {
        return 2 * PI * radio;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tarea03 circulo = new Tarea03();
        System.out.print("Introduce el valor del radio: ");
        circulo.radio = teclado.nextDouble();

        System.out.println("El valor del área es: " + circulo.getArea());
        System.out.println("El valor del perímetro es: " + circulo.getPerimetro());
    }
}
