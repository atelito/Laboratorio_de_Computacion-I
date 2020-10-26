/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author axelp
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Modifique los algoritmos de ordenamiento anteriores (inserción, burbuja, selección)
        para que además de la lista a ordenar revisan como parámetro un “String orden”, cuyo
        valor será “ASC” o “DESC”, que permita definir si la lista debe ordenarse de forma
        ASCENDENTE o DESCENDENTE.*/
        
        int [] A = new int [8];
        A[0] = 3;
        A[1] = 9;
        A[2] = 12;
        A[3] = 304;
        A[4] = -34;
        A[5] = -2;
        A[6] = 0;
        A[7] = 3;

        int [] B = new int [8];
        B[0] = 3;
        B[1] = 9;
        B[2] = 12;
        B[3] = 304;
        B[4] = -34;
        B[5] = -2;
        B[6] = 0;
        B[7] = 3;

        int [] C = new int [8];
        C[0] = 3;
        C[1] = 9;
        C[2] = 12;
        C[3] = 304;
        C[4] = -34;
        C[5] = -2;
        C[6] = 0;
        C[7] = 3;
        
        mostrarArreglo_Int(A);
        ordenarInsercion(A,"d");
        mostrarArreglo_Int(A);

        mostrarArreglo_Int(B);
        ordenarBurbuja(B,"d");
        mostrarArreglo_Int(B);

        mostrarArreglo_Int(C);
        ordenarPorSeleccion(C, "d");
        mostrarArreglo_Int(C);

        ordenarQuickSort(A, 0, A.length-1);     




/////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

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

        
    public static void mostrarArreglo_String(String [] arreglo) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < arreglo.length; i++) { System.out.print(" Elemento " + (i + 1) + " -----> " + arreglo[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }


    public static void mostrarArreglo_Int(int [] arreglo) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < arreglo.length; i++) { System.out.print(" Elemento " + (i + 1) + " -----> " + arreglo[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }









}
