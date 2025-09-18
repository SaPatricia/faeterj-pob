/*Exercício 2: Tabuada de um número

Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10, utilizando um loop while.

Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração.*/

import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print ("Digite um número: ");
        int numero = sc.nextInt();
        
        int multiplicacao = 0;

        System.out.println ("Tabuada: ");

        int i = 1;
        while (i <= 10) {

            multiplicacao = i*numero;
            System.out.println (i + " * " + numero + " = " + multiplicacao);

            ++;
        }

        sc.close(); 
    }
}
