package org.kraemer.set.ordenacao.cadastroProdutos;

import org.kraemer.list.Ordenacao.OrdenacaoPessoas.Pessoa;

import java.util.Comparator;

public class ComparatorPreco implements Comparator<Produto> {

    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
