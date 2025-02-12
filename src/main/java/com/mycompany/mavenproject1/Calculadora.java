/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

class Calculadora2Inputs {
    public int n1;
    public int n2;
}

public class Calculadora {
    
    public static Calculadora2Inputs Capture2input() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Escolha o primeiro numero: ");
        int opt1 = sc1.nextInt();
        System.out.println("Escolha o segundo numero: ");
        int opt2 = sc1.nextInt();
        System.out.flush();
        Calculadora2Inputs inputs = new Calculadora2Inputs();
        inputs.n1 = opt1;
        inputs.n2 = opt2;
        return inputs;
    }
    
    public static int soma(Calculadora2Inputs inputs) {
        int s;
        s = inputs.n1 + inputs.n2;
        System.out.printf("Resultado da soma: %d\n", s);
        return s;
    }
    
    public static int subtracao(Calculadora2Inputs inputs) {
        int s;
        s = inputs.n1 - inputs.n2;
        System.out.printf("Resultado da subtração: %d\n", s);
        return s;
    }
    
    public static int multiplicacao(Calculadora2Inputs inputs) {
        int s;
        s = inputs.n1 * inputs.n2;
        System.out.printf("Resultado da multiplicação: %d\n", s);
        return s;
    }
    
    public static float divisao(Calculadora2Inputs inputs) {
        float s;
        s = inputs.n1 / inputs.n2;
        System.out.printf("Resultado da multiplicação: %f\n", s);
        return s;
    }
}
