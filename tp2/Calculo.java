/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author axelp
 */
public class Calculo {
    
    public static void main(String[] args){
        
        OperacionMatematica Ej19 = new OperacionMatematica();
        Ej19.setValor1(20);
        Ej19.setValor2(40);
        Ej19.setOperacion("+");
        Ej19.aplicarOperacion(Ej19.getOperacion());
        Ej19.setOperacion("-");
        Ej19.aplicarOperacion(Ej19.getOperacion());
        Ej19.setOperacion("*");
        Ej19.aplicarOperacion(Ej19.getOperacion());
        Ej19.setOperacion("/");
        Ej19.aplicarOperacion(Ej19.getOperacion());
        
    }
    
}
