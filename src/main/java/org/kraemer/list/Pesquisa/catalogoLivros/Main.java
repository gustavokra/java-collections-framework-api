package org.kraemer.list.Pesquisa.catalogoLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Clean Code", "Bob", 2008);
        catalogoLivros.adicionarLivro("Arquitetura Limpa", "Bob", 2017);
        catalogoLivros.adicionarLivro("The Pragmatic Programmer", "Andrew Hunt", 1999);
        catalogoLivros.adicionarLivro("Refactoring", "Fowler", 1999);

        System.out.println("Pesquisando por autor: Bob");
        catalogoLivros.pesquisarPorAutor("Bob").forEach(livro -> System.out.println(livro.toString()));

        System.out.println("\nPesquisando por título: Clean Code");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Clean Code").toString());

        System.out.println("\nPesquisando por anos: 2000 à 2024");
        catalogoLivros.pesquisarPorIntervaloAnos(2000, 2024).forEach(livro -> System.out.println(livro.toString()));
    }
}
