/*Exercício 1: Maior e Menor Valor em um Array

Descrição:
Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em um array. Após isso, o programa deve exibir o maior e o menor número do array.

Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor valor.
• Exibir o maior e o menor número armazenados no array.*/

import java.util.Scanner;

public class MaiorMenorNumArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorInt = new int[5];  

        for (int i=0; i<5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            vetorInt[i] = sc.nextInt();
        }

        int maior = vetorInt [0];
        int menor = vetorInt [0];

        for (int i=1; i<5; i++) {
            if (vetorInt[i] > maior) {
                maior = vetorInt[i];
            }
            if (vetorInt[i] < menor) {
                menor =  vetorInt[i];
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
