import java.util.Scanner;

public class Tarea04 {
    private String frase, letra;
    public static void imprimir(String frase) {
        System.out.println("La frase mide: " + frase.length() + " caracteres");
    }
    public void sustituir(String frase, String letra) {
        frase = frase.replace(letra, "*");
        System.out.println(frase);
    }
    public void invertir (String frase){
        String resultado = "";
        String palabra = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                palabra = c + palabra;
            } else {
                resultado += palabra + " ";
                palabra = "";
            }
        }
        resultado += palabra;
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tarea04 tarea = new Tarea04();
        tarea.frase = "";
        while (!tarea.frase.equals("*")) {
            System.out.print("Escribe una frase: ");
            tarea.frase = teclado.nextLine();
            imprimir(tarea.frase);
            System.out.print("Introduce una letra: ");
            tarea.letra = teclado.nextLine();
            tarea.imprimir(tarea.frase);
            tarea.sustituir(tarea.frase, tarea.letra);
            tarea.invertir(tarea.frase);
            System.out.println();
        }
    }
}
