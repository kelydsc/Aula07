package br.com.digitalhouse.Voador;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private List<Voador> voadores = new ArrayList<>();

    public void voemTodos() {

        for (int posicao = 0; posicao < voadores.size(); posicao++) {

            voadores.get(posicao).voar();

        }
    }

    public void adicionarVoador(Voador umVoador) {

        voadores.add(umVoador);
    }
}
