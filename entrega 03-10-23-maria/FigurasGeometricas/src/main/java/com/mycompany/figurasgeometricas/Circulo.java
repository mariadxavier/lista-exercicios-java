package com.mycompany.figurasgeometricas;

public class Circulo implements Figura {
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
       
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }        
    
    @Override
    public String nomeFigura(){
        String nome = "Círculo";
        return nome;
    }
    
    @Override
    public double calcPerimetro() {
        double perimetro = 2 * 3.14 * raio;
        return perimetro;
    }

    @Override
    public double calcArea() {
        double area = 3.14 * (raio * raio);
        return area;
    }
    
}
