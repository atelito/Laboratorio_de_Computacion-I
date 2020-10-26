/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author axelp
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y
        muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
        */
        Scanner teclado = new Scanner(System.in);

        double arreglo [] = new double [20];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese numero decimal en posicion del arreglo " + (i+1));    
            arreglo[i] = teclado.nextInt(); //punto a
        }
        
        double numMayor = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > numMayor) {
                numMayor = arreglo[i];
            }
        }
        System.out.println("El mayor numero ingresado en el arreglo es: " + numMayor); //punto b
        
        double numMenor = numMayor;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < numMayor ) {
                numMayor = arreglo[i];
            }
        }
        System.out.println("El menor numero ingresado en el arreglo es: " + numMayor); //punto c
        System.out.println("El rango del arreglo es: " + (numMenor-numMayor)); //punto c
    
    
    
    }
    
}
    
