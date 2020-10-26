/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.*;

/**
 *
 * @author axelp
 */
public class EjMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10,
        pedir los valores numéricos enteros para cargar cada uno de los arreglos,
        cree un tercer arreglo de tamaño 10 que contenga en cada posición
        la suma de la multiplicación de cada elemento del array uno por cada elemento del array 2
        
ARRAY3 = (posición 0 del arreglo 1 * posición 0 del arreglo 2) +
         (posición 0 del arreglo 1 * posición 1 del arreglo 2) +
         (posición 0 del arreglo 1 * posición 2 del arreglo 2) +
         ………… +
         (posición 4 del arreglo 1 * posición 9 del arreglo 2)
        
         Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores en el 3 array.
        
        */


        Scanner teclado = new Scanner(System.in);
        int dimF = 1;
        int dimC = 5;
        int dimF2 = 5;
        int dimC2 = 1;


        int[][] arreglo1 = getArregloIntConMultiDimension(dimF, dimC);
        int[][] arreglo2 = getArregloIntConMultiDimension(dimF2, dimC2);

        imprimirArregloMultiIntEnLinea(arreglo1);
        imprimirArregloMultiIntEnLinea(arreglo2);

        int[][] arreglo3 = getMultiplicarArreglo(arreglo1, arreglo2);
        imprimirArregloMultiIntEnLinea(arreglo3);
        
        
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

    public static int[][] getArregloIntConMultiDimension (int dimFila, int dimColumna) {
        Scanner teclado = new Scanner(System.in);
        int arregloMultiInt [][] = new int [dimFila][dimColumna];
        for (int i = 0; i < dimFila; i++) {
            for (int j = 0; j <dimColumna; j++) {
                System.out.println("Ingrese numero entero en fila " + i + ", columna " + j);
                arregloMultiInt[i][j] = teclado.nextInt();
            }
        }
        return arregloMultiInt;
    }
    

    public static int[][] getMultiplicarArreglo (int [][] arreglo1, int [][] arreglo2) {
        int arregloMultiplicacion [][] = new int [arreglo1.length][arreglo2[0].length];        
        if (arreglo1[0].length != arreglo2.length){
            System.out.println("No se pueden multiplicar las matrices");
        }
        else {

        }
        // i numero de filas de la matriz resultante
        // j numero de columnas de la matriz 2
        // k numero de filas de la matriz 2
        for (int i = 0; i < arregloMultiplicacion.length; i++) {
            for (int j = 0; j < arreglo2[0].length; j++) {
                for (int k = 0; k < arreglo2.length; k++){
                    arregloMultiplicacion[i][j] += arreglo1[i][k] * arreglo2[k][j];
                }
            }
        }
        return arregloMultiplicacion;
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
        System.out.println("");
    }
    
    public static void imprimirArregloMultiIntEnLinea (int [][] arreglo) {
        System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++){
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("");
    }

}

    
