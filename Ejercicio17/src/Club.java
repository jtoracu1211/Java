import java.util.*;

public class Club {
    private ArrayList<Socio> Lista_Socios;

    //mismo nombre que la clase
    //cuando se crea club se crea una lista de socios vacia para empezar
    public Club(){
        Lista_Socios = new ArrayList<>();
    }

    public void alta(Socio s){
        for(Socio socio :  Lista_Socios){
            //chequea que no exista otro socio con el mismo nombre y apellidos
            if(socio.getNombre().equalsIgnoreCase(s.getNombre()) &&
            socio.getApellidos().equalsIgnoreCase(s.getApellidos()))
            {
                //si existe no lo añade
                System.out.println("Ese socio ya existe");
                return;
            }
        }
        //si no lo existe lo añade al Arraylist
        Lista_Socios.add(s);
        System.out.println("Socio añadido");
    }

    //El nombre y apellido es para verificar que ya exista
    public void baja(String nombre, String apellidos){
        for(Socio socio :  Lista_Socios){
            if (socio.getNombre().equalsIgnoreCase(nombre) &&
            socio.getApellidos().equalsIgnoreCase(apellidos)){
                Lista_Socios.remove(socio);
                System.out.println("Socio eliminado");
                return;
            }
        }

        System.out.println("Socio no encontrado");
    }

    public void Modificaciones(String Apelllidos, Double NuevaCuota){
        for(Socio socio :  Lista_Socios){
            if(socio.getApellidos().equalsIgnoreCase(Apelllidos))
            {
                socio.setCuota(NuevaCuota);
                System.out.println("Cuota modificada");
                return;
            }
        }

        System.out.println("Socio no encontrado");
    }

    public void Consulta(String Apellidos){
        boolean encontrado = false;

        for(Socio socio : Lista_Socios){
            if(socio.getApellidos().equalsIgnoreCase(Apellidos)){
                System.out.println(socio);
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("Socio no encontrado");
        }
    }

    public void ListaSocios(){
        Collections.sort(Lista_Socios, Comparator.comparing(Socio::getApellidos));

        for(Socio socio :  Lista_Socios){
            System.out.println(socio);
        }
    }

    public double TotalCuotas(){
        double suma = 0;

        for(Socio socio :  Lista_Socios){
            suma += socio.getCuota();
        }
        return suma;
    }

    public String SocioAntiguo(){
        if(Lista_Socios.isEmpty()){
            System.out.println("No hay socios");
        }
        Socio socioAntiguo = Lista_Socios.get(0);

        for (Socio socio :Lista_Socios){
            if (socio.getFecha_inscripcion().isBefore(socioAntiguo.getFecha_inscripcion())){
                socioAntiguo = socioAntiguo;
            }
        }

        return socioAntiguo.getNombre() + " " + socioAntiguo.getApellidos();
    }
}
