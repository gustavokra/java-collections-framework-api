package org.kraemer.set.operacoesBasicas.conjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Adicionando 4 convidados");
        conjuntoConvidados.adicionarConvidado("Junior", 1);
        conjuntoConvidados.adicionarConvidado("Pleno", 1);
        conjuntoConvidados.adicionarConvidado("Senior", 3);
        conjuntoConvidados.adicionarConvidado("TechLead", 4);

        System.out.println("Exibindo convidados:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("\nContando convidados:");
        System.out.println(conjuntoConvidados.contarConvidados());

        System.out.println("\nRemovendo canvidado Junior, convite número 1:");
        conjuntoConvidados.removerConvidadoPorConvite(1);
        conjuntoConvidados.exibirConvidados();

        System.out.println("\nContando convidados:");
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
