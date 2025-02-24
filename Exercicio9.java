
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preço normal do produto
        System.out.print("Digite o preço normal do produto: R$ ");
        double preco = sc.nextDouble();

        // Condição de pagamento
        System.out.println("\nEscolha a condição de pagamento:");
        System.out.println("1 - À vista em dinheiro ou cheque (10% de desconto)");
        System.out.println("2 - À vista no cartão de crédito (15% de desconto)");
        System.out.println("3 - Em duas vezes (preço normal, sem juros)");
        System.out.println("4 - Em duas vezes (preço normal + 10% de juros)");
        System.out.print("Digite o código da condição escolhida: ");
        int condicao = sc.nextInt();

        double totalAPagar = 0;

        // Verifica a condição de pagamento e calcula o valor total
        switch (condicao) {
            case 1:
                totalAPagar = preco * 0.90; // 10% de desconto
                break;
            case 2:
                totalAPagar = preco * 0.85; // 15% de desconto
                break;
            case 3:
                totalAPagar = preco; // Preço normal
                break;
            case 4:
                totalAPagar = preco * 1.10; // 10% de juros
                break;
            default:
                System.out.println("Código de condição inválido!");
                sc.close();
                return; // Encerra o programa se a condição for inválida
        }

        // Exibe o valor a ser pago
        System.out.println("\nValor a ser pago: R$ " + totalAPagar);

        sc.close();
    }
}

