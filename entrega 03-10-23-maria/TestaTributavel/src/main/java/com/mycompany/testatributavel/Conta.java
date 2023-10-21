package com.mycompany.testatributavel;

public class Conta {

    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }   
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        double novoSaldo = this.saldo - valor;
        this.setSaldo(novoSaldo);
        
    }
    
    public void depositar(double valor){
        double novoSaldo = this.saldo + valor;
        this.setSaldo(novoSaldo);
    }
    
    public double obterSaldo(){
        return this.saldo;
    }
    
    
    
}
