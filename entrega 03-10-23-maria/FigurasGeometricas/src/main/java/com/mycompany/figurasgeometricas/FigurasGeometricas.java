package com.mycompany.figurasgeometricas;
import java.util.Scanner;


public class FigurasGeometricas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                     
        System.out.println("--------------------------------");
        System.out.println("CRIADOR DE FORMAS GEOMÉTRICAS");
        System.out.println("--------------------------------");
        
        System.out.println("Quantas formas você deseja criar? ");
        int numFormas = sc.nextInt();
        
        Figura[] figuras = new Figura[numFormas];
        
        int n = 1;
        
        while(n <= numFormas){
            System.out.println("Qual será a forma "+ n + "? \n Selecione o numero: ");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Círculo");
            int selecaoForma = sc.nextInt();
                                    
            switch(selecaoForma){
                case 1:
                    System.out.println("Insira o tamanho da base: ");
                    double valorBase = sc.nextDouble();
                    System.out.println("Insira o tamanho da altura: ");
                    double valorAltura = sc.nextDouble();
                    figuras[n-1] = new Retangulo(valorBase, valorAltura); 
                    break;                
                
                case 2: 
                    System.out.println("Insira o tamanho do lado: ");
                    double valorLado = sc.nextDouble();
                    figuras[n-1] = new Quadrado(valorLado);
                    break;
                                
                case 3: 
                    System.out.println("Insira o tamanho do raio: ");
                    double valorRaio = sc.nextDouble();
                    figuras[n-1] =  new Circulo(valorRaio);
                    break;
                
                default:
                    System.out.println("Numero inválido, tente novamente.");
                    break;                
            }
            
            n++;
        }  
        System.out.println("---------------------");
        System.out.println("Figuras cadastradas:");
        System.out.println("---------------------");
        
        for(int indice = 0; indice < figuras.length; indice++) {
            System.out.println("Figura: " + figuras[indice].nomeFigura());
            System.out.println("Área: " + figuras[indice].calcArea());
            System.out.println("Perímetro: " + figuras[indice].calcPerimetro());
            System.out.println("---------------------");   
        }
    }
}
