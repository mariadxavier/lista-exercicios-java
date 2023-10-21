package com.mycompany.testatributavel;


public class TestaTributavel {

    public static void main(String[] args) {
        ContaPoupanca contaTeste = new ContaPoupanca(300.0);
        ContaCorrente contaTeste1 = new ContaCorrente(3000.0); 
        SeguroDeVida seguro1 = new SeguroDeVida(1000.00);
        
        System.out.println("Conta Poupança de saldo "+ contaTeste.getSaldo());        
        contaTeste.depositar(40);
        System.out.println("Saldo conta poupança pós depósito de R$40,00: R$" + contaTeste.obterSaldo());
        contaTeste.sacar(100);
        System.out.println("Saldo conta poupança pós saque de R$100,00: R$" + contaTeste.obterSaldo());
        System.out.println("----------------------------");
        
        System.out.println("Conta Corrente de saldo "+ contaTeste1.getSaldo());
        contaTeste1.depositar(80);
        System.out.println("Saldo conta corrente pós depósito de R$80,00: R$" + contaTeste1.obterSaldo());
        contaTeste1.sacar(200);
        System.out.println("Saldo conta poupança pós saque de R$200,00: R$" + contaTeste1.obterSaldo());
        contaTeste1.calculaTributos();
        System.out.println("Saldo conta pós tributos: R$" + contaTeste1.obterSaldo());
        System.out.println("valor tributos: R$" + contaTeste1.calculaTributos());
        
        System.out.println("----------------------------");
        System.out.println("Seguro de vida de R$"+ seguro1.getValor());
        seguro1.calculaTributos();
        System.out.println("pós tributação: R$" + seguro1.getValor());
        System.out.println("valor tributos: R$" + seguro1.calculaTributos());
    }
}
