package controle;

import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Categoria (A, B ou C): ");
        String categoria = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);

        double salarioFinal = funcionario.calcularSalarioFinal();
        System.out.println("Salário final: " + salarioFinal);

        scanner.close();
    }
}
