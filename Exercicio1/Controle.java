package Exercicio1;

public class Controle {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João da Silva");
        gerente.setSenha(4231);
        gerente.setSalario(5000);
        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonificacao());

        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBeneficacoes());
    }
}