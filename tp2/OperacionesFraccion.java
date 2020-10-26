/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author axelp
 */

 /*
 Cree una clase Fraccion con dos atributos numéricos enteros, numerador y denominador.
 Agregue un constructor sobrecargado (debe contener como parámetros el numerador y el denominador)
 que cree el objeto Fraccion correspondiente.
 Agregue a la clase los siguientes 4 métodos e implemente los mismos:
 public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
 ……….
 }

 Cree una clase OperacionesFraccion que contenga un método main donde se solicite al usuario
 el ingreso de 4 valores numéricos enteros con los cuales se crearan 2 objetos Fraccion y finalizada
 la creacion de los mismos se ejecutaran los 4 métodos implementados anteriormente asignando el
 resultado a una nueva variable de tipo Fraccion y mostrando por pantalla el resultado de las
 operaciones realizadas.
 */
public class OperacionesFraccion {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese primer valor");
        int valor1 = sc.nextInt();
        System.out.println("Ingrese segundo valor");
        int valor2 = sc.nextInt();
        System.out.println("Ingrese tercer valor");
        int valor3 = sc.nextInt();
        System.out.println("Ingrese cuarto valor");
        int valor4 = sc.nextInt();

        Fraccion Fraccion1 = new Fraccion(valor1, valor2);
        Fraccion Fraccion2 = new Fraccion(valor3, valor4);
        Fraccion operacion = new Fraccion (0, 0);
        
        Fraccion suma = operacion.sumarFracciones(Fraccion1, Fraccion2);
        Fraccion resta = operacion.restarFracciones(Fraccion1, Fraccion2);
        Fraccion multiplicacion = operacion.multiplicarFracciones(Fraccion1, Fraccion2);
        Fraccion division = operacion.dividirFracciones(Fraccion1, Fraccion2);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
                

    }
    
}
