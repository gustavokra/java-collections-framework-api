package org.kraemer.set.operacoesBasicas.conjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas =  new ConjuntoPalavrasUnicas();

        System.out.println("Adicionando palavras únicas");
        conjuntoPalavrasUnicas.adicionarPalavra("teste");
        conjuntoPalavrasUnicas.adicionarPalavra("teste 2");
        conjuntoPalavrasUnicas.adicionarPalavra("teste");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nRemovendo palavras únicas");
        conjuntoPalavrasUnicas.removerPalavra("teste");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("\nVerificando palavra única 'teste'");
        if(conjuntoPalavrasUnicas.verificarPalavra("teste")) {
            System.out.println("O conjunto possui a palavra 'teste'");
        } else {
            System.out.println("O conjunto não possui a palavra 'teste'");
        }

    }
}
