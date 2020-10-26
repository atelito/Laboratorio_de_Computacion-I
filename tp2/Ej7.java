package tp2;
import java.util.Locale;
import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        /* Solicite el ingreso de una cadena y determine el tamaño de la misma
        y cuantas vocales tiene en total (recorre el String con charAt)
         */
        Scanner sc = new Scanner (System.in);
        
        String frase;
        System.out.println("Ingrese una cadena de texto");
        frase = sc.nextLine();
        frase = frase.toLowerCase(Locale.ROOT);
        
        frase.toCharArray();
        
        int contadorLetras = 0;
        int contadorVocales = 0;
               
        for (int i =0; i<frase.length(); i++) {
           contadorLetras += 1;
           if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
               contadorVocales++;           
           }
               
        }
        System.out.println("La cantidad de caracteres de la cadena con ciclo for es " + contadorLetras + " y la cantidad de vocales es " + contadorVocales); 
         
    }
}
