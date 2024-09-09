package org.kraemer.list.Pesquisa.catalogoLivros;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public boolean adicionarLivro(String titulo, String autor, Integer anoPublicacao) {
        return livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        return livros.stream().filter(livro -> livro.getAutor().equalsIgnoreCase(autor)).collect(Collectors.toList());
    }

    public List<Livro> pesquisarPorIntervaloAnos(Integer anoInicial, Integer anoFinal) {
        return livros.stream().filter(livro -> livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal).collect(Collectors.toList());
    }

    public Livro pesquisarPorTitulo(String titulo) {
        return livros.stream().filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
    }


}
