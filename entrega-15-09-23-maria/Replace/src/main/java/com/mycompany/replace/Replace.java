package com.mycompany.replace;

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        
        Scanner n =  new Scanner(System.in);
        System.out.println(" Insira uma frase: ");
        
        String frase = n.nextLine();
        
        String frase2 = frase.replace("1", "5");
        System.out.println("" + frase2); 
    }
}
