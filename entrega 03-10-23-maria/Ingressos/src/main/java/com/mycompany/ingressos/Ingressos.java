package com.mycompany.ingressos;

public class Ingressos {

    public static void main(String[] args) {
        Normal ingressoNormalTeste = new Normal(250.9);
        VIP ingressoVIPTeste = new VIP(ingressoNormalTeste.getValor(),50.5);
        CamaroteInferior camaroteInferiorTeste = new CamaroteInferior("Setor C", ingressoVIPTeste.getValor(), ingressoVIPTeste.getValorAdicional());
        CamaroteSuperior camaroteSuperiorTeste = new CamaroteSuperior("Setor A", ingressoVIPTeste.getValor(), ingressoVIPTeste.getValorAdicional(), 63.7);
        
        System.out.println("---------------------");
        ingressoNormalTeste.imprimeValor();
        System.out.println("---------------------");
        ingressoVIPTeste.imprimeValor();
        System.out.println("---------------------");
        camaroteInferiorTeste.imprimeValor();
        System.out.println("---------------------");
        camaroteSuperiorTeste.imprimeValor();
        System.out.println("---------------------");
    }
}
