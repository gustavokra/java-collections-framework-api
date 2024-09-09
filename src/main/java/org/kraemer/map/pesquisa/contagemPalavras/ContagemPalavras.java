package org.kraemer.map.pesquisa.contagemPalavras;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra,contagem);
    }

    public void removerPalavra(String palavra) {
        if(!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(palavras);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
        Optional<Map.Entry<String, Integer>> palavra = palavras.entrySet().stream()
                .max((p1, p2) -> p1.getValue().compareTo(p2.getValue()));

        return palavra.orElse(null);
    }

}
