
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, maiorIdade = 0;

        while (true) {
            System.out.print("Digite a idade da pessoa (-1 para sair): ");
            int idade = sc.nextInt();

            if (idade == -1) {
                break; // Encerra o loop quando o usuário digitar -1
            }

            // Contagem por faixa etária
            if (idade >= 0 && idade <= 12) {
                faixa1++;
            } else if (idade >= 13 && idade <= 19) {
                faixa2++;
            } else if (idade >= 20 && idade <= 59) {
                faixa3++;
            } else if (idade >= 60) {
                faixa4++;
            }

            // Verifica a maior idade digitada
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.println("Crianças (0 a 12 anos): " + faixa1);
        System.out.println("Adolescentes (13 a 19 anos): " + faixa2);
        System.out.println("Adultos (20 a 59 anos): " + faixa3);
        System.out.println("Idosos (60+ anos): " + faixa4);
        System.out.println("A maior idade informada foi: " + maiorIdade);

        sc.close();
    }

}
