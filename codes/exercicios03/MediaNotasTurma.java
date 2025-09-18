/*Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde o usuário informe quantos alunos há na turma 
e suas respectivas notas.

Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.*/

import java.util.Scanner;

public class MediaNotasTurma {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Quantidade de alunos: ");
        int quantAlunos = sc.nextInt();

        double soma = 0;

        for(int i=1; i<=quantAlunos; i++){

            System.out.println ("Nota do " + i + " aluno: ");
            double notas = sc.nextDouble ();
            soma+=notas;
        }

        double media = soma/quantAlunos;

        System.out.println ("A média das notas da turma é: " + media);

        sc.close(); 
    }
