/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6_Collections;
import java.util.*;

import Parcial2.MU;


/**
 *
 * @author axelp
 */
public class Matriz {

static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

    public static void main(String[] args) {
    /*
    Codifique la clase celda con los atributos:
        int fila;
        int columna;
        String valor;
     Crea una clase Matriz que contenga una variable global ArrayList<Celda>
    ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
     Codifique un programa que solicite al usuario un valor para la celda y que
        solicite la posición donde se desea almacenar el valor, cree una instancia de la clase Celda, 
        asigne los valores cargados por el usuario y agregue la instancia a la lista matrizCuadrada; 
        repita este proceso hasta que el usuario ingrese como valor la cadena “FIN�?.
     Muestre por pantalla los valores cargados en matrizCuadrada.
     Codifique un método que reciba como parámetro los valores fila y columna y retorne el valor almacenado,
        en caso de que la fila y la columna no exista retorne el mensaje “La fila y columna indicada no ha sido
        asignada�?
    */
    Scanner teclado = new Scanner(System.in);
    String salir;
    while (true){
    	Celda celda = new Celda();
        System.out.println("Ingrese valor para almacenar en celda.");
        celda.setValor(teclado.nextLine());
        System.out.println("Ingrese fila donde almacenar en celda");
        celda.setFila(cargarNumero_Int_MayorOIgual(1));
        System.out.println("Ingrese columna donde almacenar en celda");
        celda.setColumna(cargarNumero_Int_MayorOIgual(1));
        //Celda celda = new Celda(fila, columna, valor);
        matrizCuadrada.add(celda);
        System.out.println("---Celda agregada correctamente---");
        System.out.println("Desea seguir cargando celdas? Escriba NO para salir");
        salir = teclado.nextLine();
        if (salir.equalsIgnoreCase("NO")) break;
        }
    System.out.println("");
    System.out.println("---Imprimiendo valores de celda cargados---");
    // Convierto el ArrayList en una matriz y la imprimo
    //imprimirMatriz_String(cargarMatriz());
    
    //Imprimo directamente los valores del ArrayList
    int columna = 0, fila = 0;
    for (Celda celdita : matrizCuadrada) {
    	System.out.println(celdita.getValor());
    }
    System.out.println("Ingrese fila a buscar");
    fila = cargarNumero_Int_MayorOIgual(1);
    System.out.println("Ingrese columna a buscar");
    columna = cargarNumero_Int_MayorOIgual(1);
    // Busco valor, metodo 1
    //buscarValor(fila, columna);
    
    // Busco valor metodo 2
    buscoValor(fila, columna);
    }

    
    public static int cargarNumero_Int() {
        Scanner teclado = new Scanner(System.in);
        int numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
            while (!errorEntradaDatos) {
                //System.out.println("Ingrese numero entero");
                numString = teclado.nextLine();
                try{
                    numeroCasteado = Integer.parseInt(numString);  
                }
                catch(NumberFormatException VariableDeclaratorId){
                    errorEntradaDatos = false;
                    System.out.println("Error, ingrese un numero entero valido");
                    continue;
                }
                errorEntradaDatos = true;
            }
        numeroCasteado = Integer.parseInt(numString);
        errorEntradaDatos = false;
        return numeroCasteado;
    }

    public static double cargarNumero_Double() {
        Scanner teclado = new Scanner(System.in);
        double numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
            while (errorEntradaDatos != true) {
                numString = teclado.nextLine();
                //si quiero utilizar la funcion de 'esDouble' descomento esta linea y comento las siguientes
                //errorEntradaDatos = esDouble(numString);
                try{
                    numeroCasteado = Double.parseDouble(numString);  
                }
                catch(NumberFormatException VariableDeclaratorId){
                    errorEntradaDatos = false;
                    System.out.println("Error, ingrese un numero decimal doble valido");
                    continue;
                }
                catch(NullPointerException VariableDeclaratorId){
                    errorEntradaDatos = false;
                    System.out.println("Error, ingrese un numero decimal doble valido");
                    continue;
                }
                errorEntradaDatos = true;
            }
        numeroCasteado = Double.parseDouble(numString);
        errorEntradaDatos = false;
        return numeroCasteado;
    }

    public static int cargarNumero_Int_MayorOIgual(int min) {
        int numeroCasteado;
        do {
        numeroCasteado = cargarNumero_Int();
        if (numeroCasteado < min) System.out.println("Error. Ingrese un valor entero mayor que " + min);
        }
        while (numeroCasteado < min /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }
   
    public static int cargarNumero_Int_MenorOIgual(int max) {
        int numeroCasteado;
        do {
        numeroCasteado = cargarNumero_Int();
        if (numeroCasteado < max) System.out.println("Error. Ingrese un valor entero menor que " + max);
        }
        while (numeroCasteado > max /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }

    
    public static void imprimirMatriz_String (String [][] arreglo) {
        System.out.println("|-----------------------|");
        System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++){
                System.out.print(arreglo[i][j] + "\t\t");
            }
            System.out.println("");

        }
        System.out.println("|-----------------------|");
    }

    public static String [][] cargarMatriz (){
    int cantidadFilas = 0;
    int cantidadColumnas = 0;
    for (int i = 0; i<matrizCuadrada.size() ; i++){
        if(cantidadFilas < matrizCuadrada.get(i).getFila()){
            cantidadFilas = matrizCuadrada.get(i).getFila();
        }
        if(cantidadColumnas < matrizCuadrada.get(i).getColumna()){
            cantidadColumnas = matrizCuadrada.get(i).getColumna();
        } 
    }

    String [][] matrizImpresa = new String [(cantidadFilas+1)][(cantidadColumnas+1)];

    for (int i = 0; i < cantidadFilas+1; i++) {
        for (int j = 0;j < cantidadColumnas+1; j++) {
            if(i == 0 && j == 0){
                matrizImpresa[0][0] = "F/C";
            }
            else if(i == 0){
                matrizImpresa[i][j] = Integer.toString(j);
            }
            else if(j == 0){
                matrizImpresa[i][j] = Integer.toString(i);
            } 
            else matrizImpresa[i][j] = "---";            
        }
    }
    
    for (int i = 0; i<matrizCuadrada.size() ; i++){
            //if (matrizCuadrada.get(i).getFila() == i && matrizCuadrada.get(i).getColumna() == j){
        matrizImpresa[matrizCuadrada.get(i).getFila()][matrizCuadrada.get(i).getColumna()] = matrizCuadrada.get(i).getValor();
                //}
    }
    return matrizImpresa;
    }
   
    public static void buscarValor(int fila, int columna){
        boolean encontrado = false;
        for (int i = 0; i<matrizCuadrada.size() ; i++){
            if(matrizCuadrada.get(i).getFila() == fila && matrizCuadrada.get(i).getColumna() == columna){
                System.out.println("Valor encontrado: " + matrizCuadrada.get(i).getValor());
                encontrado = true;
            }
        }
        if(encontrado == false) System.out.println("La fila y columna indicada no ha sido asignada");
    }
    
    public static void buscoValor(int fila, int columna){
        boolean encontrado = false;
        for(Celda celda : matrizCuadrada) {
    		if(celda.getFila() == fila && celda.getColumna() == columna) {
    			System.out.println("Valor encontrado: " + celda.getValor() + " en fila " + celda.getFila() + " y columna " + celda.getColumna());
    			encontrado = true;
    			break;
    		}
    	}
        if(encontrado == false) System.out.println("La fila y columna indicada no ha sido asignada");
    }
    
    
}
