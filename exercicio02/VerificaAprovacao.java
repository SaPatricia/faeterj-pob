/*8. Construir um programa em Java que leia a quantidade de disciplinas em que um aluno não alcançou a média. Se a quantidade for igual a 0, imprimir “Aprovado”, 
se a quantidade for menor ou igual a 5, imprimir “Recuperação” e se a quantidade for maior que 5, imprimir “Reprovado”.*/

import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de disciplinas em que não alcançou a média: ");
        int quant = sc.nextInt();

        if (quant == 0) {
            System.out.println("Aprovado");
        } 
        else { 
          if (quant <= 5) {
            System.out.println("Recuperação");
          } 
          else {
            System.out.println("Reprovado");
          }
        }
    }
}
