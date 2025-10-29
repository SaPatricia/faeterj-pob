import java.util.ArrayList;
import java.util.Scanner;

public class ExibirNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int opcao = 1;

        while (opcao == 1) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("Deseja adicionar outro número? (1 - Sim / 0 - Não): ");
            opcao = scanner.nextInt();
        }

        System.out.println("\nNúmeros digitados:");
        for (int n : numeros) {
            System.out.println(n);
        }

        scanner.close();
    }
}
