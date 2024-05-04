package Exercicio10;

public class Zoologico {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();
        zoologico.verAnimal();
    }

    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
        String[] animais = {"Capivara", "Chimpanzé", "Crocodilo", "Elefante", "Girafa", "Gorila", "Hipopótamo", "Leão", "Papagaio", "Veado"};

        for (int i = 0; i < animais.length; i++) {
            jaulas[i] = new Animal(animais[i], getSom(animais[i]));
        }
    }

    private String getSom(String animal) {
        switch (animal) {
            case "Capivara":
                return "Ahn";
            case "Chimpanzé":
                return "Urrú";
            case "Crocodilo":
                return "Roar";
            case "Elefante":
                return "Fuumm";
            case "Girafa":
                return "Iiirrrrí";
            case "Gorila":
                return "Rúrú";
            case "Hipopótamo":
                return "Roonn";
            case "Leão":
                return "Groar";
            case "Papagaio":
                return "Java é legal";
            case "Veado":
                return "Inhóóó";
            default:
                return "";
        }
    }

    public void verAnimal() {
        for (Animal animal : jaulas) {
            System.out.print("O som do animal " + animal.getNome() + " é: ");
            animal.emitirSom();
            
            if (!animal.getNome().equals("Papagaio")) {
                System.out.println("O animal está correndo!");
            }
        }
    }
}