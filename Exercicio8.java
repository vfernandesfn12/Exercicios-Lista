
package com.iniciojava.exercicio1;

import java.util.Scanner;
public class Exercicio8 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            int num = sc.nextInt();

            if (num < 0) {
                break; // Encerra o loop quando o número negativo é digitado
            }

            // Contagem nos intervalos
            if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num >= 26 && num <= 50) {
                intervalo2++;
            } else if (num >= 51 && num <= 75) {
                intervalo3++;
            } else if (num >= 76 && num <= 100) {
                intervalo4++;
            }
        }

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.println("Intervalo [0-25]: " + intervalo1 + " número(s)");
        System.out.println("Intervalo [26-50]: " + intervalo2 + " número(s)");
        System.out.println("Intervalo [51-75]: " + intervalo3 + " número(s)");
        System.out.println("Intervalo [76-100]: " + intervalo4 + " número(s)");

        sc.close();
    }

}
