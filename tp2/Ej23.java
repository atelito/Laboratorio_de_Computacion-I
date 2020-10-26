package tp2;

import java.util.Scanner;


public class Ej23 {

    public static void main(String[] args) {
        /* Crea un programa donde se pida el ingreso de una cadena y por medio de recursión mostrar la cadena de forma inversa.
                Ejemplo: Ingreso “computadora de escritorio”
                Invertir cadena “oirotircse ed arodatupmoc”
         */
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cadena de texto");
        String cadena = sc.nextLine();
        System.out.println("La cadena original es: " + cadena);
        
        //con la clase StringBuilder y metodo reverse
        StringBuilder stringBuilder = new StringBuilder(cadena);
        String cadenaInvertida2 = stringBuilder.reverse().toString();
        System.out.println("La cadena original con StringBuilder es: " + cadenaInvertida2);
        
        //con Recursividad
        String cadenainvertida="";
        String cadenaInvertida = inversion(cadena);
        System.out.println("La cadena original con Recursividad es: " + cadenaInvertida);
        
    }

    public static String inversion(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        }
        else {
            return inversion(palabra.substring(1)) + palabra.charAt(0);          
        }
    }

    }