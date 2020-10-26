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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    Codifique una aplicación que solicite y cargue en una ArrayList<Integer> 10 dígitos enteros,
    luego cree dos nuevas ArrayList<Integer> y asigne a la primera los números ingresados por el usuario
    de forma ascendente y en la segunda de forma descendente.
    Muestre las 2 listas por pantalla. Investigue como ordenar una Lista(List<>)
    */
        
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int salir = 0;
        ArrayList<Integer> valores = new ArrayList<>();
        while (salir < 10){
            System.out.println("Ingrese numero entero");
            valores.add(int_to_Integer(teclado.nextInt()));
            salir += 1;
        }
        ArrayList<Integer> valoresAsc = new ArrayList<>();
        ArrayList<Integer> valoresDesc = new ArrayList<>();
        
        /* for (Integer numero: valores) {
            System.out.println(numero);
        } */
        /* System.out.println("Numeros ordenados de menor a mayor");        
        for (Integer numero: valores) {
            System.out.println(numero);
        } */
        
        Collections.sort(valores);
        System.out.println("Numeros ordenados de menor a mayor");
        for (int i = 0; i<valores.size(); i++){
            valoresAsc.add(i, valores.get(i));
            System.out.println(valoresAsc.get(i));
        }
        // puede usarse el Comparator como no, si se usa lo tendira que poner como argumento  en la linea de sort siguiente
        // Comparator<Integer> comparador = Collections.reverseOrder(); 
        Collections.sort(valores, Collections.reverseOrder());
        System.out.println("Numeros ordenados de mayor a menor");
        for (int i = 0; i<valores.size(); i++){
            valoresDesc.add(i, valores.get(i));
            System.out.println(valoresDesc.get(i));
        }



    }


//CASTEO////////////////////////////////////////////////////////////////////////////

    //////// int ////////
    // de int a Integer
    public static Integer int_to_Integer(int num){
        Integer numCasteado = Integer.valueOf(num);
        return numCasteado;
    }

}

