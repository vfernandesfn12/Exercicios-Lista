
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        // Pedindo um número positivo
        do {
            System.out.print("Digite um número inteiro positivo: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Número inválido! Digite um número positivo.");
            }
        } while (num < 0);

        // Calculando o fatorial
        long fatorial = 1; 
        for (int i = num; i > 1; i--) {
            fatorial *= i;
        }

        // Exibindo o resultado
        System.out.println("O fatorial de " + num + " é: " + fatorial);

        sc.close();
    }
}
