package Ejercicio16A;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Introduce aforo del evento:");
        int aforo = sc.nextInt();
        sc.nextLine();

        Lista_Invitados evento = new Lista_Invitados(aforo);

        int opcion;

        do {
            System.out.println();
            System.out.println("\n--- MENU EVENTO ---");
            System.out.println("1. Añadir invitado");
            System.out.println("2. Listado por nombre");
            System.out.println("3. Eliminar menores de 18");
            System.out.println("4. Número de alérgicos");
            System.out.println("5. Listar alérgenos");
            System.out.println("6. Reparto mesas");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {

                case 1:
                    System.out.println("DNI:");
                    String dni = sc.nextLine();
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Fecha de nacimiento (dd/MM/yyyy):");
                    String fechaTexto = sc.nextLine();
                    LocalDate fecha = LocalDate.parse(fechaTexto, formato);

                    System.out.println("¿Tiene alergias? (s/n):");
                    String resp = sc.nextLine();

                    if (resp.equalsIgnoreCase("s")) {
                        System.out.println("Introduce alergias separadas por comas:");
                        String alergias = sc.nextLine();
                        evento.addInvitado(new Alergenos(dni, nombre, fecha, alergias));
                    } else {
                        evento.addInvitado(new Invitados(dni, nombre, fecha));
                    }

                    break;

                case 2:
                    evento.listadoPorNombre();
                    break;

                case 3:
                    evento.eliminarMenores();
                    break;

                case 4:
                    System.out.println("Número de alérgicos: " + evento.contarAlergicos());
                    break;

                case 5:
                    evento.listarAlergenos();
                    break;

                case 6:
                    System.out.println("Introduce número de mesas:");
                    int n = sc.nextInt();
                    int[] MESAS = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Capacidad mesa " + (i+1) + ":");
                        MESAS[i] = sc.nextInt();
                    }
                    sc.nextLine();
                    evento.repartirMesas(MESAS);
                    break;

                case 0:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }

        } while(opcion != 0);
        sc.close();
    }
}
