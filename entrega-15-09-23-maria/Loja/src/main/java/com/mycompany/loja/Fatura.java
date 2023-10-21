package com.mycompany.loja;


public class Fatura {

    String numero;
    String descricao;
    int quant;
    double preco;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Fatura(String numero, String descricao, int quant, double preco ){
        this.numero = numero;
        this.descricao = descricao;
        this.preco =  preco;
        this.quant = quant;
    }
    
    public double getTotalFatura(Fatura fatura) {
        double faturaPreco = fatura.getPreco();
        int faturaQuant = fatura.getQuant();
       
        if (faturaPreco < 0 ) {
            faturaPreco = 0d;
        }
        
        double total = faturaPreco * faturaQuant;
        
        if (total < 0) {
           total = 0;
        }
        
        return total;       
        
    }
}
