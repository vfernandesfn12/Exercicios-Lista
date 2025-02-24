
package com.iniciojava.exercicio1;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int faixa1 = 0, faixa2 = 0, faixa3 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();

            if (num >= 0 && num <= 100) {
                faixa1++;
            } else if (num >= 101 && num <= 200) {
                faixa2++;
            } else {
                faixa3++;
            }
        }

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.println("Números entre 0 e 100: " + faixa1);
        System.out.println("Números entre 101 e 200: " + faixa2);
        System.out.println("Números maiores que 200: " + faixa3);

        sc.close();
    }

}
