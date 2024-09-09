package org.kraemer.list.OperacoesBasicas.CarrinhoCompras;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Mouse com fio", BigDecimal.TEN, 2);
        carrinhoDeCompras.adicionarItem("Teclado", BigDecimal.TEN, 1);
        carrinhoDeCompras.adicionarItem("Mousepad", BigDecimal.TEN, 2);
        System.out.println("Exibir itens.");
        System.out.println(carrinhoDeCompras.exibirItens());

        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("\nRemovendo item Mousepad.");
        carrinhoDeCompras.removerItem("Mousepad");
        System.out.println("Exibir itens.");
        System.out.println(carrinhoDeCompras.exibirItens());
        System.out.println("Valor total: " +  carrinhoDeCompras.calcularValorTotal());
    }
}
