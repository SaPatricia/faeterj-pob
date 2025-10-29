package controle;

import dominio.ContaBancaria;
import java.util.Scanner;

public class GerenciadorConta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Valor do depósito: ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (opcao == 2) {
                System.out.print("Valor do saque: ");
                double valor = scanner.nextDouble();
                conta.sacar(valor);
            } else if (opcao == 3) {
                conta.exibirSaldo();
            }
        }

        scanner.close();
    }
}
