/*Exercício 4: Contagem de Números Pares em um Array

Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em um array. O programa deve contar 
e exibir a quantidade de números pares no array.

Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números são pares.
• Exibir a quantidade de números pares encontrados.*/

import java.util.Scanner;

public class ContagemNumPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorNum = new int[8]; 
        int pares = 0;

        
        for (int i=0; i<8; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetorNum[i] = sc.nextInt();

            
            if (vetorNum[i]%2 == 0) {
                pares++;
            }
        }

        
        System.out.println("\nQuantidade de números pares: " + pares);

        sc.close();
    }
}

