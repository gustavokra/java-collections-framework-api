package org.kraemer.list.OperacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {

    private List<Tarefa> tarefas;

    protected ListaTarefas() {
        tarefas = new ArrayList<>();
    }

    public boolean adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        return tarefas.add(novaTarefa);
    }

    public boolean removerTarefa(String descricao) {
        return tarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public Integer obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public String obterDescricoesTarefas() {
        return tarefas.stream().map(Tarefa::getDescricao).collect(Collectors.joining(", "));
    }

}
