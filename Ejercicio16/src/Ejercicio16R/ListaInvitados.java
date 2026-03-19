package Ejercicio16R;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListaInvitados {
    static final int AFORO = 10;
    static final int[] MESAS = {2, 4, 4};
    protected ArrayList<Invitado> lista;

    public ListaInvitados() {
        lista = new ArrayList<Invitado>();
        lista.add(new Invitado("23456789A", "Ana", "03/11/1976"));
        lista.add(new Alergico("34567891B", "Pedro", "15/06/2004", "huevo, fresa"));
        lista.add(new Invitado("45678912C", "José", "12/07/2001"));
        lista.add(new Alergico("34256177G", "Alicia", "26/05/1997", "fresa, marisco, gluten"));
    }

    public void nuevoInvitado() {
        if (lista.size() < AFORO) {
            Invitado invitado = getDatos();
            if (invitado != null) lista.add(invitado);
            else System.out.println("Ya está en la lista");
        } else System.out.println("No hay aforo suficiente");
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

    public Invitado getDatos() {
        Pattern pat = Pattern.compile("\\d{8}(?i)[A-HJ-NP-TV-Z]");
        Matcher mat;
        boolean ok;
        String dni, nombre, fecha, alergias;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("DNI :");
            dni = teclado.next();
            mat = pat.matcher(dni);
        } while (dni.isEmpty() || !mat.find());
        teclado.nextLine();
        if (busqueda(dni)) return null;
        do {
            System.out.print("Nombre :");
            nombre = teclado.nextLine();

        } while (nombre.isEmpty());
        do {
            ok = true;
            System.out.print("Fecha nacimiento :");
            fecha = teclado.nextLine();
            try {
                LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException date) {
                ok = false;
            }

        } while (!ok);
        System.out.print("Es alérgico S/N:");
        String opcion = teclado.nextLine();
        if (opcion.charAt(0) == 'S' || opcion.charAt(0) == 's') {
            System.out.print("Alergias separadas por comas y en singular");
            alergias = teclado.nextLine();
            return new Alergico(dni, nombre, fecha, alergias);

        }
        return new Invitado(dni, nombre, fecha);
    }

    public boolean busqueda(String DNI) {
        for (Invitado i : lista)
            if (i.getDNI().equalsIgnoreCase(DNI)) return true;
        return false;
    }

    public int contarAlergicos() {
        int contador = 0;
        for (Invitado i : lista)
            if (i instanceof Alergico) contador++;
        return contador;
    }

    public void listarAlergias() {
        Map<String, Integer> alergias = new HashMap<String, Integer>();
        for (Invitado invitado : lista) {
            if (invitado instanceof Alergico) {
                String[] datos = ((Alergico) invitado).getAlergias().split(",");
                for (int i = 0; i < datos.length; i++) {
                    String aler = datos[i].trim().toUpperCase();
                    if (alergias.containsKey(aler))
                        alergias.put(aler, alergias.get(aler) + 1);
                    else alergias.put(aler, 1);
                }
            }
        }
        System.out.println("Productos   Nº alérgicos");
        for (String clave : alergias.keySet())
            System.out.println(clave + "  " + alergias.get(clave));
    }

    public void listado() {
        Collections.sort(lista);
        for (Invitado invitado : lista)
            System.out.println(invitado.getNombre());
    }

    public void repartoMesas() {
        Collections.sort(lista, Invitado.ORDEN_EDAD);
        int mesa = 0, ocupantes = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (ocupantes == 0) System.out.println("Mesa nº " + (mesa + 1) + ":");
            System.out.println(lista.get(i).getNombre());
            ocupantes++;
            if (ocupantes == MESAS[mesa]) {
                mesa++;
                ocupantes = 0;
            }
        }
    }
}
