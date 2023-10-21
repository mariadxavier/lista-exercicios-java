package com.mycompany.empresa;

public class Empresa {

    public static void main(String[] args) {
       Empregado empregadoTeste1 = new Empregado ("Roberto", "Silva", 1990.9);
       Empregado empregadoTeste2 = new Empregado ("Carla", "Santos", 2000.0);
       
       double salario = empregadoTeste1.getSalarioMensal() + (0.10 * empregadoTeste1.getSalarioMensal());
       double salario1 = empregadoTeste2.getSalarioMensal() + (0.10 * empregadoTeste2.getSalarioMensal());
       
       System.out.println("O novo salário do empregado é : " + salario);
       System.out.println("O novo salário do empregado é : " + salario1);
    }

    
}
