package dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String categoria;

    public Funcionario(String nome, double salarioBase, String categoria) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
    }

    public double calcularSalarioFinal() {
        double salarioFinal = salarioBase;
        switch (categoria.toUpperCase()) {
            case "A":
                salarioFinal += salarioBase * 0.20;
                break;
            case "B":
                salarioFinal += salarioBase * 0.10;
                break;
            case "C":
                break;
        }
        return salarioFinal;
    }
}
