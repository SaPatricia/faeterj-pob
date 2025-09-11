/*8. Crie um programa que leia o raio de uma esfera e calcule o seu volume.
Fórmula: V = (4/3) * π * raio³.
Use π = 3.14159.*/

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4.0/3.0) * 3.14159 * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);

        sc.close();
    }
}
