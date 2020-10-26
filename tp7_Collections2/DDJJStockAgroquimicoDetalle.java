/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7_Collections2;

/**
 *
 * @author axelp
 */
public class DDJJStockAgroquimicoDetalle {
    String Codigo_Agroquimico;
    String Nombre_Agroquimico;
    double Capacidad_Envase;
    int Cantidad_Envases;
    double Subtotal;
    String Nro_de_Lote;

    public String getCodigo_Agroquimico() {
        return Codigo_Agroquimico;
    }

    public void setCodigo_Agroquimico(String Codigo_Agroquimico) {
        this.Codigo_Agroquimico = Codigo_Agroquimico;
    }

    public String getNombre_Agroquimico() {
        return Nombre_Agroquimico;
    }

    public void setNombre_Agroquimico(String Nombre_Agroquimico) {
        this.Nombre_Agroquimico = Nombre_Agroquimico;
    }

    public double getCapacidad_Envase() {
        return Capacidad_Envase;
    }

    public void setCapacidad_Envase(double Capacidad_Envase) {
        this.Capacidad_Envase = Capacidad_Envase;
    }

    public int getCantidad_Envases() {
        return Cantidad_Envases;
    }

    public void setCantidad_Envases(int Cantidad_Envases) {
        this.Cantidad_Envases = Cantidad_Envases;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public String getNro_de_Lote() {
        return Nro_de_Lote;
    }

    public void setNro_de_Lote(String Nro_de_Lote) {
        this.Nro_de_Lote = Nro_de_Lote;
    }
}
