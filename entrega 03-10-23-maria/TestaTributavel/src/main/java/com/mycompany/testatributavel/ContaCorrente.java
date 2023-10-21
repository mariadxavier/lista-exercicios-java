package com.mycompany.testatributavel;

public class ContaCorrente extends Conta implements Tributavel{
    
    public ContaCorrente(double saldo){
        super(saldo);
    }
    
    public ContaCorrente(){
        
    }

    @Override
    public double calculaTributos() {
        double tributo = super.getSaldo() * 0.01;        
        double novoSaldo = super.getSaldo() - tributo;
        super.setSaldo(novoSaldo); 
        
        return tributo;
    }

}
