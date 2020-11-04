package Parcial2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author axelp
 */
public class MU {

    ///////////////////////////////// INICIO VARIABLES GLOBALES ////////////////////////////
    ///////////////////////////////// INICIO VARIABLES GLOBALES ////////////////////////////
   

    //ORDENAMIENTO////////////////////////////////////////////////////////////////////////////

    public static void ordenarInsercion(int[] A, String orden) {
        for (int i = 1; i < (A).length; i++){
            int valor = A[i];
            int j = i-1;
            if (orden.equalsIgnoreCase("a")){
                while (j >= 0 && A[j] > valor){ //de Menor a Mayor
                        A[j+1] = A[j];
                        j--;
                    }
            }
            else if (orden.equalsIgnoreCase("d")){
                while (j >= 0 && A[j] < valor){ //de Mayor a Menor
                    A[j+1] = A[j];
                    j--;
                }
            }
            else {
                //System.out.println("Sin orden definido, se ordenará de menor a mayor");
                while (j >= 0 && A[j] > valor){
                    A[j+1] = A[j];
                    j--;
                }
            }
            A[j+1] = valor;        
        }
    }

    public static void ordenarBurbuja(int[] A, String orden) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (orden.equalsIgnoreCase("a")){ //de Menor a Mayor
                    if (A[j + 1] < A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
                else if (orden.equalsIgnoreCase("d")){ //de Mayor a Menor
                    if (A[j + 1] > A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
        }
    }

    public static void ordenarPorSeleccion(int [] A, String orden) {
        int i, j, menor, mayor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            if (orden.equalsIgnoreCase("a")){ //de Menor a Mayor
                menor = A[i];              
                pos = i;
                for (j = i + 1; j < A.length; j++){
                    if (A[j] < menor) {
                        menor = A[j];
                        pos = j;
                    }
                }
                if (pos != i){                   
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
                }
            }    
            else if (orden.equalsIgnoreCase("d")){ //de Mayor a Menor
                mayor = A[i];         
                pos = i;
                for (j = i + 1; j < A.length; j++){
                    if (A[j] > mayor) {
                        mayor = A[j];
                        pos = j;
                    }
                }
                if (pos != i){                        
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
                }
            }
        }
    }

    public static void ordenarQuickSort(int [] A, int izq, int der) {
        //En la primera llamada recibirá los valores izq = 0, der = A.lenght - 1


        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
       
        while(i < j){                          // mientras no se crucen las búsquedas                                   
           while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
           while(A[j] > pivote) j--;           // busca elemento menor que pivote
           if (i < j) {                        // si no se han cruzado                      
               aux= A[i];                      // los intercambia
               A[i]=A[j];
               A[j]=aux;
           }
         }
         
         A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
         A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
         
         if(izq < j-1)
         ordenarQuickSort(A,izq,j-1);          // ordenamos subarray izquierdo
         if(j+1 < der)
         ordenarQuickSort(A,j+1,der);          // ordenamos subarray derecho
         
      }
    
    //BUSQUEDA////////////////////////////////////////////////////////////////////////////

    public static void busquedaSecuencialEntero(int[] A, int num) {
        boolean seEncontro = false;
        // recorremos la lista, revisando cada elemento de la misma, para ver
        // si es el alumno a.
        for (int i = 1; i < A.length - 1; i++){
        // comparamos el alumno de la posición actual con el alumno buscado: a
            if (A[i] == num){
                // encontramos el alumno buscado
                seEncontro = true;
            }
        // si nunca se cumple L[i] == a, entonces la variable que indica si se
        // encontró o no el alumno: seEncontró, quedará valiendo falso.
        }
        if (seEncontro = false){
            System.out.println("El número " + num + " NO está en el arreglo");
        }
        else System.out.println("El número " + num + " SI está en el arreglo");

    }

    //IMPRIMIR////////////////////////////////////////////////////////////////////////////

    public static void imprimirArreglo_String(String [] arreglo) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < arreglo.length; i++) { System.out.print(" Elemento " + (i + 1) + "\t" + arreglo[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }
 
    public static void imprimirArreglo_Int(int [] arreglo) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < arreglo.length; i++) { System.out.print(" Elemento " + (i + 1)  + "\t" + arreglo[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }

    public static void imprimirMatriz_String (String [][] arreglo) {
        System.out.println("|-----------------------|");
        System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++){
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println("");

        }
        System.out.println("|-----------------------|");
    }

    public static void imprimirMatriz_Int (int [][] arreglo) {
        System.out.println("|-----------------------|");
        System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++){
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println("");

        }
        System.out.println("|-----------------------|");
    }

    public static String completarConEspacios(String cadena){
        int cantidadEspacios = 6 /*PONER ACA LA CANTIDAD DE ESPACIOS QUE NECESITO PARA ALIENEAR*/- cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }

    //OPERACIONES ARREGLOS Y MATRICES////////////////////////////////////////////////////////////////////////////

    public static int [] getArreglo_Int (int dim) {
        Scanner teclado = new Scanner(System.in);
        int arregloInt [] = new int [dim];
        System.out.println("|-----------------------|");
        for (int i = 0; i < dim; i++) {
                System.out.println("Ingrese numero entero en posicion " + i);
                arregloInt[i] = getNumero_Int();
        }
        System.out.println("Fin carga arreglo");
        System.out.println("|-----------------------|");
        return arregloInt;
    }

    public static String [] getArreglo_String (int dim) {
        Scanner teclado = new Scanner(System.in);
        String arregloInt [] = new String [dim];
        System.out.println("|-----------------------|");
        for (int i = 0; i < dim; i++) {
                System.out.println("Ingrese cadena en posicion " + i);
                arregloInt[i] = teclado.nextLine();
        }
        System.out.println("Fin carga arreglo");
        System.out.println("|-----------------------|");
        return arregloInt;
    }

    public static int[][] getMatriz_Int (int dimFila, int dimColumna) {
        Scanner teclado = new Scanner(System.in);
        int matrizInt [][] = new int [dimFila][dimColumna];
        System.out.println("|-----------------------|");
        for (int i = 0; i < dimFila; i++) {
            for (int j = 0; j <dimColumna; j++) {
                System.out.println("Ingrese numero entero en fila " + i + ", columna " + j);
                matrizInt[i][j] = getNumero_Int();
            }
        }
        System.out.println("Fin carga matriz");
        System.out.println("|-----------------------|");
        return matrizInt;
    }

    public static String[][] getMatriz_String (int dimFila, int dimColumna) {
        Scanner teclado = new Scanner(System.in);
        String matrizString [][] = new String [dimFila][dimColumna];
        for (int i = 0; i < dimFila; i++) {
            for (int j = 0; j <dimColumna; j++) {
                System.out.println("Ingrese numero entero en fila " + i + ", columna " + j);
                matrizString[i][j] = teclado.nextLine();
            }
        }
        System.out.println("Fin carga matriz");
        System.out.println("|-----------------------|");
        return matrizString;
    }
    
    public static void sumarFilaMatriz (int [][] matriz, int numFila) {
        int sumaFila = 0;
        for (int j = 0; j < matriz[0].length; j++){
                sumaFila = sumaFila + matriz[numFila][j];
        }
        System.out.println("La suma de los valores de la fila " + (numFila+1) + " es: " + sumaFila);
    }

    public static void sumarColumnaMatriz (int [][] matriz, int numColumna) {
        int sumaColumna = 0;
        for (int i = 0; i < matriz.length; i++){
            sumaColumna = sumaColumna + matriz[i][numColumna];                
        }
        System.out.println("La suma de los valores de la columna " + (numColumna+1) + " es: " + sumaColumna);
    }


    public static int[][] multiplicarMatriz_Int (int [][] arreglo1, int [][] arreglo2) {
        int matrizMultiplicadaInt [][] = new int [arreglo1.length][arreglo2[0].length];        
        if (arreglo1[0].length != arreglo2.length){
            System.out.println("No se pueden multiplicar las matrices");
        }
        else {

        }
        // i numero de filas de la matriz resultante
        // j numero de columnas de la matriz 2
        // k numero de filas de la matriz 2
        for (int i = 0; i < matrizMultiplicadaInt.length; i++) {
            for (int j = 0; j < arreglo2[0].length; j++) {
                for (int k = 0; k < arreglo2.length; k++){
                    matrizMultiplicadaInt[i][j] += arreglo1[i][k] * arreglo2[k][j];
                }
            }
        }
        return matrizMultiplicadaInt;
    }

    public static void promedioMatriz (int [][] matriz) {
        double promedio;
        int contador = 0;
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                sumaDiagonal = sumaDiagonal + matriz[i][j];
                contador = contador + 1;
            }
        }
        promedio = sumaDiagonal / contador;
        System.out.println("El promedio de los valores de la matriz es: " + sumaDiagonal + " " + contador + " " + promedio);
    }

    //VALIDACIONES////////////////////////////////////////////////////////////////////////////

    
    public static int getNumero_Int_ConDimension(int dimension){
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String numero = "";
        while(!salir){
            numero = teclado.nextLine();
            if (numero.length() == dimension){
                return String_to_int(numero);
            }
            else{
                System.out.println("Numero no valido, ingrese numero de " + dimension + " cifras");
            }
        }
        return String_to_int(numero);
    }

    public static int getNumero_Int() {
        Scanner teclado = new Scanner(System.in);
        int numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
            while (!errorEntradaDatos) {
                numString = teclado.nextLine();
                try{
                    numeroCasteado = Integer.parseInt(numString);  
                }
                catch(Exception e){
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
    
    public static float getNumero_Float() {
        Scanner teclado = new Scanner(System.in);
        float numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
            while (!errorEntradaDatos) {
                numString = teclado.nextLine();
                try{
                    numeroCasteado = Float.parseFloat(numString);  
                }
                catch(Exception e){
                    errorEntradaDatos = false;
                    System.out.println("Error, ingrese un numero decimal simple valido");
                    continue;
                }
                errorEntradaDatos = true;
            }
        numeroCasteado = Float.parseFloat(numString);
        errorEntradaDatos = false;
        return numeroCasteado;
    }

    public static double getNumero_double() {
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
                catch(Exception e){
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

    public static int getNumero_Int_MayorOIgual(int min) {
        int numeroCasteado;
        do {
        numeroCasteado = getNumero_Int();
        if (numeroCasteado <= min) System.out.println("Error. Ingrese un valor entero mayor que " + min);
        }
        while (numeroCasteado <= min /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }
    
    public static int getNumero_Int_MenorOIgual(int max) {
        int numeroCasteado;
        do {
        numeroCasteado = getNumero_Int();
        if (numeroCasteado >= max) System.out.println("Error. Ingrese un valor entero menor que " + max);
        }
        while (numeroCasteado >= max /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }
   
    public static int getNumero_Int_MenorOIgual_MayorOIgual(int min, int max) {
        int numeroCasteado;
        do {
        numeroCasteado = getNumero_Int();
        if (numeroCasteado > max || numeroCasteado < min) System.out.println("Error. Ingrese un valor entero menor que " + max + " y mayor que " + min);
        }
        while (numeroCasteado < min || numeroCasteado > max /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }    
        
    public static boolean esInt(String numero){
        try{
            int numeroCasteado = Integer.parseInt(numero);  
        }
        catch(Exception e){
        return false;
        }
        return true;
        }
    
    public static boolean esDouble(String numero){
        try{
            double numeroCasteado = Double.parseDouble(numero);  
        }
        catch(Exception e){
            System.out.println("Error, ingrese un numero decimal doble valido");
            return false;
        }
        return true;
        }

    public static boolean esFloat(String numero){
        try{
            float numeroCasteado = Float.parseFloat(numero);  
        }
        catch(Exception e){
            return false;
        }
        return true;
        }
        
    public static int leerAnio(){
        int anio = getNumero_Int();
        if(anio > (new Date().getYear() + 1900)){
            System.out.println("El año no puede superar al año actual " + (new Date().getYear() + 1900));
            leerAnio();
        }
        return anio;
    }
    
    public static int leerMes(int anio){
        int mes = getNumero_Int();
        if(mes < 1 || mes > 12){
            System.out.println("El mes no es valido. Ingrese nuevamente el mes.");
            leerMes(anio);
        }
        if(anio == (new Date().getYear() + 1900) && mes > (new Date().getMonth() + 1)){
            System.out.println("El mes no puede superar el mes actual. Ingrese nuevamente el mes.");
            leerMes(anio);
        }
        return mes;
    }
    
    //CASTEO////////////////////////////////////////////////////////////////////////////

    //////// int ////////
    // de int a Integer
    public static Integer int_to_Integer(int num){
        Integer numCasteado = Integer.valueOf(num);
        return numCasteado;
    }

    // de int a String
    public static String int_to_String(int num){
        String numCasteado = String.valueOf(num);
        return numCasteado;
    }

    // de int a double
    public static double int_to_double(int num){
        double numCasteado = (double)(num);
        return numCasteado;
    } ///falta

    // de int a Double
    public static Double int_to_Double(int num){
        double numCasteado = Double.valueOf((double)(num));
        return numCasteado;
    }

    //////// double ////////
    // de double a int
    public static int double_to_int(double num){
        int numCasteado = (int)num;
        return numCasteado;
    }
    
    // de double a Integer
    public static Integer double_to_Integer(double num){
        Integer numCasteado =Integer.valueOf(String.valueOf((int)num));
        return numCasteado;
    }

    // de double a Double
    public static Double double_to_Double(double num){
        Double numCasteado = Double.valueOf(num);
        return numCasteado;
    }

    // de double a String
    public static String double_to_String(double num){
        String numCasteado = String.valueOf(num);
        return numCasteado;
    }


    //////// String ////////
    // de String a int
    public static int String_to_int(String numString){
      //int numCasteado = Integer.parseInt(numString) pdria ser pero si meto en el String un decimal se cuelga
        int numCasteado = (int)Double.parseDouble(numString);
        return numCasteado;
    }

    // de String a double
    public static double String_to_double(String numString){
        double numCasteado = Double.parseDouble(numString);
        return numCasteado;
    }

    // de String a Double
    public static Double String_to_Double(String numString){
        Double numCasteado = Double.valueOf(numString);
        return numCasteado;
    }
    
    // de String a Integer
    public static Integer String_to_Integer(String numString){
        Integer numCasteado = Integer.valueOf((int)Double.parseDouble(numString));
        return numCasteado;
    }
    //////// Double ////////
    // de Double a int
    public static int Double_to_int(Double num){
        Double obj = new Double(num);
        int numCasteado = obj.intValue();
        return numCasteado;
    }
    
    // de Double a double
    public static double Double_to_double(Double num){
        Double obj = new Double(num);
        double numCasteado = obj.doubleValue();
        return numCasteado;
    }  
    
    // de Double a Integer
    public static Integer Double_to_Integer(Double num){
        Double obj = new Double(num);
        Integer numCasteado = Integer.valueOf(obj.intValue());
        return numCasteado;
    }   
    
    // de Double a String
    public static String Double_to_String(Double num){
        String numCasteado = String.valueOf(Double.valueOf(num));
        return numCasteado;
    }   
    
    //////// Integer ////////
    // de Integer a int
    public static int Integer_to_int(Integer num){
        Integer obj = new Integer(num);
        int numCasteado = obj.intValue();
        return numCasteado;
    }     
  
    // de Integer a double
    public static double Integer_to_double(Integer num){
        Integer obj = new Integer(num);
        double numCasteado = obj.doubleValue();
        return numCasteado;
    }     

    // de Integer a Double
    public static Double Integer_to_Double(Integer num){
        Integer obj = new Integer(num);
        Double numCasteado = Double.valueOf(obj.doubleValue());
        return numCasteado;
    }

    // de Integer a String
    public static String Integer_to_String(Integer num){
        Integer obj = new Integer(num);
        String numCasteado = String.valueOf(obj.intValue());
        return numCasteado;
    }

    ///////////////////////////////// FIN VARIABLES GLOBALES ///////////////////////////////
    ///////////////////////////////// FIN VARIABLES GLOBALES ///////////////////////////////
    
    
    
    public static void main(String[] args) {
    	///////////////////////////////// INICIO PROGRAMA //////////////////////////////////////
    	///////////////////////////////// INICIO PROGRAMA //////////////////////////////////////

    	
    	
        ///////////////////////////////// FIN PROGRAMA /////////////////////////////////////////
        ///////////////////////////////// FIN PROGRAMA /////////////////////////////////////////
    }
    
        ///////////////////////////////// INICIO METODOS ///////////////////////////////////////
        ///////////////////////////////// INICIO METODOS ///////////////////////////////////////

    
    	///////////////////////////////// FIN METODOS //////////////////////////////////////////
    	///////////////////////////////// FIN METODOS //////////////////////////////////////////
    
}
