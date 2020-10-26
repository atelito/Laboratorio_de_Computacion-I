/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author axelp
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 2
        //Modifica la aplicación anterior, para que nos pida el nombre que
        //queremos introducir (aplica Scanner y JOptionPane)
        //JOptionPane sc = new JOptionPane(System.in).
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre1 = sc.nextLine();
        
        System.out.println("Bienvenido "+ nombre1);  
        
        String apellido = JOptionPane.showInputDialog("Ingrese apellido"); 
        System.out.println("Bienvenido "+ apellido);
    }
    
}
