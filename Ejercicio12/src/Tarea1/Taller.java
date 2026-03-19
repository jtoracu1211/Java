package Tarea1;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Taller {
    private static ArrayList<Ordenador> ordenadores = new ArrayList<Ordenador>();
    public static void entradaTaller() {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String cod_rep;
        String cod_cli;
        String descripcion;
        String fecha_formato;
        LocalDate fecha_compra;
        String garantia;
        double precio;
        System.out.println("Introduzca el código del reparación");
        cod_rep = sc.nextLine();
        System.out.println("Introduzca el código del cliente");
        cod_cli = sc.nextLine();
        System.out.println("Introduzca la descripción de la avería");
        descripcion = sc.nextLine();
        System.out.println("¿Tiene garantína? (s/n)");
        garantia = sc.nextLine();
        if (garantia.equalsIgnoreCase("s")) {
            boolean okparse=true;
            do {
                try {
                    System.out.println("¿Cuál es la fecha de la compra de su ordenador?");
                    fecha_formato = sc.nextLine();
                    fecha_compra = LocalDate.parse(fecha_formato,formato);
                    Garantia og = new Garantia(cod_rep, cod_cli, descripcion, fecha_formato);
                    ordenadores.add(og);
                    okparse=true;
                } catch (Exception e) {
                    System.out.println("Formato de fecha erróneo");
                    okparse=false;
                }
            }while (!okparse);
        } else {
            Ordenador o = new Ordenador(cod_rep, cod_cli, descripcion);
            ordenadores.add(o);
        }
    }
    public static boolean introPresupuesto(String cod_reparacion) {
        for (Ordenador ordenador : ordenadores) {
            if (cod_reparacion.equalsIgnoreCase(ordenador.getCod_rep()) && ordenador.getEstado()==0) {
                if (!(ordenador instanceof Garantia)) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("¿Cual es el presupuesto de la reparación?");
                    double pres = sc.nextDouble();
                    ordenador.setPresupuesto(pres);
                }
                System.out.println("Presupuesto realizado");
                return true;
            }
        }
        return false;
    }
    public static boolean aceptPresupuesto(String cod_reparacion) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        for (Ordenador ordenador : ordenadores) {
            if (cod_reparacion.equalsIgnoreCase(ordenador.getCod_rep())&& ordenador.getEstado()==0 ) {
                if (!(ordenador instanceof Garantia)) {
                    System.out.println("Presupuesto: "+ordenador.getPresupuesto()+" ¿Acepta usted el presupuesto? (s/n)");
                    respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        ordenador.setEstado(1);
                    }
                }else ordenador.setEstado(2);//Se puede hacer la retirada del ordenador
                System.out.println("Cambio de estado realizado");
                return true;
            }
        }
        return false;
    }
    public static boolean reparacion(String cod_recibido) {
        for (Ordenador o : ordenadores) {
            if (cod_recibido.equalsIgnoreCase(o.getCod_rep()) && o.getEstado()==1 ) {
                o.setEstado(2);
                System.out.println("Reparación realizada");
                return true;
            }
        }
        return false;
    }
    public static boolean entregaOrdenador(String cod_recibido) {
        for (Ordenador o : ordenadores) {
            if (cod_recibido.equalsIgnoreCase(o.getCod_rep()) && o.getEstado() == 2) {
                ordenadores.remove(o);
                System.out.println("Ordenador entregado");
                return true;
            }
        }
        return false;
    }
    public static void listar() {
        for (Ordenador o : ordenadores) {
            System.out.println(o);
        }
    }
}