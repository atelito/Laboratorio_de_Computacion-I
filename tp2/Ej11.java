package tp2;
import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        /* Pedir dos palabras por teclado, indicar si son iguales.
        (equals, compareTo, compareToIgnoreCase)
         */
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese primera palabra");
        String palabra1 = sc.nextLine();
        
        System.out.println("Ingrese segunda palabra");
        String palabra2 = sc.nextLine();
        
        if (palabra1.equals(palabra2)) {
            System.out.println("Son iguales con equals");
        }
        else {
            if (palabra1.compareTo(palabra2) == 0) {
                System.out.println("Son iguales con compareTo");
            }
            else {
                //no tiene en cuenta May y Min
                if (palabra1.compareToIgnoreCase(palabra2) == 0) {
                System.out.println("Son iguales con compareToIgnoreCase");
            }
                else {
                System.out.println("No son iguales");
                }
            }
        }
                
    }
}
