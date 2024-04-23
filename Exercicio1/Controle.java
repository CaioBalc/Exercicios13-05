package Exercicio1;

public class Controle {
    public static void main(String[] args) {
        Gerente gen = new Gerente();
        gen.setNome("Gerente geral");
        gen.setSenha("dff");
        gen.setSalario(10000);
        System.out.println(gen.getBonus());
        System.out.println(gen.getNome());

        Funcionario func = new Funcionario();
        func.setCpf("123456789-99");
        func.setSalario(5000);
        System.out.println(func.getBonus());

        Diretor dir = new Diretor();
        dir.setMatricula(123);
        dir.setSalario(15000);

        System.out.println(dir.getInfo());
    }
}
