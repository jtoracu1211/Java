package Tarea02;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ListaInvitados {
    private ArrayList<Invitado> lista = new ArrayList<Invitado>();
    public ListaInvitados() {
        lista.add(new Invitado("Ana", LocalDate.parse("03/11/1976", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        lista.add(new Invitado("Pedro", LocalDate.parse("15/06/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        lista.add(new Invitado("José", LocalDate.parse("12/07/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        lista.add(new Invitado("Alicia", LocalDate.parse("26/05/1977", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
    public void nuevoInvitado() {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String fecha;
        LocalDate fecha_nacimiento;
        System.out.println("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Introduce fecha de nacimiento: ");
        fecha = teclado.nextLine();
        fecha_nacimiento = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Invitado persona = new Invitado(nombre, fecha_nacimiento);
        lista.add(persona);
    }
    public int busqueda(String nombre) {
        for (Invitado i : lista)
            if (i.getNombre().equalsIgnoreCase(nombre)) return lista.indexOf(i);
        return 0;
    }
    public void eliminarInvitado() {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int pos;
        System.out.println("Introduce el nombre del invitado a eliminar: ");
        nombre = teclado.nextLine();
        pos = busqueda(nombre);
        if (pos != 0) {
            lista.remove(pos);
            System.out.println("Invitado eliminado.");
        } else System.out.println("Invitado no existe.");
    }
    public void listado() {
        for (Invitado invitado : lista)
            System.out.println(invitado.toString());
    }
    public void eliminarMenores18() {
        int contador = 0;
        Iterator<Invitado> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getEdad() < 18) {
                it.remove();
                contador++;
            }
        }
        System.out.println("Se han eliminado :" + contador);
    }
    public void ordenpornombre() {
        Collections.sort(lista);
        for (Invitado invitado : lista)
            System.out.println(invitado.toString());
    }
 
public void ordenporedad() {
        Collections.sort(lista, Invitado.ORDEN_EDAD);
        for (Invitado invitado : lista)
            System.out.println(invitado.toString());
    }
}
