package Exercicio1;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public String getInfo(){
        return "/Funcionario";
    }

    public double getBonus(){
        return this.salario * 0.10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
