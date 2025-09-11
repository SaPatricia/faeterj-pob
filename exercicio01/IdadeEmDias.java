/*5. Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu. Considere um ano com 365 dias.*/

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int idade = sc.nextInt();

        int dias = idade * 365;
        System.out.println("Você já viveu aproximadamente " + dias + " dias.");

        sc.close();
    }
}
