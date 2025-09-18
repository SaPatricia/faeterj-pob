/*Exercício 5: Números primos em um intervalo

Descrição:
Escreva um programa que solicite dois números ao usuário e exiba todos os números primos no intervalo entre eles, 
utilizando um loop aninhado (for dentro de for).

Requisitos:
• O programa deve solicitar dois números inteiros positivos (início e fim do intervalo).
• Deve utilizar um loop externo para percorrer os números dentro do intervalo.
• Deve utilizar um loop interno para verificar se cada número é primo.
• Exibir apenas os números primos encontrados.*/

import java.util.Scanner;

public class IntervaloNumPrimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número inicial: ");
        int n1 = sc.nextInt();

        System.out.print("Entre com o número final: ");
        int n2 = sc.nextInt();

        System.out.println("Números primos no intervalo de " + n1 + " a " + n2 + ":");

        for (int i=n1; i<=n2; i++) {
            
            if (i >= 2) { 

                int j;

                for (j=2; j<i; j++) {

                    if (i%j == 0) {

                        break;
                    }
                }

                if (j == i) {
                    
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
