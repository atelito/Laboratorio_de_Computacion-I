/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6_Collections;
import java.util.*;
/**
 *
 * @author axelp
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    Realice una búsqueda secuencial en un ArrayList<Integer> que contenga 50 elementos generados aleatoriamente
    mediante la función java random.
    Realice una búsqueda secuencial de la siguiente forma:
        - se lee el valor que se desea buscar,
        - se compara la primera posición;
        - si son iguales, fin de la búsqueda.
        - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
        - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
            con un mensaje apropiado.
        - Si se encuentra, se debe especificar la posición que ese valor ocupa en la lista
            por primera vez.
    */
        
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int salir = 0;
        ArrayList<Integer> valores = new ArrayList<>();
        System.out.println("Generando numeros aleatorios...");
        while (salir < 50){
            valores.add(int_to_Integer(aleatorio.nextInt()));
            salir += 1;
        }
        System.out.println("Ingrese valor a buscar");
        Integer numeroBuscador = int_to_Integer(teclado.nextInt());
        boolean numEncontrado = false;
        
        for (int i = 0; i<valores.size(); i++){
            if (valores.get(i).compareTo(numeroBuscador) == 0){
                System.out.println("Numero encontrado en la posicion " + i);
                numEncontrado = true;
                break;
            }
        }
        if(numEncontrado == false) System.out.println("Numero NO encontrado");
    }


//CASTEO////////////////////////////////////////////////////////////////////////////

    //////// int ////////
    // de int a Integer
    public static Integer int_to_Integer(int num){
        Integer numCasteado = Integer.valueOf(num);
        return numCasteado;
    }

}

