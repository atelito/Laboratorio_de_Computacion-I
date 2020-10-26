package tp2;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        /* CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones.
         */
        Scanner sc = new Scanner(System.in);
        double valorDecimal;
        
        System.out.println("Ingrese numero decimal");
        valorDecimal = sc.nextDouble();
        
        //se hace un narrowing casting
        int valorEntero = (int) valorDecimal;
        System.out.println("El valor del número a variable primitiva de tipo entero es "+ valorEntero);
        
        //se hace un narrowing casting
        short valorEnteroCorto = (short) valorDecimal;
        System.out.println("El valor del número a variable primitiva de tipo entero corto es "+ valorEnteroCorto);
        
        //se hace un narrowing casting
        long valorEnteroLargo = (long) valorDecimal;
        System.out.println("El valor del número a variable primitiva de tipo entero largo es "+ valorEnteroLargo);
        
        // Hacerlo asi no da error pero no lo muestra
        char valorCaracter = (char) valorDecimal;
        System.out.println("El valor del número a variable primitiva de tipo caracter es "+ valorCaracter);
        
        // Hacerlo asi lo muestra pero uso un metodo
        String ValorCaracterMetodo=String.valueOf(valorDecimal);  
        System.out.println("El valor del número a variable primitiva de tipo caracter con metodo es "+ ValorCaracterMetodo);
        
        float valorDecimalCorto = (float) valorDecimal;
        System.out.println("El valor del número a variable primitiva de tipo caracter es "+ valorDecimalCorto);
    }
}
