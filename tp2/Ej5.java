package tp2;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        /* Solicite el ingreso de un número y conviértalo a un String mediante
        String.valueOf
         */
        
        Scanner sc = new Scanner(System.in);
        
        double num;
        System.out.println("Ingrese numero");
        num = sc.nextDouble();
        System.out.println("El numero ingresado es de tipo " +  ((Object)num).getClass().getSimpleName());
                
        String numAString = String.valueOf(num);  
        System.out.println("El numero ingresado ahora es de tipo " +  ((Object)numAString).getClass().getSimpleName());
        
    }
}
