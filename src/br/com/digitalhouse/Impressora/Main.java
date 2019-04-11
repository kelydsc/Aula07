package br.com.digitalhouse.Impressora;

public class Main {

    public static void main(String[] args) {

        Impressora impressora = new Impressora();

        Contrato contrato = new Contrato("Locação","Residencial");
        impressora.adicionarImprimivel(contrato);

        Foto foto = new Foto("Balada", "Cultural");
        impressora.adicionarImprimivel(foto);

        Documento documento = new Documento("Ata","Reunião");
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();

    }
}
