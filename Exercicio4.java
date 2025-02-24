
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdades = 0;
        int maioresDeIdade = 0;
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 20; i++) {
            // Lendo nome e idade
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = sc.next();
            
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = sc.nextInt();

            // Somando as idades
            somaIdades += idade;

            // Contando os maiores de idade
            if (idade >= 18) {
                maioresDeIdade++;
            }

            // Descobrindo a pessoa mais nova
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        // Calculando a média
        double mediaIdades = somaIdades / 20.0;

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Quantidade de maiores de idade: " + maioresDeIdade);
        System.out.println("Pessoa mais nova: " + nomeMaisNovo + " (" + idadeMaisNova + " anos)");

        sc.close();
    }

}
