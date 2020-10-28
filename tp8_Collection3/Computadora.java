package tp8_Collection3;

import java.util.HashSet;

public class Computadora {
	private String marca;
	private String modelo;
	private HashSet<ComponenteCPU> Componentes;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public HashSet<ComponenteCPU> getComponentes() {
		return Componentes;
	}
	public void setComponentes(HashSet<ComponenteCPU> componentes) {
		this.Componentes = componentes;
	}
	

    public void agregarComponentes(ComponenteCPU componente){
        if (this.Componentes == null){
            this.Componentes = new HashSet<ComponenteCPU>();
        }
        this.Componentes.add(componente);
    }

    public double calculoTotal() {
    	double Total = 0;
    	for (ComponenteCPU subtotal : Componentes) {
    		Total += subtotal.SubTotal(subtotal.getCantidad(), subtotal.getPrecio());
    	}
    	return Total;
    }
}
