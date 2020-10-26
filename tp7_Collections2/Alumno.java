/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7_Collections2;
import java.util.*;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList <Nota> Notas;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Nota> Notas) {
        this.Notas = Notas;
    }
    
    public void agregarNota(Nota nota){
        if (this.Notas == null){
            this.Notas = new ArrayList<Nota>();
        }
        this.Notas.add(nota);
    }

    public double promedioNotas(){
        double promedio = 0;
        //ArrayList<Nota> promedio = new ArrayList();
        for (Nota nota : this.Notas){
            promedio += nota.getNotaExamen()/Notas.size();
        }
        return promedio;
    }
    
}
