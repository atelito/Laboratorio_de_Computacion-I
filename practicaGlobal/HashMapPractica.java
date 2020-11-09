package practicaGlobal;

import java.util.*;

public class HashMapPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TreeMap<Integer, String> m = new TreeMap<>();

	    m.put(924, "Amalia Núñez");
	    m.put(921, "Cindy Nero");
	    m.put(700, "César Vázquez");
	    m.put(219, "Víctor Tilla");
	    m.put(537, "Alan Brito");
	    m.put(605, "Esteban Quito ");

	    System.out.println("Todas las entradas del diccionario extraídas con entrySet:");
	    System.out.println(m.entrySet());

	    System.out.println("\nEntradas del diccionario extraídas una a una:");
	    for (Map.Entry pareja: m.entrySet()) {
	      System.out.println(pareja);
	    }

	    System.out.println("\nClaves del diccionario extraídas con keySet:");
	    System.out.println(m.keySet());

	    System.out.println("\nClaves del diccionario extraídas con keySet de una a una:");
	    for (Integer pareja: m.keySet()) {
	      System.out.println(pareja);
	    }

	    System.out.println("\nValores del diccionario extraídos con values:");
	    System.out.println(m.values()); 
	    

	    System.out.println("\nValores del diccionario extraídos con values de uno en uno:");
	    for (String pareja: m.values()) {
	    	System.out.println(pareja); 
	    }
	    
	    System.out.println("\nValores del hashCode de uno en uno:");
    	System.out.println(m.hashCode()); 

	    System.out.println("\nValores del hashCode de uno en uno:");
    	System.out.println(m.isEmpty()); 


	}

}
