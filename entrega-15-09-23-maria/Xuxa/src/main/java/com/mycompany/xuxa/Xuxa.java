package com.mycompany.xuxa;

import java.util.Scanner;


public class Xuxa {

    public static void main(String[] args) {
      Scanner n =  new Scanner(System.in);
      int patinhos;
      
      System.out.println("Insira o número de patinhos da música: ");
      patinhos = n.nextInt();
      int patinhosIniciais = patinhos;
       
       
      while(patinhos > 0){
          System.out.println(" " + patinhos + " patinhos foram passear \n Além das montanhas \n Para brincar \n A mamãe gritou: quá quá quá quá");
          patinhos--;         
          
          if(patinhos == 1) {
              System.out.println(" Mas só "+ patinhos+" patinho voltou de lá. \n");
          }else if(patinhos == 0){
              System.out.println(" Mas nenhum patinho voltou de lá. \n");
          }else {
              System.out.println(" Mas só "+ patinhos+" patinhos voltaram de lá.  \n");
          } 
      
          
      } 
    
        
      
      System.out.println(" A mamãe patinha foi procurar \n Além das montanhas \n Na beira do mar \n A mamãe gritou: quá quá quá quá \n E os "+ patinhosIniciais + " voltaram de lá.");
      
      
      
      
      
    }
}
