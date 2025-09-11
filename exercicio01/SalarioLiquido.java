/*6. Escreva um programa que receba o salário bruto de um funcionário e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.*/

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor do desconto do INSS: ");
        double inss = sc.nextDouble();

        double salarioLiquido = salarioBruto - inss;
        System.out.println("O salário líquido é: " + salarioLiquido);

        sc.close();
    }
}
