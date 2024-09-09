package org.kraemer.map.pesquisa.contagemPalavras;

public class Main {

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra1", 1);
        contagemPalavras.adicionarPalavra("Palavra2", 2);
        contagemPalavras.adicionarPalavra("Palavra3", 3);
        contagemPalavras.adicionarPalavra("Palavra4", 4);
        System.out.println("Exibir contagem de palavras:");
        contagemPalavras.exibirContagemPalavras();

        System.out.println("\nRemover 'Palavra3'.");
        contagemPalavras.removerPalavra("Palavra3");

        System.out.println("\nExibir contagem de palavras:");
        contagemPalavras.exibirContagemPalavras();

        System.out.println("\nEncontrar palavra mais frequente:");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }

}
