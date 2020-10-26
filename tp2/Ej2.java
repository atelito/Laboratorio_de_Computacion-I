package tp2;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        /* Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique.
         */
        Scanner sc = new Scanner(System.in);
        byte num;
        
        
        
        try {
            System.out.println("Ingrese numero entero, entre -128 y 127");
            num = sc.nextByte();
            System.out.println("El numero ingresado es " + num);
        }
        catch(Exception e) {
            System.out.println("Error. Número ingresado fuera de rango");
            System.out.println("El codigo del error es: El error es Exception in thread main java.util.InputMismatchException: Value out of range. NN. Radix:10");
        }
        finally {
            System.out.println("Si hubieran errores se puede utilizar la sentencia Try & Catch");
        }
        
    }
}
