/*Exercício 3: Inversão de Elementos de um Array

Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene em um array. Em seguida, exiba os números 
na ordem inversa à de entrada.

Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa.*/

import java.util.Scanner;

public class InversaoElementos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[6]; 
      
        for (int i=0; i<6; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i=5; i>=0; i--) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}

