/*11. Construir um programa em Java que leia os valores de A, B e C e que imprima “Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, 
caso contrário, imprimir “Forma triângulo”.*/

import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Não forma triângulo");
        } 
        else {
            System.out.println("Forma triângulo");
        }
    }
}
