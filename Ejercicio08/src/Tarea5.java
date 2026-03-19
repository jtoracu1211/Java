import java.util.Scanner;

public class Tarea5 {
    public static Scanner teclado = new Scanner(System.in);
    public static String[] paises = new String[4];
    public static double[][] temperaturas = new double[4][12];
    public static double[] mediasTrimestrales = new double[4];
    public static void introducir_nombres() {
        for (int i = 0; i < paises.length; i++) {
            System.out.print("Introduce el nombre del país " + (i + 1) + ": ");
            paises[i] = teclado.nextLine();
        }
    }
    public static void introducir_temperaturas() {
        for (int i = 0; i < paises.length; i++) {
            System.out.println("\nIntroduce las 12 temperaturas mensuales de " + paises[i] + ":");
            for (int mes = 0; mes < 12; mes++) {
                System.out.print("Mes " + (mes + 1) + ": ");
                while (!teclado.hasNextDouble()) {
                    System.out.print("Error, introduce un número: ");
                    teclado.nextLine();
                }
                temperaturas[i][mes] = teclado.nextDouble();
                teclado.nextLine();
            }
        }
    }
    public static void imprimir_paisesTemperaturas() {
        for (int i = 0; i < paises.length; i++) {
            System.out.print("\nTemperatura mensual de " + paises[i] + ": ");
            for (int mes = 0; mes < 12; mes++) {
                System.out.print(temperaturas[i][mes] + "ºC");
            }
        }
    }
    public static void calcular_mediasTrimestrales() {
        for (int i = 0; i < paises.length; i++) {
            double suma = 0;
            for (int mes = 0; mes < 12; mes++) {
                suma = suma + temperaturas[i][mes];
            }
            mediasTrimestrales[i] = suma / 4.0;
        }
    }
    public static void imprimir_mediasTrimestrales() {
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Temperatura media trimestral de " + paises[i] + ": " + mediasTrimestrales[i] + "ºC");
        }
    }
    public static void calcular_mayor() {
        double mayor = mediasTrimestrales[0];
        int indiceMayor = 0;
        for (int i = 1; i < mediasTrimestrales.length; i++) {
            if (mediasTrimestrales[i] > mayor) {
                mayor = mediasTrimestrales[i];
                indiceMayor = i;
            }
        }
        System.out.println("\nEl país con la temperatura media trimestral mayor es: " + paises[indiceMayor] + " (" + mayor + "ºC)");
    }
    public static void main(String[] args) {
       introducir_nombres();
       introducir_temperaturas();
       imprimir_paisesTemperaturas();
       calcular_mediasTrimestrales();
       imprimir_mediasTrimestrales();
       calcular_mayor();
    }
}
