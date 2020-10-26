/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;
import java.util.*;
/**
 *
 * @author axelp
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o igual a 10.
        Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los valores necesarios para
        cargar cada una de las celdas de la matriz. Muestre por pantalla la matriz resultante.
        Al finalizar la carga sume cada una de las columnas del array y asigne los resultados en una nueva matriz
        de una dimensión, finalmente sume los valores de esta última matriz y muestre el resultado por pantalla.
        */
        int X;

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese numero entero X mayor o igual a 3 y menor o igual a 10");
            X = teclado.nextInt();
        }
        while(X<3 || X>10);

        int [][] matriz = getArregloIntConMultiDimension(X, X);
        imprimirArregloMultiIntEnLinea(matriz);
        
        int [][] matriz2 = new int [1][matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++){
            for (int i = 0; i < matriz.length; i++){
                matriz2[0][j] += matriz[i][j];
            }
        }
        imprimirArregloMultiIntEnLinea(matriz2);
        
        int suma = 0;
        System.out.println("Suma de los valores de la Matriz de " + matriz2.length + " fila/s y " + matriz2[0].length + " columna/s");
        for (int j = 0; j < matriz2[0].length; j++){
            for (int i = 0; i < matriz.length; i++){
                suma = suma + matriz[i][j];
            }
                
        }

        System.out.println("La suma es " + suma);

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
            System.out.println("Fin carga matriz");
            return arregloMultiInt;
        }
        
        public static int[][] getMatrizMultFilasXColumnas (int [][] arreglo1, int [][] arreglo2) {
            int arregloMultiplicacion [][] = new int [arreglo1.length][arreglo1[0].length];
    
            for (int i = 0; i < arregloMultiplicacion.length; i++) {
                for (int j = 0; j < arregloMultiplicacion[0].length; j++) {
                    arregloMultiplicacion[i][j] += arreglo1[i][j] * arreglo2[j][i];    
                }
            }
            return arregloMultiplicacion;
        }


        public static String [][] getMatrizString (int dimFila, int dimColumna) {
            Scanner teclado = new Scanner(System.in);
            String matrizString [][] = new String [dimFila][dimColumna];
            for (int i = 0; i < dimFila; i++) {
                System.out.println("Ingrese nombre de pais en fila " + (i+1));
                matrizString[i][0] = teclado.nextLine();
            }
            for (int i = 0; i <dimFila; i++) {
                for (int j = 1; j < dimColumna; j++) {
                    System.out.println("Ingrese ciudad del pais " + matrizString[i][0]);
                    matrizString[i][j] = teclado.nextLine();
                    }
            }
            return matrizString;
        }

        public static void imprimirMatrizStringEnLinea (String [][] arreglo) {
            System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++){
                    System.out.print(arreglo[i][j] + " ");
                }
                System.out.println("");
    
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

    
