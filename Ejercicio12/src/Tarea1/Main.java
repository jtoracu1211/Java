package Tarea1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        String cod;
        boolean ok=true;
        do{
            System.out.println("1-Entrada ordenador al taller  ");
            System.out.println("2-Presupuestar  ");
            System.out.println("3-Aceptación presupuesto  ");
            System.out.println("4-Reparación  ");
            System.out.println("5-Recogida ordenador  ");
            System.out.println("6-Listar  ");
            System.out.println("0-Finalizar");
            opcion=teclado.nextInt();
            ok=true;
            switch (opcion){
                case 1: Taller.entradaTaller();break;
                case 2:
                    System.out.print("Codigo reparación: ");
                    cod=teclado.next();
                    ok=Taller.introPresupuesto(cod);
                    if(!ok) System.out.println("No existe ese código de reparación");
                    break;
                case 3:
                    System.out.print("Codigo reparación: ");
                    cod=teclado.next();
                    ok=Taller.aceptPresupuesto(cod);
                    if(!ok) System.out.println("No existe ese código de reparación o ya presupuestado");
                    break;
                case 4:
                    System.out.print("Codigo reparación: ");
                    cod=teclado.next();
                    ok=Taller.reparacion(cod);
                    if(!ok) System.out.println("No existe ese código de reparación o no aceptado presupuesto");
                    break;
                case  5:
                    System.out.print("Codigo reparación: ");
                    cod=teclado.next();
                    ok=Taller.entregaOrdenador(cod);
                    if(!ok) System.out.println("No existe ese código de reparación o no reparado aún");
                    break;
                case 6:
                    Taller.listar();
                    break;
            }
        }while (opcion!=0);
    }
}

