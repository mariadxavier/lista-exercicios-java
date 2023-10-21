package com.mycompany.ingressos;

public class VIP extends Ingresso{
    private double valorAdicional;

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    
    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    
    public String valorTotal(){
        String valorIngressoVIP = String.format("%.2f", super.getValor() + this.valorAdicional);
        return "R$" + valorIngressoVIP;
    }
    
    @Override
    public void imprimeValor(){
        System.out.println("Ingresso VIP: ");        
        System.out.println("Valor: "+ this.valorTotal());
    }
}
