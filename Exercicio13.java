
package com.iniciojava.exercicio1;

import java.util.Scanner;

public class Exercicio13 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do código
        System.out.print("Digite o código (1, 2 ou 3): ");
        int codigo = sc.nextInt();

        // Verificando se o código é válido
        if (codigo == 1) {
            System.out.println("um");
        } else if (codigo == 2) {
            System.out.println("dois");
        } else if (codigo == 3) {
            System.out.println("três");
        } else {
            System.out.println("Código inválido");
        }

        sc.close();
    }
    
}
