package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {
    public static void menuPrint() {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("/=== Menu ===/");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multi");
        System.out.println("[4] Divisão");
        System.out.println("[0] Sair");
        System.out.println("Escolha uma opção: ");
        
        int opt = sc1.nextInt();
        
        System.out.flush();
           
        switch(opt) {
            case 0:
                System.exit(0);
               break;
            case 1: 
                Calculadora.soma(Calculadora.Capture2input());
                break;
            case 2: 
                Calculadora.subtracao(Calculadora.Capture2input());
                break;
            case 3: 
                Calculadora.multiplicacao(Calculadora.Capture2input());
                break;
            case 4: 
                Calculadora.divisao(Calculadora.Capture2input());
                break;
            default:
                menuPrint();
                break;
        }
        menuPrint();
    }
    
    
    public static void main(String[] args) {       
        menuPrint();
    }
}
