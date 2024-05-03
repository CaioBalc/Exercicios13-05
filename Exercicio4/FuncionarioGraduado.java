package Exercicio4;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Universidade: " + universidade);
    }
}
