/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6_Collections;
import java.util.*;
/**
 *
 * @author axelp
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    Cree un ArrayList<Integer>,
    que permita asignar los valores numéricos manualmente (los que tú quieras)
    hasta ingresar un valor menor a 0, mostrar los números por pantalla.
    Solicite los números mediante un bucle.
    */
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        ArrayList<Integer> valores = new ArrayList<>();
        //for (int i = 0; i < valoresNumericos.size(); i++)
        while (!salir){
            System.out.println("Ingrese valor numerico de tipo entero. Ingrese 0 para terminar");
            valores.add(teclado.nextInt());
            if (valores.get(valores.size()-1) < 0) {
                salir = true;
            }
        }
            valores.forEach((i) -> {
                System.out.println("Los valores ingresados son: " + i);
        });
    }
}

