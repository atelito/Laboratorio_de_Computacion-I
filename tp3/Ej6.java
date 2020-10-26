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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado aleatoriamente
        mediante la función java random.
    Realice una búsqueda secuencial de la siguiente forma:
    - se lee el valor que se desea buscar,
    - se compara la primera posición;
    - si son iguales,
    - fin de la búsqueda.
    - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
    - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje apropiado.
    - Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por primera vez.
        */
        Scanner teclado = new Scanner(System.in);
        int arreglo [] = new int [50];
        int control = 0;

        System.out.println("Ingrese el numero a buscar en el arreglo de 50 posiciones");
        int numBuscar = teclado.nextInt();       

        //se busca a medida que se genera el arreglo, para disminuir el tiempo de proceso.
        //Puede pasar que nunca termine por llenarse el arreglo por lo que la busqueda no es globalmente completa
        //pero el resultado sería el mismo ya que pide especificar la posicion que ese valor ocupa en el arreglo por primera vez
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = getNumeroAleatorio();
            if (arreglo[i] == numBuscar) {
                System.out.println("Se encontro el numero " + numBuscar + " en la posicion " + (i+1));
                control = 130;
                break;   
            }
            
        }
        if (control == 0) System.out.println("No se encontro el numero " + numBuscar + " en el arreglo");
    }


    public static int getNumeroAleatorio () {
        Random numAleatorio = new Random();
        return numAleatorio.nextInt();
    }


}

    
    

    
