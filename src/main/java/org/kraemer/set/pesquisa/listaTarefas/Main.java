package org.kraemer.set.pesquisa.listaTarefas;

public class Main {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Adicionar Tarefas:");
        listaTarefas.adicionarTarefa("Escrever requisitos da tela de login");
        listaTarefas.adicionarTarefa("Desenhar tela de login");
        listaTarefas.adicionarTarefa("Desenhar tela de login");
        listaTarefas.adicionarTarefa("Programar tela de login");
        listaTarefas.exibirTarefas();

        System.out.println("\nRemover tarefa 'Programar tela de login':");
        listaTarefas.removerTarefa("Programar tela de login");

        System.out.println("\nContar tarefas:");
        listaTarefas.contarTarefas();

        System.out.println("\nMarcando 'Escrever requisitos da tela de login' como concluída.");
        listaTarefas.marcarTarefaConcluida("Escrever requisitos da tela de login");

        System.out.println("\nObter tarefas concluídas:");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println("\nObter tarefas pendentes:");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println("\nMarcando 'Escrever requisitos da tela de login como pendente.'");
        listaTarefas.marcarTarefaPendente("Escrever requisitos da tela de login");

        System.out.println("\nObter tarefas pendentes:");
        System.out.println(listaTarefas.obterTarefasPendentes());


        System.out.println("\nLimpando lista de tarefas:");
        listaTarefas.exibirTarefas();

    }

}
