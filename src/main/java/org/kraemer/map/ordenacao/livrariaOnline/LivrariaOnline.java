package org.kraemer.map.ordenacao.livrariaOnline;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LivrariaOnline {

    public Map<String, Livro> livraria;

    public LivrariaOnline() {
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, BigDecimal preco) {
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {

        if(!livraria.isEmpty()) {
            livraria.values().removeIf(livro -> livro.getAutor().equalsIgnoreCase(titulo));
        }

    }

    public void exibirLivrosOrdenadosPorPreco() {
        System.out.println(livraria.values().stream()
                .sorted(((l1, l2) -> l1.getPreco().compareTo(l2.getPreco())))
                .toList());
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        return livraria.values().stream().
                filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .sorted((l1, l2) -> l1.getAutor().compareTo(l2.getAutor())).toList();
    }

    public Livro obterLivroMaisCaro() {
        return livraria.values().stream()
                .max((l1, l2) -> l1.getPreco().compareTo(l2.getPreco())).orElseThrow();
    }

    public Livro obterLivroMaisBarato() {
        return livraria.values().stream()
                .min((l1, l2) -> l1.getPreco().compareTo(l2.getPreco())).orElseThrow();
    }

}
