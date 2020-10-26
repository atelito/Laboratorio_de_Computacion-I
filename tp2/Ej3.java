package tp2;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        /* Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14.
         */
        Scanner sc = new Scanner(System.in);
        int num;
        int resultado = 0;
        System.out.println("Ingrese numero entre 100 y 999");
        num = sc.nextInt();
        
        while (num>0) {
        
        // me quedo con el ultimo digito y lo guardo
        resultado += num % 10;
        // le saco un digito y vuelvo a comenzar
        num = num / 10;
            
        }
        
        System.out.println(resultado);
        
    }
}
