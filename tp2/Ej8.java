package tp2;
import java.util.Locale;
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        /* Reemplaza todas las a del String anterior por una e. (aplique replace)
         */
        Scanner sc = new Scanner (System.in);
        
        String frase;
        System.out.println("Ingrese una cadena de texto");
        frase = sc.nextLine();
        frase = frase.toLowerCase(Locale.ROOT);        
        
        String frese = frase.replace('a', 'e');
        
        System.out.println(frese);
    }
}
