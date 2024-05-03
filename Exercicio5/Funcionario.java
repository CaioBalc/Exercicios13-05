package Exercicio5;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected double renda;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = 1000.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRenda() {
        return renda;
    }

    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Renda: R$ " + renda);
    }

    protected void atualizarRenda(double aumentoPercentual) {
        renda += (renda * aumentoPercentual) / 100.0;
    }
}