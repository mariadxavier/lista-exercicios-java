package com.mycompany.figurasgeometricas;

public class Quadrado extends Quadrilateros {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }  

    public double getLado() {
        return lado;
    }
      
    @Override
    public String nomeFigura(){
        String nome = "Quadrado";
        return nome;
    }
    
    @Override
    public double calcPerimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public double calcArea() {
        double area = lado * lado;
        return area;
    }

}
