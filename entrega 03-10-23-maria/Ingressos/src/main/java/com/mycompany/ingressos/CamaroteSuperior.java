package com.mycompany.ingressos;

public class CamaroteSuperior extends VIP{
    
    private double valorExtra;
    private String localizacao;
    
    public CamaroteSuperior(String localizacao, double valor, double valorAdicional, double valorExtra) {
        super(valor, valorAdicional);
        this.valorExtra = valorExtra;
        this.localizacao = localizacao;
    }

    public double getValorExtra() {
        return valorExtra;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setValorExtra(double valorExtra) {
        this.valorExtra = valorExtra;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    @Override
    public String valorTotal(){
        String valorIngressoVIP = String.format("%.2f", super.getValor() + this.getValorAdicional() + this.valorExtra);
        return "R$" + valorIngressoVIP;
    }
    
     @Override
    public void imprimeValor(){
        System.out.println("Ingresso Camarote Superior: ");
        System.out.println("Localização: "+ this.getLocalizacao() );        
        System.out.println("Valor: " + this.valorTotal());
    }
    
    
    
}
