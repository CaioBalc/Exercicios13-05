package Exercicio1;

public class Gerente extends Funcionario{
    String senha;
    private int numFuncGen;

    @Override
    public String getInfo(){
        super.getInfo() + "/Gerente";
    }

    @Override
    public double getBonus(){
        return super.getBonus() + this.getSalario() * 0.15;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
