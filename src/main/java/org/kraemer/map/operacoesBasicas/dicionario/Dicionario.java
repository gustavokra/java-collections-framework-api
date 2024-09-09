package org.kraemer.map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        dicionario = new TreeMap();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
        System.out.println("Adicionada a palavra: " + palavra + ", com a definiçao: " + definicao);
    }

    public void removerPalavra(String palavra) {
        dicionario.remove(palavra);
        System.out.println("A palavra " + palavra + " foi removida.");
    }

    public void exibirPalabras() {
        for(Map.Entry<String, String> entry : dicionario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        System.out.println("Pesquisando definição da palavra " + palavra + ". Definição: " + definicao);
    }

}
