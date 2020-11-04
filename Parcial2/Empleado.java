package Parcial2;

public class Empleado {
	private String nombreCompleto;
	private int legajo;
	private double salario;
	private NivelAcademico NivelAcademico;
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public NivelAcademico getNivelAcademico() {
		return NivelAcademico;
	}
	public void setNivelAcademico(NivelAcademico nivelAcademico) {
		NivelAcademico = nivelAcademico;
	}
	
	    public void agregarNivelAcademico(NivelAcademico codigo){
        if (this.NivelAcademico == null){
            this.NivelAcademico = new NivelAcademico();
        }
        //this.NivelAcademico.setCodigo(codigo);
    }

	
	public double salarioTotalCalculado(){
        double salarioTotal = salario * (1 +NivelAcademico.getPorcentajeAumento()/100);
		return salarioTotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + legajo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (legajo != other.legajo)
			return false;
		return true;
	}
	
	
	
	
}
