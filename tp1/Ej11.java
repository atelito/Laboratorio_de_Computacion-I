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
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 11
        //Escribe una aplicaciÃ³n con un String que contenga una contraseÃ±a
        //cualquiera. DespuÃ©s se te pedirÃ¡ que introduzcas la contraseÃ±a
        //con 3 intentos. Cuando aciertes ya no pedirÃ¡ mÃ¡s la contraseÃ±a y
        //mostrara un mensaje diciendo â€œAcceso Correctoâ€�. 
        //Piensa bien en la condiciÃ³n de salida (3 intentos y si acierta sale,
        //aunque le queden intentos).
        
        Scanner sc = new Scanner(System.in);
        String contrasenaGuardada;
        contrasenaGuardada = "ejercicio";
        String contrasenaIngresada;
        int i;
        i = 0;
        
        System.out.println("Ingrese contraseÃ±a");
        contrasenaIngresada = sc.nextLine();
        
        
        
        if (contrasenaGuardada != contrasenaIngresada){
            do{
                System.out.println("ContraseÃ±a incorrecta, vuelva a ingresar contraseÃ±a");
            String v = sc.nextLine();
            i = i + 1;            
            }
            while (contrasenaGuardada != contrasenaIngresada || i<3);
        }
        else {
            System.out.print("ContraseÃ±a Correcto");    
        }
            
    }    
        
        
}
