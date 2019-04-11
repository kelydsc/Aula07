package br.com.digitalhouse.Voador;

public class SuperHomem implements Voador {

    private int experienciaDeVoo;

    public  SuperHomem(){

    }

    public SuperHomem(int experienciaDeVoo) {
        this.experienciaDeVoo = experienciaDeVoo;
    }

    public int getExperienciaDeVoo() {
        return experienciaDeVoo;
    }

    public void setExperienciaDeVoo(int experienciaDeVoo) {
        this.experienciaDeVoo = experienciaDeVoo;
    }

    @Override
    public void voar() {

        experienciaDeVoo = experienciaDeVoo + 3;
        System.out.println("Estou voando como um campeão: " + ",Experiência de voo: " + experienciaDeVoo);

    }
}
