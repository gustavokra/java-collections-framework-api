package org.kraemer.map.pesquisa.estoqueProdutos;

import java.math.BigDecimal;

public class Produto {

    String nome;
    Integer quantidade;
    BigDecimal preco;

    public Produto(String valor, Integer quantidade, BigDecimal preco) {
        this.nome = valor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "valor='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String valor) {
        this.nome = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
