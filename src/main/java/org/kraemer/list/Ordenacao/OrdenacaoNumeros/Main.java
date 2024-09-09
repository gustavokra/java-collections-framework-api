package org.kraemer.list.Ordenacao.OrdenacaoNumeros;

public class Main {

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println("Lista de números:");
        ordenacaoNumeros.getNumeros().forEach(num -> System.out.println(num));

        System.out.println("\nOrdenar Ascendente:");
        ordenacaoNumeros.ordernarAscendente().forEach(num -> System.out.println(num));

        System.out.println("\nOrdenar Descendente:");
        ordenacaoNumeros.ordernarDescendente().forEach(num -> System.out.println(num));
    }

}
