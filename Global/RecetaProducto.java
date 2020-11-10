package Global;

import java.util.*;

public class RecetaProducto {

	
public static String [][] listaInsumos = {
			{"1000", "Harina", "Kg", "50"} ,
			{"1001", "Huevos" , "Un", "3"},
			{"1002", "Tomate en Salsa", "Lt", "45"},
			{"1003", "Queso Muzzarella", "Kg", "550"},
			{"1004", "Queso Provolone", "Kg", "620"},
			{"1005", "Queso Roquefort", "Kg", "650"},
			{"1006", "Jamon Cocido", "Kg", "400"},
			{"1007", "Salame", "Kg", "450"},
			{"1008", "Lata Pimiento Morron", "Un", "130"},
			{"1009", "Aceite", "Lt", "60"},
			{"1010", "Carne Molida", "Kg", "180"},
			{"1011", "Cebollas", "Kg", "60"},
			{"1012", "Sal", "Kg", "75"}};

	/*
	Los valores de cada fila del array se corresponden a:
		 [0] El código del Insumo a declarar.
		 [1] La denominación del Insumo a declarar.
		 [2] La unidad de medida del Insumo siendo Kg (Kilogramos), Lt (Litros), Un (Unidad).
		 [3] El precio de costo de cada insumo por la unidad de medida asignada, ejemplo la harina cuesta 50 pesos por Kilogramo.
	*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<ProductoManufacturado> productos = new ArrayList<ProductoManufacturado>();

		while(true) {
			ProductoManufacturado productoMan = new ProductoManufacturado();
			System.out.println("Ingrese codigo del producto");
			productoMan.setCodigo(MU.getNumero_Int());
			System.out.println("Ingrese denominacion del producto");
			productoMan.setDenominacion(teclado.nextLine());
			System.out.println("Ingrese tiempo de fabricacion del producto");
			productoMan.setTiempoFabricacion(MU.getNumero_Int());
			System.out.println("Ingrese margen de ganancia del producto");
			productoMan.setMargenGanancia(MU.getNumero_double());
			System.out.println("Ingrese cantidad de insumos a cargar en el producto, entre 2 y 13");
			int cantidadInsumos = MU.getNumero_Int_MenorOIgual_MayorOIgual(2, 13);
			String insumo [][] = new String [cantidadInsumos][4];
			boolean codigoEncontrado = false;
			int contador = 0;
			while(contador < cantidadInsumos) {
				for (int i = 0; i< insumo.length; i++) {
					System.out.println("Ingrese codigo del insumo a cargar");
					String codigo = teclado.nextLine();
					for (int j = 0; j< listaInsumos.length; j++) {
						if (listaInsumos[j][0].equals(codigo)) {
							insumo[i][0] = listaInsumos[j][0];
							insumo[i][1] = listaInsumos[j][1];
							System.out.println("Ingrese cantidad necesaria del insumo");
							insumo[i][2] = (MU.double_to_String(MU.getNumero_double()) + " " /* + listaInsumos[j][2]*/);
							// calculo costo
							insumo[i][3] = MU.double_to_String(MU.String_to_double(insumo[i][2]) * MU.String_to_double(listaInsumos[j][3]));
							codigoEncontrado = true;
							contador += 1;
						}
					}
					if (codigoEncontrado == false) System.out.println("Insumo no encontrado, vuelva a cargar el codigo");		
				}
			}
			productoMan.setInsumos(insumo);
			productos.add(productoMan);
			System.out.println("Desea seguir cargando productos? Escriba \"NO\" para salir");
			String salir = teclado.nextLine();
			if (salir.equalsIgnoreCase("NO")) break;
		}
		imprimirProductos(productos);
		
	}
	
	public static void imprimirProductos(ArrayList<ProductoManufacturado> productos){
		for (ProductoManufacturado producto : productos) {
            System.out.println(MU.completarConEspacios("Codigo de producto: ") + MU.completarConEspacios(MU.int_to_String(producto.getCodigo())));
            System.out.println(MU.completarConEspacios("Producto: ") + MU.completarConEspacios(producto.getDenominacion()));
            System.out.println(MU.completarConEspacios("Tiempo de elaboracion: ") + MU.completarConEspacios(MU.int_to_String(producto.getTiempoFabricacion())));
            System.out.println("Insumos");
            System.out.println(MU.completarConEspacios("Codigo ") + MU.completarConEspacios("Insumo") + MU.completarConEspacios("Cantidad/Unidad de Medida") + "\t" + MU.completarConEspacios("Precio Costo Calculado"));
            for (int i=0; i<producto.getInsumos().length; i++) {
            	System.out.println(MU.completarConEspacios(producto.getInsumos()[i][0]) + MU.completarConEspacios(producto.getInsumos()[i][1]) + MU.completarConEspacios(producto.getInsumos()[i][2]) + "\t\t" +  MU.completarConEspacios(producto.getInsumos()[i][3]));
            }
            System.out.println("…………");
            System.out.println(MU.completarConEspacios("Costo Total Producto: ") + MU.completarConEspacios(MU.double_to_String(producto.costoTotalProducto())));
            // arreglar margen de ganancia
            System.out.println(MU.completarConEspacios("Margen de Ganancia: ") + MU.completarConEspacios(MU.double_to_String(producto.getMargenGanancia())));
            System.out.println(MU.completarConEspacios("Precio de Venta Final: ") + MU.completarConEspacios(MU.double_to_String(producto.precioVentaProducto())));
            System.out.println();
        }
    }
	
}
