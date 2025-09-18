/*Exercício 5: Busca de Elemento em um Array

Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os  armazene em um array. Em seguida, o usuário 
deve digitar um número para buscar no array. O programa deve informar se o número está presente e em qual posição.

Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir "Número não encontrado.".*/

import java.util.Scanner;

public class BuscaNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorNum = new int[10]; 
        
        for (int i=0; i<10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorNum[i] = sc.nextInt();
        }

        
        System.out.print("\nDigite o número que deseja buscar: ");
        int busca = sc.nextInt();

        int posicao = -1; 

        
        for (int i = 0; i < 10; i++) {
            if (vetorNum[i] == busca) {
                posicao = i;
                break; 
            }
        }

        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } 
        else {
            System.out.println("Número não encontrado.");
        }

        sc.close();
    }
}

