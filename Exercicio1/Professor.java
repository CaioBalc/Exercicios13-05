package Exercicio1;

public class Professor extends Empregado{
    private int horasDeAula;

    @Override
    String getInfo() {
        return super.getInfo() + " horas de aula: " + this.horasDeAula;
    }

    @Override
    double getGastos() {
        return this.salario * this.horasDeAula * 10;
    }
}