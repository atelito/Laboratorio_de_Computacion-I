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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una mÃ¡quina expendedora de golosinas
        donde la columna 1 es la golosina, la columna 2 el precio y la columna 3 la cantidad (stock) actual de golosinas
        KitKat              32        10
        Chicles             2        50
        Caramelos de Menta  2        50
        Huevo Kinder        25        10
        Chetoos             30        10
        Twix                26        10
        M&M'S               35        10
        Papas Lays          40        20
        Milkybar            30        10
        Alfajor Tofi        20        15
        Lata Coca           50        20
        Chitos              45        10
        Tendremos un pequeno menÃº con las siguientes opciones:
        a. Pedir golosina: pedirÃ¡ la posiciÃ³n de la golosina que quiera.
            Esta mÃ¡quina tiene golosinas en cada posiciÃ³n, identificados por su fila y columna,
            que serÃ¡ lo que introduzca el usuario al pedir una golosina,
            por ejemplo si el usuario teclea 2 significa que estÃ¡ pidiendo la golosina que estÃ¡ en la fila 2.
            Al seleccionar una golosina debe disminuir la cantidad disponible de la golosina.
            En caso de agotar el stock de la golosina deberÃ¡ informar de la situaciÃ³n al cliente y
            solicitarle que seleccione otra golosina.
        b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual disponible.
        c. Rellenar golosinas: esta es una funciÃ³n exclusiva de un tÃ©cnico por lo que para su ejecuciÃ³n nos pedirÃ¡ una
            contrasena, si el usuario escribe â€œAdminXYZâ€� nos autorizara y pedirÃ¡ la posiciÃ³n de la golosina y
            la cantidad a recargar. La cantidad ingresada se sumara a la cantidad actual existente.
        d. Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecuciÃ³n del programa.
            Es decir la suma de todos los precios de las golosinas seleccionadas desde el inicio del programa.
        */
        Scanner teclado = new Scanner(System.in);

        String [] menu = new String [4];
        menu[0] = "1. Pedir golosina";
        menu[1] = "2. Mostrar golosinas";
        menu[2] = "3. Rellenar golosinas";
        menu[3] = "4. Apagar maquina";

        int opcion, cantidadRecarga;
        int ventas =0;
        String contrasena;
        final String contrasenaMaestra = "AdminXYZ";
        boolean salir = false;

        String[][] matriz = {{"KitKat","32","10"},{"Chicles","2","50"},{"Caramelos de Menta","2","50"},{"Huevo Kinder","25","10"},{"Chetoos","30","10"},{"Twix","26","10"},{"M&M'S","35","10"},{"Papas Lays","40","20"},{"Milkybar","30","10"},{"Alfajor Tofi","20","15"},{"Lata Coca","50","20"},{"Chitos","45","10"}};

        do {
            imprimirArregloStringEnLinea(menu);
            System.out.println("Ingrese numero de opcion a ejecutar");
            do {opcion = teclado.nextInt();}
            while (opcion>4 || opcion<1);

            switch (opcion){
                case 1:{
                    do {
                        System.out.println("Ingrese posicion de golosina");
                        opcion = teclado.nextInt();
                    }
                    while (opcion<0 || opcion>11);
                    int cantidad = Integer.parseInt(matriz[opcion][2]);
                    if (cantidad>0){
                        cantidad = cantidad - 1;
                    }
                    else System.out.println("Sin stock, elija otra golosina");
                    String cantidadString= String.valueOf(cantidad);
                    matriz[opcion][2] = cantidadString;
                    ventas = ventas + Integer.parseInt(matriz[opcion][1]);
                    break;
                }
                case 2:{
                    imprimirMatrizStringEnLinea(matriz);
                    break;
                }
                case 3:{
                    System.out.println("lngrese contrasena");
                    contrasena = teclado.next();
                    if (contrasena.equals(contrasenaMaestra)){
                        do {
                            System.out.println("Ingrese posicion de golosina a recargar");
                            opcion = teclado.nextInt();
                        }
                        while (opcion<0 || opcion>11);
                        do {
                            System.out.println("Ingrese cantidad de golosina a recargar");
                            cantidadRecarga = teclado.nextInt();
                        }
                        while (opcion<0);
                        int cantidad = Integer.parseInt(matriz[opcion][2]);
                        cantidad = cantidad + cantidadRecarga;
                        String cantidadString= String.valueOf(cantidad);
                        matriz[opcion][2] = cantidadString;
                    }
                    else System.out.println("Contrasena incorrecta. Vuelva a iniciar menÃº nuevamente");
                    break;
                }
                case 4:{
                    System.out.println("Saliendo... Las ventas totales fueron $" + ventas);
                    break;
                }
            }
            System.out.println("Si desea salir presione 0");
            int opcionSalir = teclado.nextInt();
            if (opcionSalir == 0){
                salir = true;
                break;
            } 
        
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
            int sumaDiagonal = 0;
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[0].length; j++){
                    if (i == j) sumaDiagonal = sumaDiagonal + matriz[i][j];
                }
                                
            }
            System.out.println("La suma de los valores de la diagonal invertida es " + sumaDiagonal);
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
