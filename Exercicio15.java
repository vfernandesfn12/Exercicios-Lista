
package com.iniciojava.exercicio1;
import java.util.Scanner;

public class Exercicio15 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // Verificando qual é o maior, o menor ou se são iguais
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
            System.out.println("O menor número é: " + num2);
        } else if (num1 < num2) {
            System.out.println("O maior número é: " + num2);
            System.out.println("O menor número é: " + num1);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        sc.close();
    }
    
}
