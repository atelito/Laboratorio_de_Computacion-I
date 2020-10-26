/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author axelp
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if(denominador == 0){ //para no dividir por cero
            denominador = 1;
        }
        this.denominador = denominador;
        simplificar(); //para vrla sencilla     
    }
    
    public Fraccion(){
    }

    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    
    
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        Fraccion res = new Fraccion();
        res.numerador = f1.numerador*f2.denominador + f2.numerador*f1.denominador;
        res.denominador = f1.denominador * f2.denominador;
        res.simplificar();
        return res;
    }
    
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        Fraccion res = new Fraccion();
        res.numerador = f1.numerador*f2.denominador - f2.numerador*f1.denominador;
        res.denominador = f1.denominador * f2.denominador;
        res.simplificar();
        return res;
    }
    
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        Fraccion res = new Fraccion();
        res.numerador = f1.numerador*f2.numerador;
        res.denominador = f1.denominador * f2.denominador;
        res.simplificar();
        return res;
    }
    
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        Fraccion res = new Fraccion();
        res.numerador = f1.numerador * f2.denominador;
        res.denominador = f1.denominador * f2.numerador;
        res.simplificar();
        return res;
    }

    private int mcd() {
        int u = Math.abs(numerador);                                                                                       
        int v = Math.abs(denominador);
        if(v == 0){
          return u;
        }
        int r;
        while(v != 0){  //máximo común divisor del numerador y del denominador por metodo de Euclides
             r = u % v; //Iterativo: se halla el resto r de dividir el primero u entre el segundo v.  Se asigna a u el divisor v, y se asigna a v el resto r.
             u = v;
             v = r;
        }
        return u;
    }
    
    private Fraccion simplificar(){
     int n = mcd();
     numerador/= n;
     denominador/= n;
     return this;
    }
    
    //me figura que deberia usar un @Override para usar un metodo ligeramente diferente del metodo toString original de la clase base Object
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }

    
}
