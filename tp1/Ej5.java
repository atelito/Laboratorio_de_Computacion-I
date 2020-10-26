/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author axelp
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 5
        //Lee un número por teclado e indica si es divisible entre 2 (resto = 0)
        //Si no lo es, también debemos indicarlo.
        Scanner sc = new Scanner(System.in);
        
        double num;
        num = 0;
        System.out.println("Ingrese numero a comprobar");
        num = sc.nextDouble();
        
        
        if (num % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero NO es par");
       }
    
}
 
    
    
