package tp2;
import java.util.Locale;
import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        /* Dada una cadena, extraer la cuarta y quinta letra usando el método substring
         */
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Ingrese cadena de texto de mas de 5 caracteres");
        String cadena = sc.nextLine();
        
        while (cadena.length()<5) {
            System.out.println("Error. Ingrese cadena de texto de mas de 5 caracteres");
            cadena = sc.nextLine();
        }
        
        System.out.println(cadena.substring(3, 5));
              
    }
}
