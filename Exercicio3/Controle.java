package Exercicio3;

public class Controle {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.println("Pessoas:");
        p1.setNome("Nome1");
        p1.setEndereco("Endereço1");
        p1.setTelefone("Telefone1");
        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());

        Pessoa p2 = new Pessoa();
        p2.setNome("\nNome2");
        p2.setEndereco("Endereço2");
        p2.setTelefone("Telefone2");
        System.out.println(p2.getNome());
        System.out.println(p2.getEndereco());
        System.out.println(p2.getTelefone());

        Fornecedor f = new Fornecedor();
        System.out.println("\nFornecedores:");
        f.setNome("Fornecedor 1");
        f.setEndereco("Endereço do Fornecedor 1");
        f.setTelefone("Telefone do Fornecedor 1");
        f.setValorCredito(1000.0);
        f.setValorDivida(300.0);
        System.out.println("Nome: " + f.getNome());
        System.out.println("Endereço: " + f.getEndereco());
        System.out.println("Telefone: " + f.getTelefone());
        System.out.println("Saldo: " + f.obterSaldo());
    }
}