/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Random;
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
        /* Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares del 1 al 100,
        de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético
        */
        Scanner teclado = new Scanner(System.in);



        int arreglo [] = new int [20];
        double promedio = 0;


        for (int i = 0; i < arreglo.length; i++) {  
            arreglo[i] = getNumeroAleatorio(1, 100);
            promedio += arreglo[i];
        }
        
        promedio /= arreglo.length;

        System.out.println("El promedio aritmetico es: " + promedio);
        int promedioInt = (int)promedio;
        System.out.println("El promedio aritmetico entero es: " + promedioInt);  //punto a

        int num = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == promedioInt) 
            num += 1;
            }

        num = 0;

        System.out.println("Hay " + num + " números iguales que el promedio aritmético"); //punto b

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) 
            num += 1;
            }

        System.out.println("Hay " + num + " números mayores que el promedio aritmético"); //punto c

        num = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) 
            num += 1;
            }

        System.out.println("Hay " + num + "números menores que el promedio aritmético"); //punto d


    }

    public static int getNumeroAleatorio (int min, int max) {
        Random numIntAleatorio = new Random();
        return numIntAleatorio.nextInt(max) + min;
    }


}

    
    

    
