import java.util.ArrayList;
import java.util.Scanner;

public class RemoverNome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i=0; i<5; i++) {
            System.out.print("Digite um nome: ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("Digite o nome a ser removido: ");
        String nomeRemover = scanner.nextLine();

        if (nomes.remove(nomeRemover)) {
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        System.out.println("\nLista atual:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
