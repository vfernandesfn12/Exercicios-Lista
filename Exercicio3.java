
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio3 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedindo o número ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int num = sc.nextInt();

        int soma = 0;

        // Somando os divisores próprios (exceto ele mesmo)
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }

        // Verificando se é perfeito
        if (soma == num) {
            System.out.println(num + " é um número perfeito!");
        } else {
            System.out.println(num + " NÃO é um número perfeito.");
        }

        sc.close();
    }
}

