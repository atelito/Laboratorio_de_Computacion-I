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
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJ 12
        //Crea una aplicación que nos pida un día de la semana y que nos diga si
        //es un dia laboral o no (siendo sábado y domingo no laborales).
        //Usa un switch para ello. Valida que el número ingresado sea un valor
        //entre 1 y 7, caso contrario solicite el valor nuevamente.
        
        Scanner sc = new Scanner(System.in);
        int diaSemana;
                
        
        do{
            System.out.println("Ingrese dia");
            diaSemana = sc.nextInt();
        }
        while (diaSemana<1 || diaSemana>7);
        
        
        switch(diaSemana) {
            case 1:
                System.out.println("Laboral");
                break;
            case 2:
                System.out.println("Laboral");
                break;
            case 3:
                System.out.println("Laboral");
                break;
            case 4:
                System.out.println("Laboral");
                break;
            case 5:
                System.out.println("Laboral");
                break;        
            case 6:
                System.out.println("No Laboral");
                break;
            case 7:
                System.out.println("No Laboral");
                break;
            default:
                System.out.println("Numero ingresado no valido");
        
        }
            
    }    
        
        
}
