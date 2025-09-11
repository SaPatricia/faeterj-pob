/*9. Construir um programa em Java que leia as 2 notas de um aluno e que calcule, armazene e imprima a média. Se a média for maior ou igual a 7, 
imprimir “Aprovado”, caso contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e imprimir uma nova média. 
Se a nova média for maior ou igual a 6, imprimir “Aprovado”, caso contrário, imprimir “Reprovado”.*/

import java.util.Scanner;

public class NovaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;
        if (media >= 7) {
            System.out.println("Aprovado");
        } 
        else {
            System.out.print("Digite a terceira nota: ");
            double n3 = sc.nextDouble();
            double novaMedia = (n1 + n2 + (n3 * 2)) / 4;
          if (novaMedia >= 6) {
                System.out.println("Aprovado");
          } 
          else {
                System.out.println("Reprovado");
          }
        }
    }
}
