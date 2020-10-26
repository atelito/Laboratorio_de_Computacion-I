package tp2;
import java.util.Locale;
import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        /* Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida 
        y mostraremos el resultado por pantalla.
         */
        Scanner sc = new Scanner (System.in);
        
        int opcion;
        String frase;
        System.out.println("Ingrese una frase");
        frase = sc.nextLine();
        
        System.out.println("Si desea convertir la frase a MAYÚSCULAS presione 1, si desea convertir la frase a minúscuas presione 2, sino presione 0 para salir");
        opcion = sc.nextInt();
        switch (opcion) {
        
                case 0:
                    System.out.println(frase);
                    break;
                case 1:
                    System.out.println(frase.toUpperCase(Locale.ROOT));
                    break;
                case 2:
                    System.out.println(frase.toLowerCase(Locale.ROOT));
                    break;
                    
        
        }
        
    }
}
