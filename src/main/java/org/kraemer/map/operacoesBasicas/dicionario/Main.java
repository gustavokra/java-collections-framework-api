package org.kraemer.map.operacoesBasicas.dicionario;

public class Main {

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Remover", "Ato de retirar.");
        dicionario.adicionarPalavra("Interar", "Ato passar por cada elemento de uma coleção.");
        dicionario.adicionarPalavra("Debugar", "Ato de analisar uma thread em tempo real.");

        dicionario.removerPalavra("Remover");

        dicionario.exibirPalabras();

        dicionario.pesquisarPorPalavra("Debugar");
    }

}
