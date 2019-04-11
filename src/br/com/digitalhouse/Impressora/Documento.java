package br.com.digitalhouse.Impressora;

public class Documento extends Arquivos {

    public Documento() {
    }

    public Documento(String nomeContrato, String tipoContrato) {
        super(nomeContrato, tipoContrato);
    }

    @Override
    public void imprimir() {

        System.out.println("Sou um documento do Word, " + "nome do documento: " + getNomeContrato() +
                " ,tipo do documento: " + getTipoContrato());

    }
}
