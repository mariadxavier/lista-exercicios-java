package com.mycompany.conjuntos;
import java.util.Arrays;
import java.util.Scanner;

public class Conjuntos {

    public static void main(String[] args) {       
        
        InteiroSet conjunto2 = new InteiroSet(10,22,38,40,50,60,71,80,90,100);
        InteiroSet conjunto1 = new InteiroSet(11,22,33,44,55,66,77,88,99,10);
        
        System.out.println("Atividade 6 - InteiroSet");
        System.out.println("----------- Considere: --------------");
        
        
        System.out.println("Conjunto A: \n");
        System.out.println(conjunto1.imprimirArray());
        System.out.println("Conjunto B: \n");
        System.out.println(conjunto2.imprimirArray());
        
        
        System.out.println("\n----------------------------- \n Método Union (unir os dois vetores teoricamente): \n");
        System.out.println(conjunto1.union(conjunto2));
        
        System.out.println("\n----------------------------- \n Método Interseção: \n");
        System.out.println("Valores comuns entre os conjuntos: ");
        System.out.println(conjunto1.intersecao(conjunto2));
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n----------------------------- \n Método Insere elemento (recebe um valor do conjunto substitui por outro): \n");
        System.out.println("\n Os itens do conjunto B são: \n" );
        System.out.println(conjunto2.imprimirArray());
        System.out.println("Qual você deseja substituir? ");
        int valorASerTrocado = sc1.nextInt();        
        System.out.println("Qual o novo valor? ");
        int valorNovo = sc1.nextInt();       
        conjunto2.insereElemento(valorASerTrocado, valorNovo);
        System.out.println("\n Conjunto B atualizado: ");
        System.out.println(conjunto2.imprimirArray());
        
        System.out.println("\n----------------------------- \n Método ehIgualTo: \n (retorna True se os dois arrays forem igual ou False se forem difrentes)");
        System.out.println("O conjunto A é igual ao conjunto B? " + conjunto1.ehIgualTo(conjunto2));
        
        
        System.out.println("\n----------------------------- \n Método deleteElemento: \n (configura o elemento selecionado com -1, sendo assim o conjunto de boolean o tem como false");
        System.out.println("\n Os itens do conjunto B são: \n" );
        System.out.println(conjunto2.imprimirArray());
        System.out.println("Qual você deseja deletar? ");
        int valorASerDeletado = sc1.nextInt();
        conjunto2.deleteElemento(valorASerDeletado);
        System.out.println("\n Conjunto B atualizado: ");
        System.out.println(conjunto2.imprimirArray());
        
        System.out.println("\n----------------------------- \n Método toSetString já se encontra em uso: ");
        System.out.println("COnjunto A: ");
        System.out.println(conjunto1.imprimirArray());
        System.out.println("COnjunto B: ");
        System.out.println(conjunto2.imprimirArray());       
        
        
    }

}
