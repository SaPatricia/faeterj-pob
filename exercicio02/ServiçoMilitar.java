/*10. Construir um programa em Java que leia o ano de nascimento e o sexo de uma pessoa e que calcule a sua idade aproximada. Se o sexo for igual a “M” (masculino) 
e a idade for igual a 18, imprimir “Serviço Militar Obrigatório”, caso contrário, imprimir “Isento de Serviço Militar”.*/

import java.util.Scanner;

public class ServiçoMilitar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = 2025; 
        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        int idade = anoAtual - anoNasc;

        if (sexo == 'M' && idade == 18) {
            System.out.println("Serviço Militar Obrigatório");
        } 
        else {
            System.out.println("Isento de Serviço Militar");
        }

        sc.close();
    }
}
