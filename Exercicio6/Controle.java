package Exercicio6;

public class Controle {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1);
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Ingridy", 2, "Escola A");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Ken", 3, "Escola B");
        FuncionarioGraduado funcionario4 = new FuncionarioGraduado("Caio", 4, "Escola C", "Universidade X");

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3, funcionario4};

        Relatorio.imprimir(funcionarios);
    }
}