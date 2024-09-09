package org.kraemer.set.ordenacao.cadastroProdutos;

public class Main {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println("Adicionando produtos:");
        cadastroProdutos.adicionarProduto(1123132131l, "Caneca", 40.0, 1);
        cadastroProdutos.adicionarProduto(1123132131l, "Caneca2", 10.0, 2);
        cadastroProdutos.adicionarProduto(11231312313l, "Garrafa", 30.0, 3);
        cadastroProdutos.adicionarProduto(11231312314l, "Mochila", 300.0, 4);

        System.out.println("\nExibir produtos por nome:");
        cadastroProdutos.exibirProdutosPorNome();

        System.out.println("\nExibir produtos por preço:");
        cadastroProdutos.exibirProdutosPorPreco();
    }
}
