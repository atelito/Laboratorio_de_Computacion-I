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
public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> Ingredientes;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }
    
    
    public void agregarIngrediente(Ingrediente ingrediente){
        if (this.Ingredientes == null){
            this.Ingredientes = new ArrayList<Ingrediente>();
        }
        this.Ingredientes.add(ingrediente);
    }

    
    
}
