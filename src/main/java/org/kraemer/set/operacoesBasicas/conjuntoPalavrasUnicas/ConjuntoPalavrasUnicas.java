package org.kraemer.set.operacoesBasicas.conjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        conjuntoPalavrasUnicas = new HashSet<>();
    }

    public boolean adicionarPalavra(String palavra) {
        return conjuntoPalavrasUnicas.add(palavra);
    }

    public boolean removerPalavra(String palavraRemover) {
        Objects.requireNonNull(palavraRemover, "Palavra para remover não pode ser nula");
        return conjuntoPalavrasUnicas.removeIf(palavra -> palavra.equals(palavraRemover));
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicas);
    }

}
