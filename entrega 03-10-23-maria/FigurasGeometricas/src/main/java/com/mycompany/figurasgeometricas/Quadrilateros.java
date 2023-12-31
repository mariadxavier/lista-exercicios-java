package com.mycompany.figurasgeometricas;

public abstract class Quadrilateros implements Figura {

    private double lado1,lado2, lado3, lado4;

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }
    
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getLado4() {
        return lado4;
    }  
}
