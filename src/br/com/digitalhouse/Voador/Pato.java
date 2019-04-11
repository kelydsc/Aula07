package br.com.digitalhouse.Voador;

public class Pato implements Voador {

    private int energia;

    public Pato(){

    }

    public Pato(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {

        energia = energia - 5;

        System.out.println("Estou voando como um pato: " + ", Energia: " + energia);
    }
}
