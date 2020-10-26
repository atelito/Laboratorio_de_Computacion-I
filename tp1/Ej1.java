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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 1
        //Declara un String que contenga tu nombre, después muestra un mensaje
        //de bienvenida por consola. Por ejemplo: si introduzco “Fernando”,
        //me aparezca “Bienvenido Fernando”.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre1 = sc.nextLine();
        
        System.out.println("Bienvenido "+ nombre1);  
    }
    
}
