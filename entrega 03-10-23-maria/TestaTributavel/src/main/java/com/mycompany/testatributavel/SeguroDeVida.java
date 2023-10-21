package com.mycompany.testatributavel;

public class SeguroDeVida implements Tributavel {
    
    double valor;

    public SeguroDeVida(double valor) {
        this.valor = valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    

    @Override
    public double calculaTributos() {
        double novoValor = valor - 42.0;
        setValor(novoValor);
        return 42.0;
    }


}
