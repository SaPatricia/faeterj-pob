/*7. Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.
Fórmulas: Área = base × altura
Perímetro = 2 × (base + altura).*/

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        sc.close();
    }
}
