package controle;

import dominio.Elevador;
import java.util.Scanner;

public class SimuladorElevador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o total de andares do prédio: ");
        int totalAndares = scanner.nextInt();

        Elevador elevador = new Elevador(totalAndares);

        int opcao;

        do {
            System.out.println("\n1 - Subir");
            System.out.println("2 - Descer");
            System.out.println("3 - Exibir andar atual");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                elevador.subir();
            } else if (opcao == 2) {
                elevador.descer();
            } else if (opcao == 3) {
                elevador.exibirAndar();
            }

        } while (opcao != 0);

        scanner.close();
    }
}
