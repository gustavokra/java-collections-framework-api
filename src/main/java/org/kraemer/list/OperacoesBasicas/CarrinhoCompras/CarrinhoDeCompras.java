package org.kraemer.list.OperacoesBasicas.CarrinhoCompras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoDeCompras {

    private final String ATRIBUTO_NAO_ESPECIFICADO = " não especificado!";

    private List<Item> items;

    protected CarrinhoDeCompras() {
        items = new ArrayList<>();
    }

    public boolean adicionarItem(String nome, BigDecimal preco, Integer quantidade) {
        if(preco == null) {
            System.out.println("Preço" + ATRIBUTO_NAO_ESPECIFICADO);
            return false;
        }

        if(quantidade == null) {
            System.out.println("Quantidade" + ATRIBUTO_NAO_ESPECIFICADO);
        }

        Item itemAdicionar = new Item(nome, preco, quantidade);
        return items.add(itemAdicionar);
    }

    public boolean removerItem(String nome) {
        return items.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for(Item item : items) {
            valorTotal = valorTotal.add(item.getPreco().multiply(BigDecimal.valueOf(item.getQuantidade())));
        }
        return valorTotal;
    }

    public String exibirItens () {
        return items.stream().map(Item::toString).collect(Collectors.joining("\n"));
    }

}
