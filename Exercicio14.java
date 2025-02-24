
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio14 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos lados do triângulo
        System.out.print("Digite o valor do lado A: ");
        double A = sc.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double B = sc.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double C = sc.nextDouble();

        // Verificar se os lados formam um triângulo
        if (A < B + C && B < A + C && C < A + B) {
            // Verificar o tipo de triângulo
            if (A == B && B == C) {
                System.out.println("O triângulo é equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        sc.close();
    }
    
}
