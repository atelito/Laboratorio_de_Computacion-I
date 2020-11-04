package Parcial2;

import java.util.ArrayList;

public class Empresa {
	private String cuit;
	private String razonSocial;
	private ArrayList<Empleado> Empleados;
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public ArrayList<Empleado> getEmpleados() {
		return Empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		Empleados = empleados;
	}
	
	
}
