package controle;

import dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("\n1 - Sacar");
            System.out.println("2 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Valor do saque: ");
                double valor = scanner.nextDouble();
                caixa.sacar(valor);
            } else if (opcao == 2) {
                caixa.exibirSaldo();
            }
        }

        scanner.close();
    }
}
