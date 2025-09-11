/*3. Construir um programa em Java que leia 2 números inteiros e imprima o maior número lido.*/

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Maior número: " + n1);
        } 
        else {
            System.out.println("Maior número: " + n2);
        }
    }
}
