package org.kraemer.map.pesquisa;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Integer quantidade, BigDecimal preco) {
        Produto novoProduto = new Produto(nome, quantidade, preco);
        estoque.put(cod, novoProduto);
    }

    public void exibirProdutos() {
        System.out.println("Exibir produtos: ");
        for (Map.Entry<Long, Produto> entry : estoque.entrySet()) {
            System.out.println("Cod: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public BigDecimal calcularValorTotalEstoque() {
        return estoque.values()
                .stream().map(produto -> produto.getPreco().multiply(BigDecimal.valueOf(produto.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Produto obterProdutoMaisCaro() {
        Optional<Produto> produtoMaisCaro = estoque.values().stream()
                .max((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        return produtoMaisCaro.orElse(null);
    }

    public Produto obterProdutoMaisBarato() {
        Optional<Produto> produtoMaisBarato = estoque.values().stream()
                .min((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        return produtoMaisBarato.orElse(null);
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Optional<Produto> produtoMaiorValorTotal = estoque.values().stream()
                .max((p1, p2) -> (
                        p1.getPreco().multiply(BigDecimal.valueOf(p1.getQuantidade()))
                                .compareTo(
                                        p2.getPreco().multiply(BigDecimal.valueOf(p2.getQuantidade()))
                                )
                ));

        return produtoMaiorValorTotal.orElse(null);
    }
}













