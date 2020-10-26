/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;
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
        /*  Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual a 10.
            Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú con estas opciones:
            a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
            b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
            c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
            d) Sumar la diagonal principal
            e) Sumar la diagonal inversa
            f) La media de todos los valores de la matriz
            IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se deberán de ejecutar,
            simplemente mostrar un mensaje que diga que debes rellenar la matriz.
            Mostrar por pantalla el resultado de la ejecución de cada una de las opciones del menú.
        */
        Scanner teclado = new Scanner(System.in);

        String [] menu = new String [6];
        menu[0] = "1. Rellenar la matriz con numeros";
        menu[1] = "2. Suma de una fila a peticion";
        menu[2] = "3. Suma de una columna a peticion";
        menu[3] = "4. Suma diagonal principal";
        menu[4] = "5. Suma diagonal inversa";
        menu[5] = "6. Media de todos los valores de la matriz";

        int opcion, opcion2, opcionSalir;
        opcion2 = 0;
        boolean salir = false;

        int X;
                do {
                    System.out.println("Ingrese numero entero X mayor o igual a 4 y menor o igual a 10");
                    X = teclado.nextInt();
                    }
                while(X<4 || X>10);
            int [][] matriz = new int[X][X];

        imprimirArregloStringEnLinea(menu);
        System.out.println("Ingrese numero de opcion a ejecutar");
        do {opcion = teclado.nextInt();}
        while (opcion>6 || opcion<1);

        while (opcion != 1){
            System.out.println("Error, primero debe rellenar la matriz. Ingrese opcion 1");
            opcion = teclado.nextInt();
        }

        do {
            if (opcion != 1 && opcion2 < 0){
                System.out.println("Ingrese numero de opcion a ejecutar");
                do {opcion = teclado.nextInt();}
                while (opcion>6 || opcion<1);
            }
            if (opcion == 1) matriz = getArregloIntConMultiDimension(matriz.length, matriz[0].length);

            switch (opcion){
                case 2:{
                    int numFila;
                    do {
                        System.out.println("Ingrese numero de fila de la matriz que desee sumar");
                        numFila = teclado.nextInt();
                    }
                    while((numFila-1)<0 || numFila>matriz.length);
                    sumarFilaMatriz(matriz, numFila-1);
                    break;
                }
                case 3:{
                    int numColumna;
                    do {
                        System.out.println("Ingrese numero de columna de la matriz que desee sumar");
                        numColumna = teclado.nextInt();
                    }
                    while((numColumna-1)<0 || numColumna>matriz[0].length);
                    sumarColumnaMatriz(matriz, numColumna-1);
                    break;
                }
                case 4:{
                    sumarDiagonalPrincipal(matriz);
                    break;
                }
                case 5:{
                    sumarDiagonalInvertida(matriz);
                    break;
                }
                case 6:{
                    promedioMatriz(matriz);
                    break;
                }
            }

            System.out.println("Si desea salir presione 0");
            opcionSalir = teclado.nextInt();
            if (opcionSalir == 0){
                salir = true;
                break;
            }
            imprimirArregloStringEnLinea(menu);
            System.out.println("Ingrese numero de opcion a ejecutar");
                do {opcion = teclado.nextInt();}
                while (opcion>6 || opcion<1);
                opcion2 = 1;

            
        }
        while (salir != true);

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

        public static void sumarDiagonalPrincipal (int [][] matriz) {
            int sumaDiagonal = 0;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[0].length; j++){
                    if (i == j) sumaDiagonal = sumaDiagonal + matriz[i][j];
                }
                                
            }
            System.out.println("La suma de los valores de la diagonal es " + sumaDiagonal);
        }

        public static void sumarDiagonalInvertida (int [][] matriz) {
            int sumaDiagonalInvertida = 0;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j++){
                    if(i+j == matriz.length-1) sumaDiagonalInvertida = sumaDiagonalInvertida + matriz[i][j];
                }
                                
            }
            System.out.println("La suma de los valores de la diagonal invertida es " + sumaDiagonalInvertida);
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

        public static int[][] getArregloIntConMultiDimension (int dimFila, int dimColumna) {
            Scanner teclado = new Scanner(System.in);
            int arregloMultiInt [][] = new int [dimFila][dimColumna];
            for (int i = 0; i < dimFila; i++) {
                for (int j = 0; j <dimColumna; j++) {
                    System.out.println("Ingrese numero entero en fila " + i + ", columna " + j);
                    arregloMultiInt[i][j] = teclado.nextInt();
                }
            }
            System.out.println("Fin carga matriz");
            return arregloMultiInt;
        }
        
        public static int[][] getMatrizMultFilasXColumnas (int [][] arreglo1, int [][] arreglo2) {
            int arregloMultiplicacion [][] = new int [arreglo1.length][arreglo1[0].length];
    
            for (int i = 0; i < arregloMultiplicacion.length; i++) {
                for (int j = 0; j < arregloMultiplicacion[0].length; j++) {
                    arregloMultiplicacion[i][j] += arreglo1[i][j] * arreglo2[j][i];    
                }
            }
            return arregloMultiplicacion;
        }


        public static String [][] getMatrizString (int dimFila, int dimColumna) {
            Scanner teclado = new Scanner(System.in);
            String matrizString [][] = new String [dimFila][dimColumna];
            for (int i = 0; i < dimFila; i++) {
                System.out.println("Ingrese nombre de pais en fila " + (i+1));
                matrizString[i][0] = teclado.nextLine();
            }
            for (int i = 0; i <dimFila; i++) {
                for (int j = 1; j < dimColumna; j++) {
                    System.out.println("Ingrese ciudad del pais " + matrizString[i][0]);
                    matrizString[i][j] = teclado.nextLine();
                    }
            }
            return matrizString;
        }

        public static void imprimirMatrizStringEnLinea (String [][] arreglo) {
            System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++){
                    System.out.print(arreglo[i][j] + " ");
                }
                System.out.println("");
    
            }
            System.out.println("");
        }

        public static void imprimirArregloMultiIntEnLinea (int [][] arreglo) {
            System.out.println("Valores de la Matriz de " + arreglo.length + " fila/s y " + arreglo[0].length + " columna/s");
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[i].length; j++){
                    System.out.print(arreglo[i][j] + " ");
                }
                System.out.println("");
    
            }
            System.out.println("");
        }

        public static void imprimirArregloStringEnLinea (String [] arreglo) {
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i]);
            }
        }


        
}  
