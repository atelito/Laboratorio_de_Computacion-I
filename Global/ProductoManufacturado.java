package Global;

public class ProductoManufacturado {
	private int codigo;
	private String denominacion;
	private int tiempoFabricacion;
	private String [][] insumos;
	private double margenGanancia;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public int getTiempoFabricacion() {
		return tiempoFabricacion;
	}
	public void setTiempoFabricacion(int tiempoFabricacion) {
		this.tiempoFabricacion = tiempoFabricacion;
	}
	public String[][] getInsumos() {
		return insumos;
	}
	public void setInsumos(String[][] insumos) {
		this.insumos = insumos;
	}
	public double getMargenGanancia() {
		return margenGanancia;
	}
	public void setMargenGanancia(double margenGanancia) {
		this.margenGanancia = margenGanancia;
	}
	
	/*
	Cada fila del array de insumos se corresponderá con:
Código Insumo
(texto)
Denominación Insumo
(texto)
Cantidad Insumo
(decimal)
Precio Costo Calculado
(decimal)
	*/
	public double costoTotalProducto(){
		double costototal = 0;
		for (int i = 0; i<insumos.length; i++) {
			costototal += MU.String_to_double(insumos[i][3]);
		}
		return costototal;
	}
	
	public double precioVentaProducto(){
		double precioVenta = 0;
		precioVenta += costoTotalProducto() * (1 + margenGanancia/100);
		return precioVenta;
	}
	

	
	
}
