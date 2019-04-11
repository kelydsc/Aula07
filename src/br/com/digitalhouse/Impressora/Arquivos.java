package br.com.digitalhouse.Impressora;

public class Arquivos implements Imprimivel{

    private String nomeContrato;
    private String tipoContrato;

    public Arquivos(){

    }

    public Arquivos(String nomeContrato, String tipoContrato) {
        this.nomeContrato = nomeContrato;
        this.tipoContrato = tipoContrato;
    }

    public String getNomeContrato() {
        return nomeContrato;
    }

    public void setNomeContrato(String nomeContrato) {
        this.nomeContrato = nomeContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void imprimir() {

    }
}
