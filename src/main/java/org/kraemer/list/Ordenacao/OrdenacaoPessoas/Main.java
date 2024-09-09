package org.kraemer.list.Ordenacao.OrdenacaoPessoas;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Gustavo", 21, BigDecimal.valueOf(1.8d));
        ordenacaoPessoas.adicionarPessoa("Leonardo", 18, BigDecimal.valueOf(1.9d));
        ordenacaoPessoas.adicionarPessoa("Sandro", 24, BigDecimal.valueOf(1.7d));

        System.out.println("Lista de pessoas: ");
        ordenacaoPessoas.getPessoas().forEach(pessoa -> System.out.println(pessoa.toString()));

        System.out.println("\nLista de pessoas ordenada por idade: ");
        ordenacaoPessoas.ordenarPorIdade().forEach(pessoa -> System.out.println(pessoa.toString()));

        System.out.println("\nLista de pessoas ordenada por altura: ");
        ordenacaoPessoas.ordernarPorAltura().forEach(pessoa -> System.out.println(pessoa.toString()));

    }
}
