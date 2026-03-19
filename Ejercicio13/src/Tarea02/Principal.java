package Tarea02;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        ListaInvitados listaInvitados = new ListaInvitados();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1- Añadir invitado");
            System.out.println("2- Eliminar invitado");
            System.out.println("3- Mostrar lista");
            System.out.println("4- Eliminar menores");
            System.out.println("5- Lista ordenada por nombre");
            System.out.println("6- Lista ordenada por edad");
            System.out.println("0- Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    listaInvitados.nuevoInvitado();
                    break;
                case 2:
                    listaInvitados.eliminarInvitado();
                    break;
                case 3:
                    listaInvitados.listado();
                    break;
                case 4:
                    listaInvitados.eliminarMenores18();
                    break;
                case 5:
                    listaInvitados.ordenpornombre();
                    break;
                case 6:
                    listaInvitados.ordenporedad();
                    break;
            }
        } while (opcion != 0);
    }
}
