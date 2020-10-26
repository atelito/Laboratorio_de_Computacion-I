/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author axelp
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En Argentina cada persona está identificada con un Documento Nacional de Identidad (DNI)
        en el que figura un número y una letra, por ejemplo 56999545W
    La letra que sigue al número se calcula siguiendo la metodología que vamos a indicar.
    Crea un programa que calcule la letra de un DNI a partir del número de DNI que introduzca el usuario.
    Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI completo(con la letra).
    Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23.
    El resultado debe estar por tanto entre 0 y 22.
    Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior fórmula busque
    en un array de caracteres la posición que corresponda a la letra. Esta es la tabla de caracteres:
    Posición 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
    Letra    T R W A G M Y F P D X  B  N  J  Z  S  Q  V  H  L  C  K  E
    Por ejemplo, si introducimos el DNI 20267079, el resto de dividirlo por 23 sería 8,
    luego la letra sería la P, que es la que ocupa esa posicion en la matriz de caracteres.
        */


        Scanner teclado = new Scanner(System.in);

        //System.out.println("Ingrese cantidad de numeros para el arreglo");
        //int dim = teclado.nextInt();
        

        System.out.println("Ingrese DNI");
        int numeroDNI = teclado.nextInt();
        
        System.out.println(obtenerLetra(numeroDNI%23));
        
    }

    public static char obtenerLetra(int numeroDNI){
        char letraDNI = 'a';
        switch (numeroDNI) {
            case 0:
            return letraDNI = 'T';

            case 1:
            return letraDNI = 'R';

            case 2:
            return letraDNI = 'W';

            case 3:
            return letraDNI = 'A';

            case 4:
            return letraDNI = 'G';

            case 5:
            return letraDNI = 'M';
                
            case 6:
            return letraDNI = 'Y';
                
            case 7:
            return letraDNI = 'F';
                
            case 8:
            return letraDNI = 'P';
                
            case 9:
            return letraDNI = 'D';
                
            case 10:
            return letraDNI = 'X';
                
            case 11:
            return letraDNI = 'B';
                    
            case 12:
            return letraDNI = 'N';
                 
            case 13:
            return letraDNI = 'J';
                
            case 14:
            return letraDNI = 'Z';
                 
            case 15:
            return letraDNI = 'S';
                
            case 16:
            return letraDNI = 'Q';
                
            case 17:
            return letraDNI = 'V';
                
            case 18:
            return letraDNI = 'H';
                
            case 19:
            return letraDNI = 'L';
                
            case 20:
            return letraDNI = 'C';
                
            case 21:
            return letraDNI = 'K';
                
            case 22:
            return letraDNI = 'E';
                
            default:
                break;
        }
        return letraDNI;
    }
    

}

    
