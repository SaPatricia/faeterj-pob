/*4. Construir um programa em Java que leia um número inteiro e imprima “PAR”, se o número for par e imprima “ÍMPAR”, se o número for ímpar.*/

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }
}
