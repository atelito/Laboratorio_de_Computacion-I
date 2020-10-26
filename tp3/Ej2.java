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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea un array o arreglo unidimensional con un tamaño de 5,
        asignale los valores numéricos manualmente (los que tú quieras)
        y muestralos por pantalla. Solicite los números mediante un bucle.
        */
        Scanner teclado = new Scanner(System.in);
        
        int [] arreglo = new int [5];
        arreglo[0] = 1;
        arreglo[1] = 11;
        arreglo[2] = 111;
        arreglo[3] = 8;
        arreglo[4] = 9;
        
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese numero en la posicion " + (i+1));
            arreglo[i] = teclado.nextInt();
        }
            
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("El numero ingresado en la posicion " + (i+1) + " es " + arreglo[i]);
        }
            
            
        
    }
    
}
