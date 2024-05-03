package Exercicio6;

public class Relatorio {
    public static void imprimir(Funcionario[] funcionarios) {
        System.out.println("Relatório de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprimirInfo();
            System.out.println();
        }
    }
}