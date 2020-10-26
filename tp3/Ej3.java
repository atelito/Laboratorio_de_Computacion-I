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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea un array o arreglo unidimensional donde tú le indiques el tamaño
        por teclado y crear una función que rellene el array o arreglo con los
        múltiplos de un numero pedido por teclado. Por ejemplo, si defino un array
        de tamaño 5 y elijo un 3 en la función, el array contendrá 3, 6, 9, 12, 15.
        Muéstralos por pantalla usando otra función distinta.
        */
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese dimension del arreglo");
        int dimensionArreglo = teclado.nextInt();

        int arreglo [] = new int [dimensionArreglo];

        System.out.println("Ingrese numero para rellenar arreglo con multiplos de éste");
        int numMultiplo = teclado.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (i+1)*numMultiplo;
                //System.out.println(arreglo[i]); se debe usar una funcion distinta
        }      
        
        for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
        } 
        
    }
}
    
