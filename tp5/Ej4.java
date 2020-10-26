/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;
import java.util.*;

/**
 *
 * @author axelp
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos
        enteros. Finalizada la carga de los 20 elementos el programa debe solicitar como se
        desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento
        aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el
        algoritmos fundamental de ordenamiento que corresponda. Muestre por pantalla el
        array original desordenado y su resultante ordenado según las opciones elegidas.*/
              
        Scanner teclado = new Scanner(System.in);
        String opcion1;
        String opcion2;
        boolean salir = false;

        int [] arreglo = getArreglo_Int(20);
        while(!salir){
            System.out.println("¿Desea ordenar el arreglo en forma DESCENDENTE o ASCENDENTE? Escriba \"d\" por DESCENDENTE o \"a\" por ASCENDENTE");
            opcion1 = teclado.nextLine();
            if (opcion1.equalsIgnoreCase("d")){
                while(!salir){
                    System.out.println("¿Que método de ordenamiento desea? Escriba \"i\" por INSERCIÓN, \"b\" por BURBUJA o \"s\" por SELECCIÓN");
                    opcion2 = teclado.nextLine();
                    if (opcion2.equalsIgnoreCase("i")){
                        System.out.println("Arreglo original");
                        imprimirArreglo_Int(arreglo);
                        ordenarInsercion(arreglo, opcion1);
                        System.out.println("Arreglo ordenado");
                        imprimirArreglo_Int(arreglo);
                        salir = true;
                    }
                    else if(opcion1.equalsIgnoreCase("b")){
                        System.out.println("Arreglo original");
                        imprimirArreglo_Int(arreglo);
                        ordenarBurbuja(arreglo, opcion1);
                        System.out.println("Arreglo ordenado");
                        imprimirArreglo_Int(arreglo);
                        salir = true;
                    }
                    else if(opcion1.equalsIgnoreCase("s")){
                        System.out.println("Arreglo original");
                        imprimirArreglo_Int(arreglo);
                        ordenarPorSeleccion(arreglo, opcion1);
                        System.out.println("Arreglo ordenado");
                        imprimirArreglo_Int(arreglo);
                        salir = true;
                    }
                    else{
                        System.out.println("Opción Incorrecta. Intente nuevamente.");
                        System.out.println("----------------------");
                    }
                }
            }
            else if (opcion1.equalsIgnoreCase("a")){
                while(!salir){
                    System.out.println("¿Que método de ordenamiento desea? Escriba \"i\" por INSERCIÓN, \"b\" por BURBUJA o \"s\" por SELECCIÓN");
                    opcion2 = teclado.nextLine();
                    if (opcion2.equalsIgnoreCase("i")){
                        System.out.println("Arreglo original");
                        imprimirArreglo_Int(arreglo);
                        ordenarInsercion(arreglo, opcion1);
                        System.out.println("Arreglo ordenado");
                        imprimirArreglo_Int(arreglo);
                        salir = true;
                    }
                    else if(opcion1.equalsIgnoreCase("b")){
                        System.out.println("Arreglo original");
                        imprimirArreglo_Int(arreglo);
                        ordenarBurbuja(arreglo, opcion1);
                        System.out.println("Arreglo ordenado");
                        imprimirArreglo_Int(arreglo);
                        salir = true;
                    }
                    else if(opcion1.equalsIgnoreCase("s")){
                        System.out.println("Arreglo original");
                        imprimirArreglo_Int(arreglo);
                        ordenarPorSeleccion(arreglo, opcion1);
                        System.out.println("Arreglo ordenado");
                        imprimirArreglo_Int(arreglo);
                        salir = true;
                    }
                    else{
                        System.out.println("Opción Incorrecta. Intente nuevamente.");
                        System.out.println("----------------------");
                    }
                }
            }
            else{
                System.out.println("Opción Incorrecta. Intente nuevamente.");
                System.out.println("----------------------");
            }
        }


    
        /////////////////////////////////FIN PROGRAMA/////////////////////////////////////////
        /////////////////////////////////FIN PROGRAMA/////////////////////////////////////////
    }
    /////////////////////////////////INICIO METODOS///////////////////////////////////////
    /////////////////////////////////INICIO METODOS///////////////////////////////////////

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


private static String completarConEspacios(String cadena){
    int cantidadEspacios = 6 - cadena.length();
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
            arregloInt[i] = teclado.nextInt();
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
            arregloInt[i] = teclado.next();
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
            matrizInt[i][j] = teclado.nextInt();
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


        ////////////////////FIN METODOS///////////////////////////////////////////////////////
        ////////////////////FIN METODOS///////////////////////////////////////////////////////
}
