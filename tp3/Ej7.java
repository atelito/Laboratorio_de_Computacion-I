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
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros,
        luego cree dos nuevos arreglos y asigne al primero los números ingresados por el usuario
        de forma ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.
        */


        Scanner teclado = new Scanner(System.in);
        //System.out.println("Ingrese dimension del arreglo entero");
        //int dim = teclado.nextInt();
        int dim = 10;

        int[] arreglo = getArregloIntConDimension(dim);
        imprimirArregloIntEnLinea(arreglo, dim);
        
        System.out.println("");

        int[] arregloAsc = getArregloIntAscendente(arreglo, arreglo.length);
        imprimirArregloIntEnLinea(arregloAsc, dim);

        System.out.println("");

        int[] arregloDesc = getArregloIntDescendente(arreglo, arreglo.length);
        imprimirArregloIntEnLinea(arregloDesc, dim);

        System.out.println("");
        
    }


    public static int[] getArregloIntConDimension (int dim) {
        Scanner teclado = new Scanner(System.in);
        int arregloInt [] = new int [dim];
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese numero entero en arreglo de dimension "+ dim);
            arregloInt[i] = teclado.nextInt();
        }
        return arregloInt;
    }


    public static int[] getArregloIntAscendente (int [] arregloAsc, int dim) {
        for(int i = 0; i < (arregloAsc.length-1) ; i++){
            for(int j = i+1 ; j<arregloAsc.length ; j++){
                if(arregloAsc[i] > arregloAsc[j]){
                    //Intercambiamos valores
                    int variableauxiliar = arregloAsc[i];
                    arregloAsc[i] = arregloAsc[j];
                    arregloAsc[j] = variableauxiliar;
 
                }
            }
        }
        return arregloAsc;
    }
    
    public static int[] getArregloIntDescendente (int [] arregloDesc, int dim) {
        for(int i = 0; i < (arregloDesc.length-1) ; i++){
            for(int j = i+1 ; j<arregloDesc.length ; j++){
                if(arregloDesc[i] < arregloDesc[j]){
                    //Intercambiamos valores
                    int variableauxiliar = arregloDesc[i];
                    arregloDesc[i] = arregloDesc[j];
                    arregloDesc[j] = variableauxiliar;
 
                }
            }
        }
        return arregloDesc;
    }
    
    public static void imprimirArregloIntEnLinea (int [] arreglo, int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
    

}

    
