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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de estos países.
        Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea 
        el número asignado a cada país y el segundo índice el número asignado a cada ciudad.
        Es decir el array deberá tener un tamaño de 4x4 
        
        Ejemplo de resultados que debe mostrar el programa:
        País: Argentina Ciudades: Buenos Aires Cordoba La Plata
        País: España Ciudades: Madrid Lugo Sevilla
        País: Francia Ciudades: Paris Niza Lyon
        País: Italia Ciudades: Roma Napoles Sicilia
        */

        Scanner teclado = new Scanner(System.in);
        String [][] matrizPaisCiudad = getMatrizString(4, 4);
        imprimirMatrizStringEnLinea(matrizPaisCiudad);
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
    }
