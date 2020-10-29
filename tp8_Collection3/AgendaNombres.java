package tp8_Collection3;

import java.util.*;

public class AgendaNombres {
	static String[] menu = { "1- Cargar Datos en la Agenda", "2- Buscar Telefono por Nombre", "3- Listar Agenda" };

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Long> agenda = new HashMap<String, Long>();
		while (true) {
			String nombrePersona;
			Persona persona = new Persona();
			imprimirArreglo_String(menu);
			System.out.println("�Que desea hacer? Ingrese 1, 2 o 3");
			while (true) {
				String salirCargaPersonas;
				// Carga opcion
				do {
					opcion = cargarNumero_Int_MenorOIgual_MayorOIgual(1, 3);
					if (agenda.size() == 0 && (opcion == 2 || opcion == 3)) {
						System.out.println("Primero debe cargar al menos una persona. Ingrese 1");
					}
				} while (agenda.size() == 0 && (opcion == 2 || opcion == 3));
				// Busca Telefono
				if (opcion == 2) {
					System.out.println("Ingrese nombre de la persona para conocer su telefono");
					nombrePersona = sc.nextLine();
					if (!agenda.containsKey(nombrePersona)) {
						System.out.println("La persona buscada no se encuentra en la agenda");
						break;
					}
					System.out
							.println("El telefono de la persona " + nombrePersona + " es " + agenda.get(nombrePersona));
					break;
				}
				// Lista Agenda
				else if (opcion == 3) {
					System.out.println("----Agenda 2020----");
					for (String i : agenda.keySet()) {
						System.out.println("Nombre: " + i + " value: " + agenda.get(i));
					}
					break;
				} else if (opcion == 1) {
					while (true) {
						// Creo nueva persona para agendar
						System.out.println("Ingrese nombre");
						do {
							nombrePersona = sc.nextLine();
							if (agenda.containsKey(nombrePersona)) {
								System.out.println("Error, la persona ya esta cargada. Ingrese nuevamente un nombre");
							}
						} while (agenda.containsKey(nombrePersona));
						persona.setNombre(nombrePersona);
						System.out.println(
								"Ingrese numero de celular. Codigo de �rea + numero -sin el 15-. Total 9 digitos");
						persona.setNumero(Long.valueOf(getNumero_Int_ConDimension(9)));
						agenda.put(persona.getNombre(), persona.getNumero());
						System.out.println("�Desea seguir cargando personas a la agenda? Escriba \"NO\" para terminar");
						salirCargaPersonas = sc.nextLine();
						if (salirCargaPersonas.equalsIgnoreCase("NO"))
							break;
					}
					if (salirCargaPersonas.equalsIgnoreCase("NO"))
						break;
				}
			}
		}
	}

	// de int a String
	public static String int_to_String(int num) {
		String numCasteado = String.valueOf(num);
		return numCasteado;
	}

	// de String a int
	public static int String_to_int(String numString) {
		// int numCasteado = Integer.parseInt(numString) pdria ser pero si meto en el
		// String un decimal se cuelga
		int numCasteado = (int) Double.parseDouble(numString);
		return numCasteado;
	}

	public static int getNumero_Int_ConDimension(int dimension) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		String numero = "";
		while (!salir) {
			numero = teclado.nextLine();
			if (numero.length() == dimension) {
				return String_to_int(numero);
			} else {
				System.out.println("Numero no valido, ingrese numero de " + dimension + " cifras");
			}
		}
		return String_to_int(numero);
	}

	public static void imprimirArreglo_String(String[] arreglo) {
		System.out.println("|-----------------------|");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + "\n");
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
			try {
				numeroCasteado = Integer.parseInt(numString);
			} catch (NumberFormatException VariableDeclaratorId) {
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
			if (numeroCasteado > max || numeroCasteado < min)
				System.out.println("Error. Ingrese un valor entero menor que " + max + " y mayor que " + min);
		} while (numeroCasteado < min || numeroCasteado > max /* || num > 2147483647 || num < -2147483648 */);
		return numeroCasteado;
	}

}
