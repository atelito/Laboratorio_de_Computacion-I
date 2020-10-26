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
public class DDJJStockAgroquimico {
private int anioDeclaracion;
private int mesDeclaracion;
private double totalKiloLitros;
private String empresa;
private long cuit;
private ArrayList<DDJJStockAgroquimicoDetalle> DDJJStock; //asociacion de objetos con cardinalidad 1 a 1

    public DDJJStockAgroquimico() {
    }

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public double getTotalKiloLitros() {
        return totalKiloLitros;
    }

    public void setTotalKiloLitros(double totalKiloLitros) {
        this.totalKiloLitros = totalKiloLitros;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public ArrayList<DDJJStockAgroquimicoDetalle> getDDJJStock() {
        return DDJJStock;
    }

    public void setDDJJStock(ArrayList<DDJJStockAgroquimicoDetalle> DDJJStock) {
        this.DDJJStock = DDJJStock;
    }

    public void asignarDatos(DDJJStockAgroquimicoDetalle objeto){
        if(this.DDJJStock == null){
            this.DDJJStock = new ArrayList<DDJJStockAgroquimicoDetalle>();
        }
        this.DDJJStock.add(objeto);

    }




    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // de String a double
    public static double String_to_double(String numString){
        double numCasteado = Double.parseDouble(numString);
        return numCasteado;
    }

    // de double a String
    public static String double_to_String(double num){
        String numCasteado = String.valueOf(num);
        return numCasteado;
    }

    public static String long_to_String(long num){
        double numDouble = (double) num;
        String numCasteado = String.valueOf(numDouble);
        return numCasteado;
    }

    public void calcularTotalKiloLitros(){
        double calcularTotalKiloLitros = 0;
        for (DDJJStockAgroquimicoDetalle subtotal : this.DDJJStock){
            calcularTotalKiloLitros += subtotal.getSubtotal();
        }
        this.totalKiloLitros = calcularTotalKiloLitros;
    }
}
