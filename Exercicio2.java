
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio2 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedindo o número N
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int soma = 0;

        // Somando os números ímpares de 1 até N
        for (int i = 1; i <= n; i += 2) {
            soma += i;
        }

        // Exibindo o resultado
        System.out.println("A soma dos números ímpares de 1 até " + n + " é: " + soma);

        sc.close();
    }
}
    

