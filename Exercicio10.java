
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio10 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o número de identificação do aluno: ");
        int idAluno = sc.nextInt();

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double ME = sc.nextDouble();

        // Cálculo da média de aproveitamento
        double MA = (nota1 + (nota2 * 2) + (nota3 * 3) + ME) / 7;

        // Atribuição do conceito
        String conceito;
        if (MA >= 90) {
            conceito = "A";
        } else if (MA >= 75) {
            conceito = "B";
        } else if (MA >= 60) {
            conceito = "C";
        } else if (MA >= 40) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Exibição dos resultados
        System.out.println("\nNúmero de identificação: " + idAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média dos exercícios: " + ME);
        System.out.println("Média de Aproveitamento (MA): " + MA);
        System.out.println("Conceito: " + conceito);

        // Aprovação ou Reprovação
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}    
    

