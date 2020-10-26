/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author axelp
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 14
        //Codifique un programa de consola en Java que permita realizar las siguientes acciones:
        //Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
        //int x = new Double(Math.random() * 100).intValue();
        //Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
        //ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
        //aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
        //para lograrlo.
        
        Scanner sc = new Scanner(System.in);
        
        int prueba;
        int i;
        i=1;
        int aleatorio = new Double(Math.random() * 100).intValue();
        
        System.out.println("El numero aleatorio es "+aleatorio)                ;
                
        do {
            System.out.println("Ingrese un numero para saber si es el numero aleatorio");
            prueba = sc.nextInt();
            if (prueba>aleatorio) {
            System.out.println("Es muy alto");
            i = i +1;
            }
            else {
                if (prueba<aleatorio) {
                    System.out.println("Es muy bajo");
                    i = i +1;
                }
                else System.out.println("Correcto, numero encontrado, cantidad de intentos "+i);
                }
        }
        while (prueba != aleatorio);
    }
  }
