package br.com.digitalhouse.Impressora;

public class Contrato extends Arquivos {

    public Contrato() {
    }

    public Contrato(String nomeContrato, String tipoContrato) {
        super(nomeContrato, tipoContrato);
    }

    @Override
    public void imprimir() {

        System.out.println("Sou um contrato muito legal, " + "nome do contrato: " + getNomeContrato() +
                            ",tipo do contrato: " + getTipoContrato());
    }
}
