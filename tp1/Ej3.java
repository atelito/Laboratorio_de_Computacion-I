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
public class Ej3 {

    private static Object bufEntrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 3
        //Declara dos variables numéricas (con el valor que desees)
        //muestra por consola la suma, resta, multiplicación, división y módulo
        //(resto de la división).
        Scanner sc = new Scanner(System.in);
        
        double num1;
        double num2;
        double resultado;
                
        System.out.println("Ingrese primer numero");
        num1 = sc.nextDouble();
        
        System.out.println("Ingrese segundo numero");
        num2 = sc.nextDouble();
        
        resultado = num1 + num2;
        System.out.println("La suma de " + num1+ " y " + num2 + " es " + resultado);
        
        resultado = num1 - num2;
        System.out.println("La resta de " + num1+ " y " + num2 + " es " + resultado);
        
        resultado = num1 / num2;
        System.out.println("La division de " + num1+ " y " + num2 + " es " + resultado);
        
        resultado = num1 % num2;
        System.out.println("El resto de la division de " + num1+ " y " + num2 + " es " + resultado);
    }
    
}
