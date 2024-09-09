package org.kraemer.set.ordenacao.cadastroProdutos;

import java.util.*;

public class CadastroProdutos {

    private Set<Produto> conjuntoProdutos;

    public CadastroProdutos() {
        conjuntoProdutos = new HashSet<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, Integer quantidade) {
        conjuntoProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        System.out.println(new TreeSet<>(conjuntoProdutos));
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPreco());
        produtosPorPreco.addAll(conjuntoProdutos);
        System.out.println(produtosPorPreco);
    }

}
