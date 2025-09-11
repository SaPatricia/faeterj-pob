/*10. Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.
Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)*/

import java.util.Scanner;

public class CalculoDistanciaPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Digite y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Digite y2: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os pontos é: " + distancia);

        sc.close();
    }
}
