package br.com.digitalhouse.Voador;

public class Main {

    public static void main(String[] args) {

        TorreDeControle torreDeControle = new TorreDeControle();

        Pato pato = new Pato(10);
        torreDeControle.adicionarVoador(pato);

        Aviao aviao = new Aviao(20);
        torreDeControle.adicionarVoador(aviao);

        SuperHomem superHomem = new SuperHomem(10);
        torreDeControle.adicionarVoador(superHomem);

        torreDeControle.voemTodos();

    }
}
