package Exercicio1;

public class Empregado {
    String nome;
    double salario;

    String getInfo() {
        return "nome: " + this.nome +
        " com salário "  + this.salario;
    }

    double getGastos() {
        return this.getSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}