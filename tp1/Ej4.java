/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;


/**
 *
 * @author axelp
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 4
        //Declara 2 variables numéricas (con el valor que desees), he indica 
        //cual es mayor de los dos. Si son iguales indicarlo también.
        //Ves cambiando los valores para comprobar que funciona.        
        double num1 = 1;
        double num2 = 1;
        
        if (num1>num2)
            System.out.println("Numero 1 es mayor a numero 2");
        else
            if (num1<num2)
                System.out.println("Numero 2 es mayor a numero 1");
            else
                System.out.println("Numero 1 es igual a numero 2");
        
    }
    
}
