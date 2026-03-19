package Ejercicio16R;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ListaInvitados listaInvitados = new ListaInvitados();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1- Añadir invitado");
            System.out.println("2- Lista ordenada invitados");
            System.out.println("3- Eliminar menores");
            System.out.println("4- Cantidad de alérgicos");
            System.out.println("5- Listado productos alérgicos ");
            System.out.println("6- Reparto en mesas ");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    listaInvitados.nuevoInvitado();
                    break;
                case 2:
                    listaInvitados.listado();
                    break;
                case 3:
                    listaInvitados.eliminarMenores18();
                    break;
                case 4:
                    System.out.println("Nº de alérgicos " + listaInvitados.contarAlergicos());
                    break;
                case 5:
                    listaInvitados.listarAlergias();
                    break;
                case 6:
                    listaInvitados.repartoMesas();
                    break;
            }
        } while (opcion != 0);
        teclado.close();
    }
}
