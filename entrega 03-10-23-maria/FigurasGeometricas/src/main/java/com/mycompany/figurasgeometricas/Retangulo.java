package com.mycompany.figurasgeometricas;

import java.util.HashSet;
import java.util.Set;

public class Retangulo extends Quadrilateros {
    
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        super.setLado1(base);
        super.setLado2(altura);
        super.setLado3(base);
        super.setLado4(altura);        
    }
    
    @Override
    public String nomeFigura(){
        String nome = "Retângulo";
        return nome;
    }
    
    @Override
    public double calcPerimetro() {
        double perimetro = this.getLado1() + this.getLado2() + this.getLado3() + this.getLado4();
        return perimetro;
    }

    @Override
    public double calcArea() {
        double area = base * altura;
        return area;
    }
    
}
