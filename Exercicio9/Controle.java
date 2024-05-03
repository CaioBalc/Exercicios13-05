package Exercicio9;

public class Controle {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Animal cachorro = new Cachorro("Astolfo", 5);
        Animal cavalo = new Cavalo("Geraldo", 9);
        Animal preguica = new Preguica("Dorminhoco", 2);

        System.out.println("Examinando o cachorro:");
        veterinario.examinar(cachorro);

        System.out.println("\nExaminando o cavalo:");
        veterinario.examinar(cavalo);

        System.out.println("\nExaminando a preguiça:");
        veterinario.examinar(preguica);
    }
}
