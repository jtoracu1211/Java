package Tarea2;

import java.util.Scanner;

public class Principal {
    private static Scanner teclado = new Scanner(System.in);
    private static String opcion="";
    public static void main(String[] args) {
        Persona persona = new Persona("Pepe", "Perez", "12345678P", "Soltero");
        System.out.println(persona);
        System.out.println();

        Estudiante estudiante = new Estudiante("Juan", "García", "21349587G", "Soltero", "1º Bachillerato");
        System.out.println(estudiante);
        System.out.println();

        Empleado empleado = new Empleado("María", "Robles", "88359678R", "Casada", "2020", "123456");
        System.out.println(empleado);
        System.out.println();

        Profesor profesor = new Profesor("Patricia", "Del Río", "77622134H", "Divorciada", "2019", "453762", "Departamento de Informatica");
        System.out.println(profesor);
        System.out.println();

        Personal personal = new Personal("Augusto", "Martínez", "00912547M", "Viudo", "2024", "223165", "Zona 2");
        System.out.println(personal);
        System.out.println();

        while (!opcion.equals("0")){
            System.out.println("1. Cambiar estado civil de una persona.");
            System.out.println("2. Reasignación de número de trabajador a un empleado.");
            System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("4. Cambio de departamento de un profesor. ");
            System.out.println("5. Traslado de zona de un empleado del personal de servicio.");
            System.out.println("6. Imprimir toda la información de cada tipo de individuo.");
            System.out.println("0. Salir.");
            System.out.print("\nElige una opción: ");
            opcion = teclado.nextLine();
            System.out.println();
            switch (opcion){
                case "1":
                    System.out.print("Escribe el nuevo estado civil: ");
                    persona.setEstadoCivil(teclado.nextLine());
                    break;
                case "2":
                    System.out.print("Escribe el nuevo número de trabajador: ");
                    empleado.setNumeroTrabajador(teclado.nextLine());
                    break;
                case "3":
                    System.out.print("Escribe la nueva matricula: ");
                    estudiante.setCurso(teclado.nextLine());
                    break;
                case "4":
                    System.out.print("Escribe el nuevo departamento: ");
                    profesor.setDepartamento(teclado.nextLine());
                    break;
                case "5":
                    System.out.print("Escribe la nueva zona: ");
                    personal.setZona(teclado.nextLine());
                    break;
                case "6":
                    System.out.println(persona);
                    System.out.println();
                    System.out.println(estudiante);
                    System.out.println();
                    System.out.println(empleado);
                    System.out.println();
                    System.out.println(profesor);
                    System.out.println();
                    System.out.println(personal);
                    break;
                case "0":
                    break;
            }
        }
    }
}
