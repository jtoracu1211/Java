import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase para codificar:");
        String frase = teclado.nextLine();
        frase = frase.toUpperCase();
        String codificado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                if (c == 'Z') {
                    codificado = codificado + 'A';
                } else {
                    codificado = codificado + (char)(c + 1);
                }
            }
            else if (c >= '0' && c <= '9') {
                if (c == '9') {
                    codificado = codificado + '0';
                } else {
                    codificado = codificado + (char)(c + 1);
                }
            }
        }
        System.out.println("Mensaje codificado: " + codificado);
    }
}
