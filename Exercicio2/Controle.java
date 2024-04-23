public class Controle {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Nome1");
        p1.setEndereco("Endereço1");
        p1.setTelefone("Telefone1");
        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getTelefone());

        Pessoa p2 = new Pessoa();
        p2.setNome("Nome2");
        p2.setEndereco("Endereço2");
        p2.setTelefone("Telefone2");
        System.out.println(p2.getNome());
        System.out.println(p2.getEndereco());
        System.out.println(p2.getTelefone());
    }
}
