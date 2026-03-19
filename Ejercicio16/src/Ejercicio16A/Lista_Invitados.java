package Ejercicio16A;

import java.time.LocalDate;
import java.util.*;

public class Lista_Invitados {

    private ArrayList<Invitados> invitados;
    private final int AFORO;

    public Lista_Invitados(int aforo) {
        //cuando creamos el evento lista_invitados automaticamente se limita el aforo
        this.AFORO = aforo;
        invitados = new ArrayList<>();
    }

    // Añadir invitado
    public void addInvitado(Invitados i) {
        if (invitados.size() >= AFORO) {
            System.out.println("No se puede añadir: aforo completo");
            return;
        }else
        invitados.add(i);
        System.out.println("Invitado añadido");
    }

    // Listado por nombre
    public void listadoPorNombre() {
//nombre_lista - ordenar - quiero que compares algo. usando atributos - que ordenas -el atributo a tener en cuenta para ordenar
//comparator -> quiero que ordenes || comparating -> quiero que lo hagas teniendo en cuenta un dato
        invitados.sort(Comparator.comparing(Invitados::getNombre));
        for (Invitados i : invitados) {
            System.out.println(i);
        }
    }

    // Eliminar menores de 18 años
    public void eliminarMenores() {
        //elimina a cada uno de los invitados menores de 18

//nombre de la lista - eliminar si se cumple una condicion - la i representa a cada elemento de la lista, hace que mire todos los
// i (invitados) de la lista - -> se llama lambda y es para que con cada elemento haga lo que indica (objeto -> condicion)
        invitados.removeIf(i -> i.getEdad() < 18);
        System.out.println("Menores eliminados");

        /*  Otras formas serian:
                //Iterator es un objeto que recorre elemento por elemento cada elemento de la lista indicada <invitado>
                // it es el nombre del objeto Iterator
                Iterator<Invitado> it = invitados.iterator();

                    //mientras que en la lista haya un siguiente elemento
                    while(it.hasNext()) {

                        //guarda en i el elemento actual y despues el iterator se mueve a la siguiente posicion
                        Invitado i = it.next();

                        if(i.getEdad() < 18) {
                        // elimina el elemento guardado en i
                            it.remove();
                        }

                    }

        *****************

                for(int i = 0; i < invitados.size(); i++){

                    if(invitados.get(i).getEdad() < 18){
                        invitados.remove(i);
                        i--;
                    }

                }
        */
    }

    // Número de personas alérgicas
    public int contarAlergicos() {
        int cont = 0;
        for (Invitados i : invitados) {
            if (i instanceof Alergenos) cont++;
        }
        return cont;
    }

    // Listado de alérgenos con número de personas
    public void listarAlergenos() {
        HashMap<String, Integer> mapa /*nombre de la variable*/ = new HashMap<>();

        for (Invitados i : invitados) { //recorre toda la lista de invitados
            if (i instanceof Alergenos) { // pregunta si i (el invitado que toque) es alergico
                Alergenos a = (Alergenos) i; // sin esto java piensa que no quiero trabajar con alergicos,
                                            // es como cambiar un double a un int

                // pide todas las alergias y coge las palabras separadas por comas
                String[] alergiasArray = a.getAlergias().split(",");

                for (String al : alergiasArray) {// recorre el Array con las alergias
                    al = al.trim();// quita los espacios incecesarios

                    //map.getOrDefault(al,0) -> esto busca si existe la alergia(al) y devuelve el numero de veces que se repite
                    //se suma el 1 porque teniamos 0 personas con esa alergia y hemos encontrado 1
                    //map.put -> esto guarda el valor en el hashmap
                    mapa.put(al, mapa.getOrDefault(al, 0) + 1);
                }
            }
        }
        //recorre todas las claves del mapa, en este caso son las Strings porque era [String,Integer]
        for (String al : mapa.keySet()) {
            //imprime la alergia(al) y el numero de personas que la tienen
            System.out.println(al + ": " + mapa.get(al) + " persona(s)");
        }
    }

    // Reparto de invitados en mesas por orden de edad (mayor a menor)
    public void repartirMesas(int[] MESAS) {
//en la lista invitados vamos a ordenar (.sort) (que criterio vamos a seguir)
//(a,b) -> con esto java va comparando de 2 en 2 los invitados, el invitado 1(a) con el 2(b), despues el 2 pasa a ser el a
// siguiendo el criterio de 2 en 2 (a,b) vamos a ordenar segun los datos -> (datos) que son las edades
// b.getEdad() - a.getEdad() ordena de mayor a menor y al reves es a - b porque el .sort da positivos, 0 y negativos en
// funcion de cual sea mas grande
        invitados.sort((a, b) -> b.getEdad() - a.getEdad());

        //variable para saber a que invitado estamos sentando
        int indiceInvitado = 0;

        for (int m = 0; m < MESAS.length; m++) { //recorre el array mesas

            //indica la capacidad de cada mesa segun se van recorriendo
            int capacidad = MESAS[m];

            //indica en numero de la mesa en la que estamos
            System.out.print("Mesa " + (m + 1) + ": ");

// c indica las personas que hay dentro de cada mesa, por eso tiene que ser menor que la capacidad de cada una
// la segunda parte (indiceInvitado < invitados.size()) controla que todavia haya personas por sentar en la
// mesa, si no hay personas que sentar porque se acaban los invitados se detiene el bucle
            for (int c = 0; c < capacidad && indiceInvitado < invitados.size(); c++) {

                //Esto obtiene el invitado sentado en cada posicion con su nombre
                //Haciendo un sout del nombre del invitado nº(indiceInvitado)
                //recorre esto por cada persona de la mesa
                System.out.print(invitados.get(indiceInvitado).getNombre() + " ");
                indiceInvitado++;
            }
            System.out.println();
        }
    }
}

/*
* public void repartirMesas(int[] MESAS) {

    int indice = 0;

    for(int i = 0; i < MESAS.length; i++) {

        System.out.println("Mesa " + (i+1));

        for(int j = 0; j < MESAS[i]; j++) {

            if(indice < invitados.size()) {
                System.out.println(invitados.get(indice).getNombre());
                indice++;
            }

        }

        System.out.println();

    }

}*/