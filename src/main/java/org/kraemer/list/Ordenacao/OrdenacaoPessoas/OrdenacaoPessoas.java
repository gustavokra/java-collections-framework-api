package org.kraemer.list.Ordenacao.OrdenacaoPessoas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    private final String ERRO_LISTA_PESSOAS_VAZIA = "Lista de pessoas está vazia!";

    protected OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }

    public boolean adicionarPessoa(String nome, Integer idade, BigDecimal altura) {
        return pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        if(pessoas.isEmpty()) {
            throw new IllegalArgumentException(ERRO_LISTA_PESSOAS_VAZIA);
        }
        Collections.sort(pessoas);
        return pessoas;
    }

    public List<Pessoa> ordernarPorAltura() {
        if(pessoas.isEmpty()) {
            throw new IllegalArgumentException(ERRO_LISTA_PESSOAS_VAZIA);
        }
        Collections.sort(pessoas, new ComparatorAltura());
        return pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
