package Tarea3;

public class Principal {

    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        j1.lanzarDados();
        j2.lanzarDados();

        System.out.println("Jugador 1: " + j1.getDado1() + ", " + j1.getDado2());
        System.out.println("Jugador 2: " + j2.getDado1() + ", " + j2.getDado2());

        int seisesJ1 = j1.contarSeises();
        int seisesJ2 = j2.contarSeises();

        if (seisesJ1 == 2 && seisesJ2 == 2) {
            System.out.println("Empate, ambos tienen doble seis.");
        } else if (seisesJ1 == 2) {
            System.out.println("Gana Jugador 1 (doble seis)");
        } else if (seisesJ2 == 2) {
            System.out.println("Gana Jugador 2 (doble seis)");
        }
        else if (seisesJ1 == 1 && seisesJ2 == 0) {
            System.out.println("Gana Jugador 1 (tiene un seis)");
        } else if (seisesJ2 == 1 && seisesJ1 == 0) {
            System.out.println("Gana Jugador 2 (tiene un seis)");
        } else {
            if (j1.sumaDados() > j2.sumaDados()) {
                System.out.println("Gana Jugador 1 por mayor puntuación");
            } else if (j2.sumaDados() > j1.sumaDados()) {
                System.out.println("Gana Jugador 2 por mayor puntuación");
            } else {
                System.out.println("Empate por misma puntuación");
            }
        }
    }
}
