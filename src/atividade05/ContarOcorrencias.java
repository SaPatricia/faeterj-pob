import java.util.ArrayList;
import java.util.Scanner;

public class ContarOcorrencias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros.add(scanner.nextInt());
        }

        System.out.print("Digite o número que deseja verificar: ");
        int numeroProcurado = scanner.nextInt();

        int contador = 0;
        for (int n : numeros) {
            if (n == numeroProcurado) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroProcurado + " aparece " + contador + " vez(es) na lista.");

        scanner.close();
    }
}
