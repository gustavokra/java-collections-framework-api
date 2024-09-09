package org.kraemer.list.Ordenacao.OrdenacaoPessoas;

import java.math.BigDecimal;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Integer idade;
    private BigDecimal altura;

    public Pessoa(String nome, Integer idade, BigDecimal altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    public Integer getIdade() {
        return idade;
    }

    public BigDecimal getAltura() {
        return altura;
    }
}
