
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio11 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do peso e altura
        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibindo o IMC e a condição
        System.out.println("\nIMC: " + imc);

        // Condições do IMC
        if (imc < 18.5) {
            System.out.println("Condição: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Condição: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Condição: Acima do peso");
        } else {
            System.out.println("Condição: Obeso");
        }

        sc.close();
    }
}
