/*5. Construir um programa em Java que leia o ano de nascimento de uma pessoa e que calcule a sua idade aproximada. Se a idade aproximada for maior ou igual a 16, 
imprimir “Apto a ser eleitor”, imprimir “Inapto a ser eleitor”, caso contrário.*/

import java.util.Scanner;

public class VerificaEleitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = 2025; 

        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        int idade = anoAtual - anoNasc;

        if (idade >= 16) {
            System.out.println("Apto a ser eleitor");
        } 
        else {
            System.out.println("Inapto a ser eleitor");
        }

        sc.close();
    }
}
