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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 10
        //Lee un número por teclado y comprueba que este número
        //es mayor o igual que cero, si no lo es lo volverá a pedir (do while),
        //después muestra ese número por consola
        
        Scanner sc = new Scanner(System.in);
        double num;
        
        do {
            System.out.println("Ingrese numero");
            num = sc.nextDouble();
        } while (num<0);
        
        System.out.println(num);
    }
    
}
