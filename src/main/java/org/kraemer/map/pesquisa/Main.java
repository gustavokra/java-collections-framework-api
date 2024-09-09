package org.kraemer.map.pesquisa;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1131231l, "Lapis", 10, BigDecimal.valueOf(3));
        estoqueProdutos.adicionarProduto(1123132131231l, "Caneta", 31, BigDecimal.valueOf(5));
        estoqueProdutos.adicionarProduto(231321321l, "Borracha", 8, BigDecimal.valueOf(3));

        estoqueProdutos.exibirProdutos();

        System.out.println("\nValor total estoque: ");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("\nObter produto mais caro: ");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("\nObter produto mais barato: ");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("\nObter produto maior valor total com quantidade: ");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
