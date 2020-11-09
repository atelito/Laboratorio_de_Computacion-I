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
public class Ej4 {
        private static final Integer ONE = new Integer(1);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /*
    Codifique una aplicación que permita almacenar palabras en un
    ArrayList<String> hasta que se ingrese la palabra “salir�?, al finalizar
    muestre por pantalla:
        a) Las palabras ingresadas
        b) Indicar cuál de las palabras ingresadas posee más caracteres
        c) Indicar si se ingresaron o no palabras iguales o repetidas
        d) Mostrar las palabras repetidas ingresadas y cuantas veces se repitió esa
            palabra
    */
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> valores = new ArrayList<>();
        System.out.println("Ingrese palabras aleatorias... Esciba \"salir\" para terminar");
        while (true){
            valores.add(teclado.nextLine());
            if (valores.contains("salir")){
                valores.remove("salir");
                break;
            }
        }
        /* double mayor = valores.get(0);
        double menor = valores.get(0);
        double promedio = 0; */
        
        System.out.println("Las palabras ingresadas fueron:");
        // metodo 1 --> Para cada variable palabra de tipo String en valores
        for (String palabra : valores) {
            System.out.println(palabra);
        }
        // metodo 2 --> tradicional
        System.out.println("Las palabras ingresadas fueron:");
        for (int i = 0; i < valores.size(); i++){
            System.out.println(valores.get(i));
        }
        // metodo 3 --> Por cada elemento de valores se usa el iterable que hace uso de la funcion pasada por parametro el String palabra
        System.out.println("Las palabras ingresadas fueron:");
        valores.forEach((palabra) -> {
            System.out.println(palabra);
        });


        String palabraMasLarga = "";
        for (int i = 0; i < valores.size(); i++){
            String palabrasRepetidas = new String(valores.get(i)).intern();
            if (palabraMasLarga.length() < valores.get(i).length()){
            palabraMasLarga = valores.get(i);
            }
        }
        
        System.out.println("La primera palabra introducida que posee mas caracteres es: " + palabraMasLarga);
        // List listaString = Arrays.asList(valores.toArray()); PARA DE UN ARRAY HACER USO DE COLECIONES DE ARREGLOS
        HashSet<String> listaPalabras = new HashSet<>(valores);
        int repetida = 0;
        //bucle for each para hacerlo de manera mas dinamica
        //Recorre todos los objetos de tipo "String" en la coleccion "listaPalabras"
        for(String palabraRepetida: listaPalabras){
            // Si hay una palabra repetida que la variable repetida sume 1. Cuando al menos exista una repetida se detona el if final
            if (Collections.frequency(valores,palabraRepetida) != 1){
                repetida = 1;
                System.out.println("La palabra " + palabraRepetida + " se repite " + (Collections.frequency(valores,palabraRepetida)-1));
            }
        }
        if (repetida == 0) System.out.println("No hay ninguna palabra repetida");

    }
}

//https://es.stackoverflow.com/questions/269958/c%C3%B3mo-contar-elementos-repetidos-en-un-array

