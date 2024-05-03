package Exercicio5;

public class Controle {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1);
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Ingridy", 2, "Escola A");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Ken", 3, "Escola B");
        FuncionarioGraduado funcionario4 = new FuncionarioGraduado("Caio", 4, "Escola C", "Universidade X");

        funcionario1.imprimirInfo();
        System.out.println();
        funcionario2.imprimirInfo();
        System.out.println();
        funcionario3.imprimirInfo();
        System.out.println();
        funcionario4.imprimirInfo();
    }
}
