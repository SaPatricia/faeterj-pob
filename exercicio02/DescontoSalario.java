/*6. Construir um programa em Java que leia o salário bruto e o sexo de um funcionário. Se o sexo for “M” (masculino), calcular, armazenar e imprimir um 
desconto de 5% e o salário líquido, caso contrário, calcular, armazenar e imprimir um desconto de 3% e o salário líquido.*/

import java.util.Scanner;

public class DescontoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        double desconto;
        if (sexo == 'M') {
            desconto = salario * 0.05;
        } 
        else { 
            desconto = salario * 0.03;
        }

        double salarioLiquido = salario - desconto;
        System.out.println("Desconto: " + desconto);
        System.out.println("Salário líquido: " + salarioLiquido);

        sc.close();
    }
}

