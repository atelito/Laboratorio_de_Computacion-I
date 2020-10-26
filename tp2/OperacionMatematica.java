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


public class OperacionMatematica {
    private double valor1;
    private double valor2;
    private String operacion;

    public double getValor1() {
        return valor1;
    }
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }
    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    private double sumarNumeros(){
    return valor1 + valor2;
    }
    private double restarNumeros(){
    return valor1 - valor2;
    }
    private double multiplicarNumeros(){
    return valor1 * valor2;
    }
    private double dividirNumeros(){
    return valor1 / valor2;
    }
    
    public double aplicarOperacion(String operacion){
        double valoresOperados = 0;
        switch (operacion){
            case "+":
                valoresOperados = this.sumarNumeros();
                System.out.println(valoresOperados);
                    break;
            case "-":
                valoresOperados = this.restarNumeros();
                System.out.println(valoresOperados);
                    break;
            case "*":
                valoresOperados = this.multiplicarNumeros();
                System.out.println(valoresOperados);
                    break;
            case "/":
                valoresOperados = this.dividirNumeros();
                System.out.println(valoresOperados);
                    break;
            default:
                    System.out.println("Operación ingresada no contemplada en el metodo aplicarOperacion");
        }
        
        return valoresOperados;
            
    }
}
