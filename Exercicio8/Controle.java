package Exercicio8;

public class Controle {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Astolfo", 5);
        Animal cavalo = new Cavalo("Geraldo", 9);
        Animal preguica = new Preguica("Dorminhoco", 2);

        System.out.println("Cachorro:");
        cachorro.dados();

        System.out.println("\nCavalo:");
        cavalo.dados();

        System.out.println("\nPreguiça:");
        preguica.dados();
    }
}