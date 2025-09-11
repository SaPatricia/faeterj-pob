/*3. Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.
Fórmula: F = (C × 9/5) + 32.*/

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
