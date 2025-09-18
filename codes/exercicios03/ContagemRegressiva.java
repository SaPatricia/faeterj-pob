/*Exercício 3: Contagem regressiva usando do-while

Descrição:
Crie um programa que solicite um número ao usuário e faça uma contagem regressiva até 0, utilizando um loop do-while.

Requisitos:
• O programa deve solicitar um número inteiro positivo ao usuário.
• Utilizar um contador decrescente para reduzir o valor até 0.
• Exibir os números da contagem regressiva um por um.*/

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println ("Contagem Regressiva: ");

        int i = numero;
        do {

          System.out.println (i);

          i--;
        } while (i >= 0);

        sc.close(); 
    }
}
