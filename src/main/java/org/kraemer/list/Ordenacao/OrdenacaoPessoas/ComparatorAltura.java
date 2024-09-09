package org.kraemer.list.Ordenacao.OrdenacaoPessoas;

import java.util.Comparator;

public class ComparatorAltura implements Comparator<Pessoa> {

    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getAltura().compareTo(p2.getAltura());
    }

}
