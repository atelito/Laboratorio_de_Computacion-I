package tp8_Collection3;

import java.util.Scanner;

public class CostoComputadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String salirCargaComputadoras;
			Computadora computadora = new Computadora();
			System.out.println("Ingrese marca de computadora");
			computadora.setMarca(sc.nextLine());
			System.out.println("Ingrese modelo de computadora");
			computadora.setModelo(sc.nextLine());
			while(true) {
				String salirCargaComponentes;
				ComponenteCPU componente = new ComponenteCPU();
				System.out.println("Ingrese componente de CPU");
				componente.setComponente(sc.nextLine());
				System.out.println("Ingrese marca del componente " + componente.getComponente());
				componente.setMarca(sc.nextLine());
				System.out.println("Ingrese cantidad del componente " + componente.getComponente());
				componente.setCantidad(cargarNumero_Int_MayorOIgual(1));
				System.out.println("Ingrese precio del componente " + componente.getComponente());
				componente.setPrecio(cargarNumero_double_MayorOIgual(1));
				computadora.agregarComponentes(componente);
				System.out.println("¿Desea seguir cargando componentes a la computadora " + computadora.getMarca() + "?, escriba \"NO\" para terminar");
				salirCargaComponentes = sc.nextLine();
				if (salirCargaComponentes.equalsIgnoreCase("NO")) break;
			}
			imprimirCarga(computadora);
			System.out.println("¿Desea cotizar una nueva computadora?, escriba \"NO\" para terminar");
			salirCargaComputadoras = sc.nextLine();
			if (salirCargaComputadoras.equalsIgnoreCase("NO")) break;
		}
	}

	public static void imprimirCarga(Computadora computadora) {
		System.out.println("------------COMPUTADORA------------");
		System.out.println("Marca: " + computadora.getMarca());
		System.out.println("Modelo: " + computadora.getModelo());
		System.out.println("Componentes:");
		System.out.println(completarConEspacios("Componente") + "\t" + completarConEspacios("Marca") + "\t" + completarConEspacios("Cantidad") + "\t" + completarConEspacios("Precio X Unidad") + "\t" + completarConEspacios("SubTotal"));
		for (ComponenteCPU i : computadora.getComponentes()) {
			System.out.println("");
			System.out.println(i.getComponente() + "\t\t\t" + i.getMarca() + "\t\t\t" + i.getCantidad() + "\t\t\t" + i.getPrecio() + "\t\t\t" + i.SubTotal(i.getCantidad(), i.getPrecio()));
		}
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + "Costo Total " + computadora.calculoTotal());		
		precioSugerido(computadora.calculoTotal());
		System.out.println("-----------------------------------");
	}
		
	public static void precioSugerido (double Total) {
		double precioSugerido = Total;
		if (Total < 50000) {
			precioSugerido *= 1.4;
		}
		else if (Total >= 50000) precioSugerido *= 1.3;
		System.out.println("El precio sugerido de venta es " + precioSugerido);
		
	}
	

	 public static String completarConEspacios(String cadena){
	        int cantidadEspacios = 20 /*PONER ACA LA CANTIDAD DE ESPACIOS QUE NECESITO PARA ALIENEAR*/- cadena.length();
	        for(int i=0; i < cantidadEspacios; i++){
	            cadena += " ";
	        }
	        return cadena;
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

    public static int cargarNumero_Int_MayorOIgual(int min) {
        int numeroCasteado;
        do {
        numeroCasteado = cargarNumero_Int();
        if (numeroCasteado <= min) System.out.println("Error. Ingrese un valor entero mayor que " + min);
        }
        while (numeroCasteado <= min /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
    }
    

    public static double cargarNumero_double_MayorOIgual(double min) {
        double numeroCasteado;
        do {
        numeroCasteado = cargarNumero_double();
        if (numeroCasteado <= min) System.out.println("Error. Ingrese un valor entero mayor que " + min);
        }
        while (numeroCasteado <= min /*|| num > 2147483647 || num < -2147483648*/);
        return numeroCasteado;
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
