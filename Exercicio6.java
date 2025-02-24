
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio6 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int num = sc.nextInt();

            if (num < 0) {
                break; // Encerra o loop quando um número negativo for digitado
            }

            soma += num; // Soma os números positivos
        }

        // Exibindo o resultado
        System.out.println("A soma dos números digitados é: " + soma);

        sc.close();
    }
 
}
