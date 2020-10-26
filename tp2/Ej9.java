package tp2;
import java.util.Locale;
import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        /* Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
        Muéstralos en línea recta, separados por un espacio entre cada carácter
         */
        Scanner sc = new Scanner (System.in);
        
        String frase = "La lluvia en Mendoza es escasa";
        
        for (int i=0; i<frase.length(); i++) {
            System.out.print(frase.codePointAt(i) + " ");
        
        
        }
        
    }
}
