package dominio;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor % 10 != 0) {
            System.out.println("Valor inválido. Apenas múltiplos de 10.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
