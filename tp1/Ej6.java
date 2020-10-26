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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 6
        //Lee un número por teclado que pida el precio de un producto
        //(puede tener decimales) y calcule el precio final con IVA.
        //El IVA sera una constante que sera del 21%.
        Scanner sc = new Scanner(System.in);
        
        double num;
        
        System.out.println("Ingrese precio del producto sin IVA");
        num = sc.nextDouble();
        System.out.println("El precio final del producto es "+ num*1.21);
        
        
        
        
        
        
    }
    
}
