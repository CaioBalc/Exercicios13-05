package Exercicio1;

public class ControleDeBonificacoes {
    private double totalDeBeneficacoes = 0;

    public void registra(Funcionario funcionario) {
        this.totalDeBeneficacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBeneficacoes() {
        return this.totalDeBeneficacoes;
    }
}