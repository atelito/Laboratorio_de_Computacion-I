package tp2;
import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        /* Pedir el ingreso de dos cadenas por teclado,
        indicar si la segunda cadena se encuentra dentro de la primera (usar indexOf o contains).
         */
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Ingrese cadena de texto");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese cadena de texto");
        String cadena2 = sc.nextLine();
        
        if (cadena1.contains(cadena2)) {
            System.out.println("La segunda cadena se encuentra dentro de la primera");
        }
        else {
            System.out.println("La segunda cadena NO se encuentra dentro de la primera");
        }
        
        
    }
}
