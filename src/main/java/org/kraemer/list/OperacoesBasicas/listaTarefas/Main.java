package org.kraemer.list.OperacoesBasicas.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricoesTarefas());

        System.out.println("\nRemovendo Tarefa1");
        listaTarefas.removerTarefa("Tarefa1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        System.out.println(listaTarefas.obterDescricoesTarefas());
    }
}