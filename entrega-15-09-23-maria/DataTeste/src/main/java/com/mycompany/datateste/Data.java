package com.mycompany.datateste;


public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String dataDisplay () {
        if(this.mes < 10) {
            return "Data: " + this.getDia() + "/0" + this.getMes() + "/" + this.getAno();
        }
        else {
            return "Data: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno();
        }
        
}
    
}

