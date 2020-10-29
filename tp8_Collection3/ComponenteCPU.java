package tp8_Collection3;

public class ComponenteCPU {
	private String componente;
	private String marca;
	private int cantidad;
	private double precio;

	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double SubTotal(int cantidad, double precio) {
		double SubTotal = cantidad * precio;
		return SubTotal;
	}

}
