/*9. Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$).*/

import java.util.Scanner;

public class ConverteMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double reais = sc.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        double dolares = reais / cotacao;
        System.out.println("O valor em dólares é: US$ " + dolares);

        sc.close();
    }
}
