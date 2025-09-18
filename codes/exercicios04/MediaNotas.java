/*Exercício 2: Cálculo da Média de Notas

Descrição:
Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as  em um array. Depois, o programa deve calcular e exibir a média das notas.

Requisitos:
• Criar um array de tamanho 4 para armazenar as notas.
• Utilizar um loop for para somar todas as notas e calcular a média.
• Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir "Reprovado".*/

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double[] notas = new double[4];
        double soma = 0;

        for (int i=0; i<4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];         
        }

        double media = soma / 4; 

        System.out.println("Média das notas: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } 
        else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}

