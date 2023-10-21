package com.mycompany.ingressos;

public class CamaroteInferior extends VIP{  
       
    private String localizacao;

    public CamaroteInferior(String localizacao, double valor, double valorAdicional) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
     
    
    @Override
    public void imprimeValor(){
        System.out.println("Ingresso Camarote Inferior: ");
        System.out.println("Localização: "+ this.getLocalizacao() );
        System.out.println("Valor: "+ super.valorTotal());
    }
    
}
