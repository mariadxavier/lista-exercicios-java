package com.mycompany.loja;

public class Loja {

    public static void main(String[] args) {
        Fatura faturaExemplo = new Fatura("1234", "fone de ouvido", 5, 0);
                
        double alocacao = faturaExemplo.getTotalFatura(faturaExemplo);
        System.out.print("Valor total da fatura: " + alocacao);
    }
}
