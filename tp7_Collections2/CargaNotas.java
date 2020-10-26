/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7_Collections2;
import java.util.*;

public class CargaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        while(true){
            Alumno alumno = new Alumno();
            System.out.println("INGRESE DATOS DE ALUMNO");
            System.out.println("Ingrese Nombre");
            alumno.setNombreCompleto(teclado.nextLine());
            System.out.println("INGRESE Legajo");
            alumno.setLegajo(teclado.nextLong());
            while(true){
                Nota nota = new Nota();
                System.out.println("Ingrese nombre de Catedra");
                nota.setCatedra(teclado.next());
                System.out.println("Ingrese nota");
                nota.setNotaExamen(cargarNumero_double());
                alumno.agregarNota(nota);
                System.out.println("¿Desea salir de la carga de notas del alumno " + alumno.getNombreCompleto() + "? Escriba SI para salir");
                String salirCargaNota = teclado.next();
                if (salirCargaNota.equalsIgnoreCase("SI")) break;
            }
            alumnos.add(alumno);
            System.out.println("¿Desea salir de la carga de alumnos? Escriba SI para salir");
            String salirCargaAlumno = teclado.next();
            if (salirCargaAlumno.equalsIgnoreCase("SI")) break;
        }
        System.out.println("---Datos Alumno---");
        for (Alumno alumno : alumnos){
            System.out.println("Alumno " + alumno.getNombreCompleto() + " con legajo " + alumno.getLegajo());
            for (Nota nota : alumno.getNotas()){
                System.out.println("Nota " + nota.getNotaExamen() + " en " + nota.getCatedra());
            }
            System.out.println("El promedio del alumno es: " + alumno.promedioNotas());
        }
        
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
