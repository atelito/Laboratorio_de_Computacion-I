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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y.
        Cree un primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor entero que deberá ser
        ingresado por el usuario. A continuación cree un segundo array de tamaño [Y,X]
        y almacene en cada posición un valor entero que deberá ser ingresado por el usuario.
        Finalmente cree un tercer array de tamaño [X,Y] que será el resultante de multiplicar cada una de las posiciones
        de las filas del array uno por cada una de las posiciones de las columnas del array 2.
        
        Muestre por pantalla cada uno de los arrays con sus valores.
        */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese numero de filas de arreglo");
        int X = teclado.nextInt();
        System.out.println("Ingrese numero de columnas de arreglo");
        int Y = teclado.nextInt();

        int [][] matriz = getArregloIntConMultiDimension(X, Y);
        int [][] matriz2 = getArregloIntConMultiDimension(Y, X);
        int [][] matriz3 = getMatrizMultFilasXColumnas(matriz, matriz2);
        imprimirArregloMultiIntEnLinea(matriz);
        imprimirArregloMultiIntEnLinea(matriz2);
        imprimirArregloMultiIntEnLinea(matriz3);

        
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
