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
public class CargaDDJJStockAgroquimico {

    public static final String[][] agroquimicos = { { "1001", "2EC JEBAGRO", "A" }, { "1002", "D 60 GREEN CROPS", "V" },
            { "1003", "ESTER 97", "A" }, { "1004", "AMINA ICONA SL", "A" }, { "1005", "ABAMECTINA AGRO", "A" },
            { "1006", "FURACARB 31 TS", "R" }, { "1007", "FURAFARM 48 F", "R" }, { "1008", "ACETOCLOR ASSA", "A" },
            { "1009", "GLIFOSATO ACTIVE SIL", "R" }, { "1010", "ABRIGO PLUS", "V" }, };

    public static void main(String[] args) {

        ///////////////////////////////// INICIO
        ///////////////////////////////// PROGRAMA/////////////////////////////////////////
        ///////////////////////////////// INICIO
        ///////////////////////////////// PROGRAMA/////////////////////////////////////////
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        // creo un nuevo objeto DDJJ con la clase DDJJStockAgroquimico
        DDJJStockAgroquimico DDJJ = new DDJJStockAgroquimico();
        System.out.println("--------INICIANDO DDJJ--------");
        System.out.println("Ingrese Razon Social");
        DDJJ.setEmpresa(teclado.nextLine());
        System.out.println("Ingrese CUIT");
        DDJJ.setCuit(getNumero_Int_ConDimension(11));
        System.out.println("Ingrese ano de la DDJJ");
        DDJJ.setAnioDeclaracion(leerAnio()); // cargarNumero_Int();
        System.out.println("Ingrese mes la DDJJ");
        DDJJ.setMesDeclaracion(leerMes(DDJJ.getAnioDeclaracion()));
        System.out.println("--------INICIANDO CARGA AGROQUIMICOS--------");
        while (!salir) {
            // instancio un nuevo objeto agroquimicoNuevo con la clase DDJJStockAgroquimicoDetalle
            DDJJStockAgroquimicoDetalle agroquimicoNuevo = new DDJJStockAgroquimicoDetalle();
            System.out.println("Ingrese codigo de agroquimico");
            agroquimicoNuevo.setCodigo_Agroquimico(cargaCodigo());
            agroquimicoNuevo.setNombre_Agroquimico(cargaNombre(agroquimicoNuevo.getCodigo_Agroquimico()));
            agroquimicoNuevo.setNro_de_Lote(cargaLote(agroquimicoNuevo.getCodigo_Agroquimico()));
            System.out.println("Ingrese capacidad del envase");
            agroquimicoNuevo.setCapacidad_Envase(cargarNumero_double_MayorOIgual(0));
            System.out.println("Ingrese cantidad de envases");
            agroquimicoNuevo.setCantidad_Envases(cargarNumero_Int_MayorOIgual(0));
            agroquimicoNuevo.setSubtotal(agroquimicoNuevo.getCapacidad_Envase() * int_to_double(agroquimicoNuevo.getCantidad_Envases()));
            // anado el objeto agroquimicoNuevo de tipo DDJJStockAgroquimicoDetalle al ArrayList de
            // objetos DDJJStockAgroquimicoDetalle de la clase DDJJ llamado DDJJStock con el metodo asignarDatos
            DDJJ.asignarDatos(agroquimicoNuevo);
            System.out.println("...Datos cargados...");
            System.out.println("¿Desea cargar algun agroquimico adicional? Escriba \"NO\"  para salir");
            if (teclado.nextLine().equalsIgnoreCase("NO"))
                break;
        }
        DDJJ.calcularTotalKiloLitros();
        imprimirDDJJ(DDJJ);
        
        ///////////////////////////////// FIN PROGRAMA /////////////////////////////////
        ///////////////////////////////// FIN PROGRAMA /////////////////////////////////
    }


    ///////////////////////////////// INICIO METODOS /////////////////////////////////
    ///////////////////////////////// INICIO METODOS /////////////////////////////////

    public static void imprimirDDJJ(DDJJStockAgroquimico DDJJ) {
        System.out.println("-------DECLARACION JURADA-------");
        System.out.println("Empresa \t\t" + DDJJ.getEmpresa());
        System.out.println("Empresa \t\t" + DDJJ.getCuit());
        System.out.println("Empresa \t\t" + DDJJ.getMesDeclaracion());
        System.out.println("Empresa \t\t" + DDJJ.getAnioDeclaracion());
        System.out.println(completarConEspacios("Codigo Agroquimico") + "\t"
                + completarConEspacios("Nombre Agroquimico") + "\t" + completarConEspacios("Capacidad Envase") + "\t"
                + completarConEspacios("Cantidad Envase") + "\t" + completarConEspacios("Subtotal") + "\t"
                + completarConEspacios("Num. de Lote (si corresponde)"));
        // la clave del exito: Para cada "agroquimico" -objeto- de tipo DDJJStockAgroquimicoDetalle -clase-
        //en el ArrayList DDJJStock del objeto DDJJ creado con la clase DDJJStockAgroquimico
        for (DDJJStockAgroquimicoDetalle agroquimico : DDJJ.getDDJJStock()) {
            System.out.println(agroquimico.getCodigo_Agroquimico() + "\t\t\t" +
            agroquimico.getNombre_Agroquimico() + "\t\t\t" +
            double_to_String(agroquimico.getCapacidad_Envase()) + "\t\t\t" +
            int_to_String(agroquimico.getCantidad_Envases()) + "\t\t\t" +
            double_to_String(agroquimico.getSubtotal()) + "\t\t\t" +
            agroquimico.getNro_de_Lote());
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t TOTAL \t" + DDJJ.getTotalKiloLitros());
        System.out.println("-------FIN DECLARACION JURADA-------");

    }

    public static String completarConEspacios(String cadena) {
        int cantidadEspacios = 20 /* PONER ACA LA CANTIDAD DE ESPACIOS QUE NECESITO PARA ALIENEAR */ - cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }
    public static String cargaLote(String codigo){
        Scanner teclado = new Scanner(System.in);
        String Nro_de_Lote = "";
        if (codigo.equalsIgnoreCase(agroquimicos[5][0]) || codigo.equalsIgnoreCase(agroquimicos[6][0]) || codigo.equalsIgnoreCase(agroquimicos[8][0])) {
                System.out.println("Agroquimico de Banda Roja (R). Ingrese número de Lote");
                Nro_de_Lote = teclado.nextLine();
                return Nro_de_Lote;
        }
        else Nro_de_Lote = "---";

        return Nro_de_Lote;
    }

    public static String cargaCodigo() {
        Scanner sc = new Scanner(System.in);
        String codigo = "";
        boolean salir = false;
        while (!salir) {
            codigo = sc.nextLine();
            for (int i = 0; i < agroquimicos.length; i++) {
                if (codigo.equals(agroquimicos[i][0])) {
                    System.out.println("...codigo encontrado....");
                    salir = true;
                    break;
                }
            }
            if (salir == false){
                System.out.println("El codigo del agroquimico ingresado no existe, intente nuevamente");
            }
        }
        return codigo;
    }
    
    public static String cargaNombre(String codigo) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        boolean salir = false;
            for (int i = 0; i < agroquimicos.length; i++) {
                if (codigo.equals(agroquimicos[i][0])) {
                    nombre = agroquimicos[i][1];
                    break;
                }
            }
        return nombre;
    }
    
    public static long getNumero_Int_ConDimension(int dimension) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String cuit = "";
        while (!salir) {
            cuit = teclado.nextLine();
            if (cuit.length() == dimension) {
                return String_to_long(cuit);
            } else {
                System.out.println("CUIT no valido, ingrese CUIT con " + dimension + " cifras");
            }
        }
        return String_to_long(cuit);
    }

    public static long String_to_long(String numString) {
        // int numCasteado = Integer.parseInt(numString) pdria ser pero si meto en el
        // String un decimal se cuelga
        long numCasteado = Long.parseLong(numString);
        return numCasteado;
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

    public static float cargarNumero_Float() {
        Scanner teclado = new Scanner(System.in);
        float numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
        while (!errorEntradaDatos) {
            numString = teclado.nextLine();
            try {
                numeroCasteado = Float.parseFloat(numString);
            } catch (NumberFormatException VariableDeclaratorId) {
                errorEntradaDatos = false;
                System.out.println("Error, ingrese un numero decimal simple valido");
                continue;
            } catch (NullPointerException VariableDeclaratorId) {
                errorEntradaDatos = false;
                System.out.println("Error, ingrese un numero decimal simple valido");
                continue;
            }
            errorEntradaDatos = true;
        }
        numeroCasteado = Float.parseFloat(numString);
        errorEntradaDatos = false;
        return numeroCasteado;
    }

    public static double cargarNumero_double() {
        Scanner teclado = new Scanner(System.in);
        double numeroCasteado;
        boolean errorEntradaDatos = false;
        String numString = null;
        while (errorEntradaDatos != true) {
            numString = teclado.nextLine();
            // si quiero utilizar la funcion de 'esDouble' descomento esta linea y comento
            // las siguientes
            // errorEntradaDatos = esDouble(numString);
            try {
                numeroCasteado = Double.parseDouble(numString);
            } catch (NumberFormatException VariableDeclaratorId) {
                errorEntradaDatos = false;
                System.out.println("Error, ingrese un numero decimal doble valido");
                continue;
            } catch (NullPointerException VariableDeclaratorId) {
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

    public static double cargarNumero_double_MayorOIgual(int min) {
        Scanner teclado = new Scanner(System.in);
        double numeroCasteado;
        String numString = null;
        do {
            numeroCasteado = cargarNumero_double();
            if (numeroCasteado <= min)
                System.out.println("Error. Ingrese un valor entero mayor que " + min);
        } while (numeroCasteado <= min /* || num > 2147483647 || num < -2147483648 */);
        return numeroCasteado;
    }

    public static int cargarNumero_Int_MayorOIgual(int min) {
        Scanner teclado = new Scanner(System.in);
        int numeroCasteado;
        String numString = null;
        do {
            numeroCasteado = cargarNumero_Int();
            if (numeroCasteado <= min)
                System.out.println("Error. Ingrese un valor entero mayor que " + min);
        } while (numeroCasteado <= min /* || num > 2147483647 || num < -2147483648 */);
        return numeroCasteado;
    }

    public static int cargarNumero_Int_MenorOIgual(int max) {
        Scanner teclado = new Scanner(System.in);
        int numeroCasteado;
        String numString = null;
        do {
            numeroCasteado = cargarNumero_Int();
            if (numeroCasteado <= max)
                System.out.println("Error. Ingrese un valor entero menor que " + max);
        } while (numeroCasteado > max /* || num > 2147483647 || num < -2147483648 */);
        return numeroCasteado;
    }

    public static int cargarNumero_Int_MenorOIgual_MayorOIgual(int min, int max) {
        Scanner teclado = new Scanner(System.in);
        int numeroCasteado;
        String numString = null;
        do {
            numeroCasteado = cargarNumero_Int();
            if (numeroCasteado <= max)
                System.out.println("Error. Ingrese un valor entero menor que " + max + " y mayor que " + min);
        } while (numeroCasteado < min || numeroCasteado > max /* || num > 2147483647 || num < -2147483648 */);
        return numeroCasteado;
    }

    public static boolean esInt(String numero) {
        try {
            int numeroCasteado = Integer.parseInt(numero);
        } catch (NumberFormatException VariableDeclaratorId) {
            return false;
        }
        return true;
    }

    public static boolean esDouble(String numero) {
        try {
            double numeroCasteado = Double.parseDouble(numero);
        } catch (NumberFormatException VariableDeclaratorId) {
            System.out.println("Error, ingrese un numero decimal doble valido");
            return false;
        } catch (NullPointerException VariableDeclaratorId) {
            System.out.println("Error, ingrese un numero decimal doble valido");
            return false;
        }
        return true;
    }

    public static boolean esFloat(String numero) {
        try {
            float numeroCasteado = Float.parseFloat(numero);
        } catch (NumberFormatException VariableDeclaratorId) {
            return false;
        } catch (NullPointerException VariableDeclaratorId) {
            return false;
        }
        return true;
    }

    public static int leerAnio() {
        int anio = cargarNumero_Int();
        if (anio > (new Date().getYear() + 1900)) {
            System.out.println("El ano no puede superar al ano actual " + (new Date().getYear() + 1900));
            leerAnio();
        }
        return anio;
    }

    public static int leerMes(int anio) {
        int mes = cargarNumero_Int();
        if (mes < 1 || mes > 12) {
            System.out.println("El mes no es valido. Ingrese nuevamente el mes.");
            leerMes(anio);
        }
        if (anio == (new Date().getYear() + 1900) && mes > (new Date().getMonth() + 1)) {
            System.out.println("El mes no puede superar el mes actual. Ingrese nuevamente el mes.");
            leerMes(anio);
        }
        return mes;
    }
    // CASTEO////////////////////////////////////////////////////////////////////////////

    //////// int ////////
    // de int a Integer
    public static Integer int_to_Integer(int num) {
        Integer numCasteado = Integer.valueOf(num);
        return numCasteado;
    }

    // de int a String
    public static String int_to_String(int num) {
        String numCasteado = String.valueOf(num);
        return numCasteado;
    }

    // de int a double
    public static double int_to_double(int num) {
        double numCasteado = (double) (num);
        return numCasteado;
    } /// falta

    // de int a Double
    public static Double int_to_Double(int num) {
        double numCasteado = Double.valueOf((double) (num));
        return numCasteado;
    }

    //////// double ////////
    // de double a int
    public static int double_to_int(double num) {
        int numCasteado = (int) num;
        return numCasteado;
    }

    // de double a Integer
    public static Integer double_to_Integer(double num) {
        Integer numCasteado = Integer.valueOf(String.valueOf((int) num));
        return numCasteado;
    }

    // de double a Double
    public static Double double_to_Double(double num) {
        Double numCasteado = Double.valueOf(num);
        return numCasteado;
    }

    // de double a String
    public static String double_to_String(double num) {
        String numCasteado = String.valueOf(num);
        return numCasteado;
    }

    //////// String ////////
    // de String a int
    public static int String_to_int(String numString) {
        // int numCasteado = Integer.parseInt(numString) pdria ser pero si meto en el
        // String un decimal se cuelga
        int numCasteado = (int) Double.parseDouble(numString);
        return numCasteado;
    }

    // de String a double
    public static double String_to_double(String numString) {
        double numCasteado = Double.parseDouble(numString);
        return numCasteado;
    }

    // de String a Double
    public static Double String_to_Double(String numString) {
        Double numCasteado = Double.valueOf(numString);
        return numCasteado;
    }

    // de String a Integer
    public static Integer String_to_Integer(String numString) {
        Integer numCasteado = Integer.valueOf((int) Double.parseDouble(numString));
        return numCasteado;
    }

    //////// Double ////////
    // de Double a int
    public static int Double_to_int(Double num) {
        Double obj = new Double(num);
        int numCasteado = obj.intValue();
        return numCasteado;
    }

    // de Double a double
    public static double Double_to_double(Double num) {
        Double obj = new Double(num);
        double numCasteado = obj.doubleValue();
        return numCasteado;
    }

    // de Double a Integer
    public static Integer Double_to_Integer(Double num) {
        Double obj = new Double(num);
        Integer numCasteado = Integer.valueOf(obj.intValue());
        return numCasteado;
    }

    // de Double a String
    public static String Double_to_String(Double num) {
        String numCasteado = String.valueOf(Double.valueOf(num));
        return numCasteado;
    }

    //////// Integer ////////
    // de Integer a int
    public static int Integer_to_int(Integer num) {
        Integer obj = new Integer(num);
        int numCasteado = obj.intValue();
        return numCasteado;
    }

    // de Integer a double
    public static double Integer_to_double(Integer num) {
        Integer obj = new Integer(num);
        double numCasteado = obj.doubleValue();
        return numCasteado;
    }

    // de Integer a Double
    public static Double Integer_to_Double(Integer num) {
        Integer obj = new Integer(num);
        Double numCasteado = Double.valueOf(obj.doubleValue());
        return numCasteado;
    }

    // de Integer a String
    public static String Integer_to_String(Integer num) {
        Integer obj = new Integer(num);
        String numCasteado = String.valueOf(obj.intValue());
        return numCasteado;
    }
    ///////////////////////////////// FIN
    ///////////////////////////////// METODOS///////////////////////////////////////
    ///////////////////////////////// FIN
    ///////////////////////////////// METODOS///////////////////////////////////////

}
