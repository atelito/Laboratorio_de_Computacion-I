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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    Codifique una aplicación para almacenar en un ArrayList<Integer>
    aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
    cuales se desea saber:
        a) su promedio aritmético
        b) cuántos de los números son iguales al promedio aritmético
        c) cuántos de los números son mayores que el promedio aritmético
        d) cuántos de los números son menores que el promedio aritmético
    */
        
        int salir = 0;
        ArrayList<Integer> valores = new ArrayList<>();
        System.out.println("Generando numeros aleatorios...");
        while (salir < 20){
            valores.add(Integer.valueOf((int)(Math.random()* 100)));
            salir += 1;
        }
        int mayor = 0;
        int menor = 0;
        int cantidadNumPromedio = 0;
        double promedio = 0;
        
        for (int i = 0; i < valores.size(); i++){
            promedio += valores.get(i)/valores.size();
        }
        for (int i = 0; i < valores.size(); i++){
            if (Integer_to_double(valores.get(i)) == promedio){
                cantidadNumPromedio += 1;
            }
            if (valores.get(i) > promedio){
                mayor += 1;
            }
            else if (valores.get(i) < promedio){
                menor += 1;
            }
        }
        System.out.println("El promedio aritmetico es : " + promedio/valores.size());    
        System.out.println("Hay " + cantidadNumPromedio + " numeros iguales al promedio");
        System.out.println("Hay " + mayor + " numeros mayores al promedio");
        System.out.println("Hay " + menor + " numeros menores al promedio");    

    }

    
    // de Integer a double
    public static double Integer_to_double(Integer num){
        Integer obj = new Integer(num);
        double numCasteado = obj.doubleValue();
        return numCasteado;
    }
    
}

