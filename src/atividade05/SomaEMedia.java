import java.util.ArrayList;
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double entrada = 0;

        while (entrada != -1) {
            System.out.print("Digite um número (ou -1 para sair): ");
            entrada = scanner.nextDouble();
            if (entrada != -1) {
                numeros.add(entrada);
            }
        }

        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }

        double media = numeros.size() > 0 ? soma / numeros.size() : 0;

        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
