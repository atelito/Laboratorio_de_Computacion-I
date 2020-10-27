package tp8;

import java.util.*;

public class AgendaNombres {
	static String[] menu = {
			"1- Cargar Datos en la Agenda",
			"2- Buscar Teléfono por Nombre",
			"3- Listar Agenda"};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Long> agenda = new HashMap<String, Long>();
		imprimirArreglo_String(menu);
		System.out.println("/¿Que desea hacer? Ingrese 1, 2 o 3");
		int opcion = cargarNumero_Int_MenorOIgual_MayorOIgual(1, 3);
		System.out.println(agenda.size());
		//if (agenda.size() == 0)
		
		
	}

	
	
	
	
	
	
	
	
	

    public static void imprimirArreglo_String(String [] arreglo) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < arreglo.length; i++) { System.out.print(arreglo[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }
    
    public static int cargarNumero_Int() {
        Scanner teclado = new Scanner(System.in);
        int numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
            while (!errorEntradaDatos) {
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
   
    
    public static int cargarNumero_Int_MenorOIgual_MayorOIgual(int min, int max) {
        int numeroCasteado;
        do {
        numeroCasteado = cargarNumero_Int();
        if (numeroCasteado > max || numeroCasteado < min) System.out.println("Error. Ingrese un valor entero menor que " + max + " y mayor que " + min);
        }
        while (numeroCasteado < min || numeroCasteado > max /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }    
     
}
