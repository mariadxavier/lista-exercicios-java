package com.mycompany.conjuntos;

import java.util.Arrays;


public class InteiroSet {
    private int valor0, valor1, valor2, valor3, valor4, valor5, valor6, valor7,valor8,valor9;
    private boolean[] conjuntoC = new boolean[10];
    
    //construtora: 

    public InteiroSet(int valor0, int valor1, int valor2, int valor3, int valor4, int valor5, int valor6, int valor7, int valor8, int valor9) {
        this.valor0 = valor0;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
        this.valor5 = valor5;
        this.valor6 = valor6;
        this.valor7 = valor7;
        this.valor8 = valor8;
        this.valor9 = valor9;
        
        this.validarEntrada();
    }  
    
    //getters e setters:

    public boolean[] getConjuntoC() {
        return conjuntoC;
    }
     
    public int getValor0() {
        return valor0;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public int getValor4() {
        return valor4;
    }

    public int getValor5() {
        return valor5;
    }

    public int getValor6() {
        return valor6;
    }

    public int getValor7() {
        return valor7;
    }

    public int getValor8() {
        return valor8;
    }

    public int getValor9() {
        return valor9;
    }
    
    public void setValor0(int valor0) {
        this.valor0 = valor0;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public void setValor4(int valor4) {
        this.valor4 = valor4;
    }

    public void setValor5(int valor5) {
        this.valor5 = valor5;
    }

    public void setValor6(int valor6) {
        this.valor6 = valor6;
    }

    public void setValor7(int valor7) {
        this.valor7 = valor7;
    }

    public void setValor8(int valor8) {
        this.valor8 = valor8;
    }

    public void setValor9(int valor9) {
        this.valor9 = valor9;
    }
    
    //métodos:  
    
    public String imprimirConjuntoC() {
        for (boolean elemento : conjuntoC) {
            System.out.println(elemento);
        }
        return "";
    }
        
    public int[] retornaArray(){
        int[] conjuntoB = {this.getValor0(), this.getValor1(), this.getValor2(), this.getValor3(), this.getValor4(), this.getValor5(), this.getValor6(), this.getValor7(), this.getValor8(), this.getValor9() };
        Arrays.sort(conjuntoB);
        return conjuntoB;
    }
    
    public void validarEntrada() {
        int[] valores = this.retornaArray();        
        
        for(int i = 0; i <= 9; i++) {
            this.conjuntoC[i] = valores[i] >= 0 && valores[i] <= 100;            
        }    
    }
    
    public String imprimirArray() {
        int[] principal = this.retornaArray();
                
        for (int i : principal) {
        if (i == -1) {
            System.out.print("- ");
        } else {
            System.out.print(i + " ");
        }
    }      
        return "";
    }
    
    public String union(InteiroSet conjuntoX) {
        int[] principal = this.retornaArray();
        int[] secundario = conjuntoX.retornaArray();
        
        for(int i: principal){
            System.out.print(i+ " ");}
        
        for(int ii: secundario){
            System.out.print(ii + " ");}
     
        return "";
        
    }
    
    public String intersecao(InteiroSet conjuntoX) {
        int[] principal = this.retornaArray();
        int[] secundario = conjuntoX.retornaArray();        
        int[] auxiliar = new int[principal.length + secundario.length];
        int k = 0;
        
        for(int i = 0; i < principal.length; i++){
            for(int j = 0; j < secundario.length; j++){
                if(principal[i] == secundario[j]){
                    auxiliar[k++] = principal[i];
                }
            }  
        }
        
        int[] c = new int[k];        
        System.arraycopy(auxiliar, 0, c, 0, k);
        
        for(int i: c){
            System.out.print(i+ " ");
        }
        
        return "";
    }
    
    public boolean insereElemento(int numeroAntigo, int numeroNovo){
        boolean fezSubstituicao = false;
    
        if (valor0 == numeroAntigo) {
            valor0 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor1 == numeroAntigo) {
            valor1 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor2 == numeroAntigo) {
            valor2 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor3 == numeroAntigo) {
            valor3 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor4 == numeroAntigo) {
            valor4 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor5 == numeroAntigo) {
            valor5 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor6 == numeroAntigo) {
            valor6 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor7 == numeroAntigo) {
            valor7 = numeroNovo;
            fezSubstituicao = true;
        }   
    
        if (valor8 == numeroAntigo) {
            valor8 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (valor9 == numeroAntigo) {
            valor9 = numeroNovo;
            fezSubstituicao = true;
        }
    
        if (fezSubstituicao) {
            this.validarEntrada();
        }
    
        return fezSubstituicao;
    }
    
    public boolean deleteElemento(int numeroASerDeletado){
        if (numeroASerDeletado == valor0) {
            valor0 = -1;
            return true;
        }
        if (numeroASerDeletado == valor1) {
            valor1 = -1;
            return true;
        }
        if (numeroASerDeletado == valor2) {
            valor2 = -1;
            return true;
        }
        if (numeroASerDeletado == valor3) {
            valor3 = -1;
            return true;
        }
        if (numeroASerDeletado == valor4) {
            valor4 = -1;
            return true;
        }
        if (numeroASerDeletado == valor5) {
            valor5 = -1;
            return true;
        }
        if (numeroASerDeletado == valor6) {
            valor6 = -1;
            return true;
        }
        if (numeroASerDeletado == valor7) {
            valor7 = -1;
            return true;
        }
        if (numeroASerDeletado == valor8) {
            valor8 = -1;
            return true;
        }
        if (numeroASerDeletado == valor9) {
            valor9 = -1;
            return true;
        }
        
        this.validarEntrada();
        return false;
    }
    
    public boolean ehIgualTo(InteiroSet conjuntoX){
        int[] principal = this.retornaArray();
        int[] secundario = conjuntoX.retornaArray();
        
        return Arrays.equals(principal, secundario);
    }
    
}

