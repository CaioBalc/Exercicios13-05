package Exercicio7;

public class Controle {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println("\nCachorro:");
        cachorro.setNome("Astolfo");
        cachorro.setIdade(5);
        cachorro.setSom("Roof!");
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        System.out.println(cachorro.getSom());
        cachorro.correr();

        Cavalo cavalo = new Cavalo();
        System.out.println("\nCavalo:");
        cavalo.setNome("Geraldo");
        cavalo.setIdade(9);
        cavalo.setSom("Irinhó!");
        System.out.println(cavalo.getNome());
        System.out.println(cavalo.getIdade());
        System.out.println(cavalo.getSom());
        cavalo.correr();

        Preguica preguica = new Preguica();
        System.out.println("\nPreguiça:");
        preguica.setNome("Dorminhoco");
        preguica.setIdade(2);
        preguica.setSom("Rrrr!");
        System.out.println(preguica.getNome());
        System.out.println(preguica.getIdade());
        System.out.println(preguica.getSom());
        preguica.subirArvore();
    }
}
