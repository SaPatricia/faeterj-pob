import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int opcao = 1;

        while (opcao == 1) {
            System.out.print("Digite um número: ");
            numeros.add(scanner.nextInt());

            System.out.print("Deseja adicionar outro número? (1 - Sim / 0 - Não): ");
            opcao = scanner.nextInt();
        }

        Collections.sort(numeros);

        System.out.println("\nLista ordenada:");
        for (int n : numeros) {
            System.out.println(n);
        }

        scanner.close();
    }
}
