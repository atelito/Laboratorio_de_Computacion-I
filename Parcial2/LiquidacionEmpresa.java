package Parcial2;

import java.util.*;

public class LiquidacionEmpresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salirNivelAcademico = false;
		
		ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<NivelAcademico>();
		
		NivelAcademico nivelAcademico1 = new NivelAcademico();
		NivelAcademico nivelAcademico2 = new NivelAcademico();
		NivelAcademico nivelAcademico3 = new NivelAcademico();
		NivelAcademico nivelAcademico4 = new NivelAcademico();
		
		nivelAcademico1.setCodigo(10);
		nivelAcademico1.setNivel("Secundario Completo");
		nivelAcademico1.setPorcentajeAumento(10);;
		nivelAcademico2.setCodigo(20);
		nivelAcademico2.setNivel("Universitario Completo");
		nivelAcademico2.setPorcentajeAumento(30);;
		nivelAcademico3.setCodigo(30);
		nivelAcademico3.setNivel("Maestría Completo");
		nivelAcademico3.setPorcentajeAumento(40);;
		nivelAcademico4.setCodigo(40);
		nivelAcademico4.setNivel("Doctorando Completo");
		nivelAcademico4.setPorcentajeAumento(50);;

		nivelesAcademicos.add(nivelAcademico1);
		nivelesAcademicos.add(nivelAcademico2);
		nivelesAcademicos.add(nivelAcademico3);
		nivelesAcademicos.add(nivelAcademico4);
		
		Empresa empresa = new Empresa();

		System.out.println("Ingrese Razon Social");
		empresa.setRazonSocial(getStringNoVacio());
		System.out.println("Ingrese CUIT");
		empresa.setCuit(MU.int_to_String(MU.getNumero_Int_ConDimension(11)));
		System.out.println("------COMENZANDO CARGA DE EMPLEADOS------");
		ArrayList<Empleado> empleadoS = new ArrayList<Empleado>();
		while(true){
			Empleado empleado = new Empleado();
			System.out.println("Ingrese Nombre Completo");
			empleado.setNombreCompleto(getStringNoVacio());
			
			System.out.println("Ingrese Legajo de " + empleado.getNombreCompleto());
			int legajo = 0;
			int salir = 0;
			while (true) {
				legajo = MU.getNumero_Int_MayorOIgual(0);
				if (empleadoS.size() > 0) {
					while (salir == 0) {
						for (Empleado e : empleadoS) {
							if (e.getLegajo() != legajo){
								salir = 1;
							}
							else salir = 0;
						}
						if (salir == 0) {
							System.out.println("El legajo ingresado ya existe, intente nuevamente");
							legajo = MU.getNumero_Int_MayorOIgual(0);
						}
					}
						
				}
				break;
			}
			empleado.setLegajo(legajo);
			System.out.println("Ingrese Salario de " + empleado.getNombreCompleto());
			empleado.setSalario(MU.getNumero_Int_MayorOIgual(0));
			NivelAcademico nivelAcademicoEmpleado = new NivelAcademico();
			System.out.println("Ingrese Codigo de Nivel Academico");
			int codigo = 0;
			salir = 0;
			while (salir == 0) {
				codigo = MU.getNumero_Int();
				for (NivelAcademico nivel : nivelesAcademicos) {
					if (nivel.getCodigo() == codigo){
						salir = 1;
						salirNivelAcademico = false;
					}					
				}
				if (salir == 0) System.out.println("El código ingresado no existe, intente nuevamente");
			}
			nivelAcademicoEmpleado.setCodigo(codigo);
			for (NivelAcademico nivel : nivelesAcademicos) {
				if (codigo == nivel.getCodigo()) {
					nivelAcademicoEmpleado.setNivel(nivel.getNivel());
					nivelAcademicoEmpleado.setPorcentajeAumento(nivel.getPorcentajeAumento());
					break;
				}
			}
			empleado.setNivelAcademico(nivelAcademicoEmpleado);
			empleadoS.add(empleado);
			empresa.setEmpleados(empleadoS);
			System.out.println("¿Desea continuar agregando empleados?.  Escriba \"NO\" para dejar de agregar empleados");
            String salirCargaEmpleados = sc.nextLine();
            if (salirCargaEmpleados.equalsIgnoreCase("NO")) break;		
		}
		imprimirEmpresa(empresa);
	}
	
	public static String getStringNoVacio() {
		Scanner sc = new Scanner(System.in);
		String string = "";
		while (string.length() < 1) {
			string = sc.nextLine();
			if (string.length() < 1) {
				System.out.println("Error. Debe ingresar un dato. No puede estar vacio");
			}
		}		
		return string;
	}
	
	public static void imprimirEmpresa(Empresa empresa) {
		System.out.println("------------------------------------");
		System.out.println("Empresa: " + empresa.getRazonSocial());
		System.out.println("CUIT: " + empresa.getCuit());
		System.out.println("------------------------Empleados------------------------------");
		for (Empleado emp : empresa.getEmpleados()){
            System.out.println("Nombre Completo: " + emp.getNombreCompleto());
            System.out.println("Salario: $" + emp.salarioTotalCalculado());
            System.out.println("Nivel Educativo: " + emp.getNivelAcademico().getNivel() + " (Porcentaje Aumento " + emp.getNivelAcademico().getPorcentajeAumento() + "%)");
		}
		double promedio = 0;
		double salarioTotal = 0;
		Empleado empleadoFinal = new Empleado();
		for (Empleado emp : empresa.getEmpleados()){
			promedio += emp.salarioTotalCalculado();
			if (salarioTotal < emp.salarioTotalCalculado()) {
				salarioTotal = emp.salarioTotalCalculado();
				empleadoFinal.setNombreCompleto(emp.getNombreCompleto());
				empleadoFinal.setSalario(emp.salarioTotalCalculado());
				empleadoFinal.setNivelAcademico(emp.getNivelAcademico());
			}
		}
    	System.out.println("------------------------------------");
    	System.out.println("Resumen");
    	System.out.println("El promedio de los salarios de la empresa es: $" + promedio/empresa.getEmpleados().size());
    	System.out.println("El empleado con mejor salario es: ");
    	System.out.println("Nombre completo: " + empleadoFinal.getNombreCompleto());
    	System.out.println("Salario: $" + empleadoFinal.salarioTotalCalculado());
    	System.out.println("Nivel Educativo: " + empleadoFinal.getNivelAcademico().getNivel() + " (Porcentaje Aumento " + empleadoFinal.getNivelAcademico().getPorcentajeAumento() + "%)");
	}


}
