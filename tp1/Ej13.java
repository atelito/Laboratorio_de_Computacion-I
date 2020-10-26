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
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 13
        //Pide un número por teclado e indica si es un número primo o no.
        //Un número primo es aquel solo puede dividirse entre 1 y sí mismo.
        //Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5,
        //sin embargo, 17 si es primo. Un buen truco para calcular
        //la raíz cuadrada del numero e ir comprobando que si es divisible desde
        //ese número hasta 1.
        //NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
        
        Scanner sc = new Scanner(System.in);
        int num;  
                
        do{
            System.out.println("Ingrese numero a evaluar");
            num = sc.nextInt();
        }
        while (num<1);
        
        if (num == 1){
            System.out.println("El numero "+ num + " NO es primo");
        }
        else {
            int resultado = factorial(num-1);
            if (((resultado+1)%num) == 0){
                System.out.println("El numero "+ num + " es primo");
            }
            else System.out.println("El numero "+ num + " NO es primo");
        }
            
    }    
    
    public static int factorial(int n) {
        int res;
        if (n==1) {
        return 1;
        }
        else {
        res = n * factorial(n - 1);
        }
        return res;
    } 
        
}
// El codigo estabien, pero creo que hay un desbordamiento de las variables
// "int" ya que el factorial empieza a ser demasiado grande
// Se aplico el teorema de Wilson:
//      "Un número n es primo si y solo si (n-1)! + 1 es múltiplo de n"