package tp2;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        /* Desarrolle un programa que ayude a una cajera a determinar el número
        de billetes y monedas que se necesitan de cada una de las siguientes
        denominaciones 200, 100, 50, 20, 10, 5, 2 y 1,
        y monedas de 0.50, 0.25, 0.10 y 0.05 centavos para una cantidad de dinero dada.
        Ejemplo si la cantidad es 1390,55 se necesitan 6 billetes de 200,
        1 billete de 100, 1 billete de 50, 2 billetes de 20, 1 moneda de 0.50 y una moneda de 0.05 centavos.
         */
        Scanner sc = new Scanner(System.in);
        
        double num;
        int cantidad200 = 0;
        int cantidad100 = 0;
        int cantidad50 = 0;
        int cantidad20 = 0;
        int cantidad10 = 0;
        int cantidad5 = 0;
        int cantidad2 = 0;
        int cantidad1 = 0;
        int cantidad05 = 0;
        int cantidad025 = 0;
        int cantidad01 = 0;
        int cantidad005 = 0;
        
        System.out.println("Ingrese numero");
        
        num = sc.nextDouble();
        
        while (num - 200 >= 0) {
            cantidad200 += 1;
            num -= 200;        
        }
        
        while (num - 100 >= 0) {
            cantidad100 += 1;
            num -= 100;        
        }
        
        while (num - 50 >= 0) {
            cantidad50 += 1;
            num -= 50;        
        }
        
        while (num - 20 >= 0) {
            cantidad20 += 1;
            num -= 20;        
        }
        
        while (num - 10 >= 0) {
            cantidad10 += 1;
            num -= 10;        
        }
        
        while (num - 5 >= 0) {
            cantidad5 += 1;
            num -= 5;        
        }
        
        while (num - 2 >= 0) {
            cantidad2 += 1;
            num -= 2;        
        }
        
        while (num - 1 >= 0) {
            cantidad1 += 1;
            num -= 1;        
        }
                
        while (num - 0.5 >= 0) {
            cantidad05 += 1;
            num -= 0.5;        
        }
               
        while (num - 0.25 >= 0) {
            cantidad025 += 1;
            num -= 0.25;        
        }   
        
        while (num - 0.1 >= 0) {
            cantidad01 += 1;
            num -= 0.1;        
        }
               
        while (num - 0.05 >= 0) {
            cantidad005 += 1;
            num -= 0.05;        
        }
        System.out.println("Se requieren " + cantidad200 + " billetes de 200, " + cantidad100 + " billetes de 100, " + cantidad50 + " billetes de 50, " + cantidad20 + " billetes de 20, " + cantidad10 + " billetes de 10, " + cantidad5 + " billetes de 5, " + cantidad2 + " billetes de 2, " + cantidad1 + " billetes de 1, " + cantidad05 + " monedas de 0,5, " + cantidad025 + " monedas de 0,25, " + cantidad01 + " monedas de 0,1, " + cantidad005 + " monedas de 0,05");
    }
}
