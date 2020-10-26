package tp2;

import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {
        /* Codifique un programa que solicite un número entero mayor a cero
        y que mediante recursión sume todos los números números naturales desde el número ingresado
        hasta 1.
            Ejemplo: Ingreso 10
            El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1
         */
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero");
        int num = sc.nextInt();

        int resultado = suma(num);

        System.out.println(resultado);

        
    }

    public static int suma(int n) {
        int res;
        
        if (n == 0) {
            return 0;
        }
        else {
            res = n + suma(n-1);
        }
        return res;



    }
}
