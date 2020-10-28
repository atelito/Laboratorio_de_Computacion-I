/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7_Collections2;
import java.util.*;

/**
 *
 * @author axelp
 */
public class MenuRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Plato> menuPlatos = new ArrayList<Plato>();

        System.out.println("INGRESO DE PLATOS DEL MENU");
        while(true){
            Plato plato = new Plato();
            System.out.println("Ingrese nombre del plato");
            plato.setNombreCompleto(teclado.nextLine());
            System.out.println("Ingrese su precio");
            plato.setPrecio(cargarNumero_double());
            System.out.println("¿Es una bebida? Escriba \"S\" para cargar bebida");
            plato.setEsBebida(esBebida());
            if (plato.getEsBebida() == false){
                while(true){
                    Ingrediente ingrediente = new Ingrediente();
                    System.out.println("Ingrese nombre ingrediente");
                    ingrediente.setNombre(teclado.nextLine());
                    System.out.println("Ingrese cantidad");
                    ingrediente.setCantidad(cargarNumero_double());
                    System.out.println("Ingrese Unidad de Medida");
                    ingrediente.setUnidad_de_medida(teclado.nextLine());
                    // agrego ingrediente al ArrayList de plato de la clase Plato
                    plato.agregarIngrediente(ingrediente);
                    System.out.println("¿El plato " + plato.getNombreCompleto() + "lleva otro ingrediente?.  Escriba \"NO\" para dejar de agregar ingredientes");
                    String salirCargaIngredientes = teclado.nextLine();
                    if (salirCargaIngredientes.equalsIgnoreCase("NO")) break;
                }
            }
            // agrego plato al ArrayList de menuPlatos de la clase Plato
            menuPlatos.add(plato);
            System.out.println("¿Desea continuar agregando platos al menu?.  Escriba \"NO\" para dejar de agregar platos");
            String salirCargaPlatos = teclado.nextLine();
            if (salirCargaPlatos.equalsIgnoreCase("NO")) break;
        }
        imprimirMenu(menuPlatos);        







    }
    public static void imprimirMenu(ArrayList<Plato> menuPlatos){
        System.out.println("-----------MENÚ----------------");
        for (Plato plato : menuPlatos){
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $ " + plato.getPrecio());
            if (plato.getEsBebida() == false) {
                System.out.println("Ingredientes");
                System.out.println(completarConEspacios("Nombre") + "\t" + completarConEspacios("Cantidad") + "\t" + completarConEspacios("Unidad de Medida"));
                for (Ingrediente ingrediente : plato.getIngredientes()){
                    System.out.println(ingrediente.getNombre() + "\t\t" + ingrediente.getCantidad() + "\t\t" + ingrediente.getUnidad_de_medida());
            }
            }
            System.out.println("----------------------------------");
        }
    }




    public static String completarConEspacios(String cadena){
        int cantidadEspacios = 15 /*PONER ACA LA CANTIDAD DE ESPACIOS QUE NECESITO PARA ALIENEAR*/- cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }

    public static boolean esBebida (){
        boolean esBebida = false;
        Scanner teclado = new Scanner(System.in);
        String S_N = "";
        S_N = teclado.nextLine();
        if (S_N.equalsIgnoreCase("S")){
            esBebida = true;
        }
        return esBebida;
    }


    public static double cargarNumero_double() {
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


}
