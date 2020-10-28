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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJ 9
        //Muestra los números del 1 al 100 (ambos incluidos) divisibles 
        //entre 2 y 3. Utiliza el bucle que desees
        
        int i = 1;
                
        while (i<=100) {
            if (i%2==0 || i%3==0) System.out.println(i);
            i++;
        }
          
        
    }
    
}
