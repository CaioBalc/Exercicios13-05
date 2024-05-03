package Exercicio4;

public class Controle {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1);
        funcionario1.imprimirInfo();

        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Ingridy", 2, "Escola A");
        funcionario2.imprimirInfo();

        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Ken", 3, "Escola B");
        funcionario3.imprimirInfo();

        FuncionarioGraduado funcionario4 = new FuncionarioGraduado("Caio", 4, "Escola C", "Universidade X");
        funcionario4.imprimirInfo();
    }
}
