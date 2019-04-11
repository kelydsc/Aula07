package br.com.digitalhouse.Voador;

public class Aviao implements Voador {

    private int horasDeVoo;

    public Aviao(){

    }

    public Aviao(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {

        horasDeVoo = horasDeVoo + 13;

        System.out.println("Estou voando como um avião: " + ", Horas de voo: " + horasDeVoo);

    }
}
