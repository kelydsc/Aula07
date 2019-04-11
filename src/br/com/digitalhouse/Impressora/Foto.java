package br.com.digitalhouse.Impressora;

public class Foto extends Arquivos {

    public Foto() {
    }

    public Foto(String nomeContrato, String tipoContrato) {
        super(nomeContrato, tipoContrato);
    }

    @Override
    public void imprimir() {

        System.out.println("Sou selfie, " + "nome da foto: " + getNomeContrato() +
                " ,tipo da foto: " + getTipoContrato());
    }
}
