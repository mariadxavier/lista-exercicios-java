package com.mycompany.ingressos;

public class Ingresso {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }
    
    public void imprimeValor(){
            String valorImpresso = String.format("%.2f",valor);
            System.out.println("Valor: R$" + valorImpresso);
    }
    
}
