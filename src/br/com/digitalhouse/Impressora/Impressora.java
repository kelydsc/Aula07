package br.com.digitalhouse.Impressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimivels = new ArrayList<>();

    public void imprimirTudo(){

        for(int posicao = 0;posicao < imprimivels.size();posicao ++){

            imprimivels.get(posicao).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){

        imprimivels.add(umImprimivel);

    }
}
