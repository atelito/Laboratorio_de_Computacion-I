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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    Codifique una aplicación que:
    a) lea 20 números decimales ingresados por teclado por el usuario y los
    coloque en un ArrayList<Double>.
    b) determine y muestre el mayor de los números en el arreglo
    c) determine y muestre el menor de los números del arreglo calcule y
    muestre el rango (diferencia entre el mayor y el menor) de los
    elementos en el arreglo
    */
        

        Scanner teclado = new Scanner(System.in);
        int salir = 0;
        ArrayList<Double> valores = new ArrayList<>();
        //for (int i = 0; i < valoresNumericos.size(); i++)
        while (salir < 20){
            System.out.println("Ingrese valores numericos decimales");
            valores.add(teclado.nextDouble());
            salir += 1;
        }
        double mayor = valores.get(0);
        double menor = valores.get(0);
        
        for (int i = 0; i < valores.size(); i++){
            if (valores.get(i) > mayor){
                mayor = valores.get(i);
            }
            else if (valores.get(i) < menor){
                menor = valores.get(i);
            }
        }
        System.out.println("El numero mayor ingresado es: " + mayor);
        System.out.println("El numero menor ingresado es: " + menor);    
        System.out.println("El rango entre estos numeros es : " + (mayor-menor));    
            
    }

}

