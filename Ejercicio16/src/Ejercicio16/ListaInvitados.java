package Ejercicio16;

import java.util.*;

public class ListaInvitados {
    private static final int AFORO = 10;
    private static final int[] MESAS = {2, 4, 4};
    private ArrayList<Invitado> lista;

    public ListaInvitados() {
        lista = new ArrayList<Invitado>();
        lista.add(new Invitado("11111111A","Lamont","29/02/2004"));
        lista.add(new Alergico("22222222B","Augusto","09/09/2009","marisco"));
        lista.add(new Invitado("33333333C","Xian","16/12/1990"));
        lista.add(new Alergico("44444444D","Onganba","31/10/2007","flores"));
    }

    public boolean repetido(String dni){
        for(Invitado i : lista)
            if(i.getDni().equals(dni))return true;
        return false;
    }

    public Invitado getDatos() {
        Scanner teclado = new Scanner(System.in);
        String dni,nombre,fechaNacimiento,alergia;
        System.out.print("Introduce el dni: ");
        dni = teclado.nextLine();
        System.out.print("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce la fecha nacimiento: ");
        fechaNacimiento = teclado.nextLine();
        System.out.println("¿Tiene alergias? (S/N)");
        if (teclado.nextLine().equalsIgnoreCase("S")) {
            System.out.println("Nombre la alergia");
            alergia = teclado.nextLine();
            return new Alergico(dni, nombre, fechaNacimiento, alergia);
        }else{
            return new Invitado(dni, nombre, fechaNacimiento);
        }
    }
    public void nuevoInvitado(){
        if (lista.size()<AFORO){
            Invitado nuevoInvitado = getDatos();
            if(!repetido(nuevoInvitado.getDni())) lista.add(nuevoInvitado);
            else System.out.println("El invitado ya está en la lista");
        }else{
            System.out.println("El aforo está completo");
        }
    }

    public void odenAlfabetico() {
        Collections.sort(lista);
        for (Invitado invitado : lista)
            System.out.println(invitado.getNombre());
    }
    public void eliminarMenores18() {
        int cont = 0;
        Iterator<Invitado> it = lista.iterator();
        while(it.hasNext()){
            if(it.next().getEdad()<18){
                it.remove();
            }
        }
        System.out.println("invitados eliminados: " + cont);
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
                String[] datos = ((Alergico) invitado).getAlergeno().split(",");
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
}
