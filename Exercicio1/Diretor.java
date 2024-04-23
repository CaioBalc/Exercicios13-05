package Exercicio1;

public class Diretor extends Gerente{
    int matricula;

    @Override
    public String getInfo(){
        super.getInfo() + "/Diretor";
    }

    @Override
    public double getBonus(){
        return this.getSalario() * 0.20;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
