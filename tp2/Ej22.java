package tp2;

import java.util.Scanner;

public class Ej22 {

    public static void main(String[] args) {
        /* Suma los dígitos de un número ingresado por el usuario de forma recursiva.
                Ejemplo: el usuario ingresa 1596
                El programa debe sumar 1 + 5 + 9 + 6
         */
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero");
        int num = sc.nextInt();

        int resultado = sumaRecursiva(num);

        System.out.println(resultado);

        
    }

    public static int sumaRecursiva(int n) {
        int res = 0;
        
        if (n <= 0) {
            return 0;
        }
        else {
            res = (n % 10) + sumaRecursiva(n / 10);
            
        }
        return res;



    }
}
