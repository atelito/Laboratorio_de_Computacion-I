/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author axelp
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por ejemplo:
        45-9-8-6-45-23-21-74-96-32-45-25
        Posteriormente aplique el método SPLIT de los String de Java para convertir
        la cadena en un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.
        */


        Scanner teclado = new Scanner(System.in);

        //System.out.println("Ingrese cantidad de numeros para el arreglo");
        //int dim = teclado.nextInt();
        //int dim = 5;

        System.out.println("Ingrese numeros enteros separados por guines medios");
            String cadena = teclado.next();
        
        String[] arreglo = cadena.split("-");

        int[] arregloInt = getArregloStringToInt(arreglo, arreglo.length);

        System.out.println(getSumaArregloInt(arregloInt, arregloInt.length));
        System.out.println(getPromedioArregloInt(arregloInt, arregloInt.length));
        

        
    }


    public static int getSumaArregloInt (int [] arregloInt, int dim) {
        int suma = 0;
        for (int i = 0; i < dim; i++) {
            suma += arregloInt[i];
       }
        return suma;
    }

    public static double getPromedioArregloInt (int [] arregloInt, int dim) {
        double promedio = 0;
        for (int i = 0; i < dim; i++) {
            promedio += arregloInt[i];
       }

        return promedio/arregloInt.length;
    }

    public static int[] getArregloIntConDimension (int dim) {
        Scanner teclado = new Scanner(System.in);
        int arregloInt [] = new int [dim];
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese numero entero en arreglo de dimension "+ dim);
            arregloInt[i] = teclado.nextInt();
        }
        return arregloInt;
    }


    public static int[] getArregloIntAscendente (int [] arregloAsc, int dim) {
        for(int i = 0; i < (arregloAsc.length-1) ; i++){
            for(int j = i+1 ; j<arregloAsc.length ; j++){
                if(arregloAsc[i] > arregloAsc[j]){
                    //Intercambiamos valores
                    int variableauxiliar = arregloAsc[i];
                    arregloAsc[i] = arregloAsc[j];
                    arregloAsc[j] = variableauxiliar;
 
                }
            }
        }
        return arregloAsc;
    }
    
    public static int[] getArregloIntDescendente (int [] arregloDesc, int dim) {
        for(int i = 0; i < (arregloDesc.length-1) ; i++){
            for(int j = i+1 ; j<arregloDesc.length ; j++){
                if(arregloDesc[i] < arregloDesc[j]){
                    //Intercambiamos valores
                    int variableauxiliar = arregloDesc[i];
                    arregloDesc[i] = arregloDesc[j];
                    arregloDesc[j] = variableauxiliar;
 
                }
            }
        }
        return arregloDesc;
    }
    

    public static int[] getArregloStringToInt (String [] arregloString, int dim) {
        int arregloInt [] = new int [dim];
        for (int i = 0; i < dim; i++){
            arregloInt[i] = Integer.parseInt(arregloString[i]);
        }
        return arregloInt;
    }

    public static void imprimirArregloIntEnLinea (int [] arreglo, int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static void imprimirArregloIntConGuion (int [] arreglo, int dim) {
        for (int i = 0; i < dim; i++) {
            if (i == (dim - 1)) {
                System.out.print(arreglo[i]);                     
            }
            else System.out.print(arreglo[i] + "-");
        }
    }
    

}

    
