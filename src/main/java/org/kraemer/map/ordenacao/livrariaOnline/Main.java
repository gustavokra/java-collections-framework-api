package org.kraemer.map.ordenacao.livrariaOnline;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("teste", "Clen Code", "Bob", BigDecimal.valueOf(80));
        livrariaOnline.adicionarLivro("teste2", "Arquitetura Limpa", "Bob", BigDecimal.valueOf(90));
        livrariaOnline.adicionarLivro("teste2", "Refactoring", "Martin", BigDecimal.valueOf(110));

        livrariaOnline.removerLivro("Arquitetura Limpa");
        System.out.println("Exibir livros ordenados por preço:");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        System.out.println("\nExbir livros por autor:");
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Bob"));

        System.out.println("\nObter livro mais caro:");
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println("\nObter livro mais barato:");
        System.out.println(livrariaOnline.obterLivroMaisBarato());
    }

}
