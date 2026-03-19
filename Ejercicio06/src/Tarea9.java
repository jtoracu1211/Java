import java.util.*;
public class Tarea9 {
    public static int dia, mes, anyo;
    public static int suma_dias = 0;
    public static int[] dias_mes = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static Scanner teclado = new Scanner(System.in);
    public static void escribe_fecha(){
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        anyo = teclado.nextInt();
    }
    public static void dias_anyo(){
        if (anyo%4==0 && anyo%100!=0){
            dias_mes[1] = 29;
        }
        for (int i = 0; i < dias_mes.length; i++) {
            suma_dias += dias_mes[i];
        }
    }
    public static void calcular_dias_restantes(){
        int dias_restantes = suma_dias;
        for (int i = 0; i < (mes - 1); i++) {
            dias_restantes -= dias_mes[i];
        }
        dias_restantes -= dia;
        System.out.println("Quedan: " + dias_restantes + " dias restantes");
    }
    public static void main(String[] args) {
        escribe_fecha();
        dias_anyo();
        calcular_dias_restantes();
    }
}
