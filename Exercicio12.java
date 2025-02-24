
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio12 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // Calculando a diferença entre o maior e o menor
        int maior = Math.max(num1, num2); // Determina o maior número
        int menor = Math.min(num1, num2); // Determina o menor número
        int diferenca = maior - menor; // Calcula a diferença

        // Exibindo o resultado
        System.out.println("A diferença entre o maior e o menor número é: " + diferenca);

        sc.close();
    }
    
}
