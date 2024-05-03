package Exercicio9;

public class Veterinario {
    public void examinar(Animal animal){
        System.out.println("O veterinário está examinando " + animal.getNome());
        animal.emitirSom();
    }
}
