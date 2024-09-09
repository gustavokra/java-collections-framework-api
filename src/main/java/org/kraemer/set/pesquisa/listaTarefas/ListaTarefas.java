package org.kraemer.set.pesquisa.listaTarefas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {

    private Set<Tarefa> conjuntoTarefas;

    private final String TAREFA_NAO_EXISTE = "Não existe uma tarefa com esse nome!";
    private final String TAREFA_NAO_ADD = "Não foi possível adicionar a tarefa!";

    public ListaTarefas() {
        conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        boolean tarefaAdicionada = conjuntoTarefas.add(new Tarefa(descricao));
        if(!tarefaAdicionada) {
            System.out.println(TAREFA_NAO_ADD + " " + descricao);
        }
    }

    public void removerTarefa(String descricao) {
        boolean tarefaRemovida = conjuntoTarefas.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
        if(!tarefaRemovida) {
            System.out.println(TAREFA_NAO_EXISTE);
        }
    }

    public void exibirTarefas() {
        System.out.println(conjuntoTarefas);
    }

    public void contarTarefas() {
        System.out.println(conjuntoTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return conjuntoTarefas.stream().filter(tarefa -> tarefa.isConcluido()).collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return conjuntoTarefas.stream().filter(tarefa -> !tarefa.isConcluido()).collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefa = conjuntoTarefas.stream().filter(tar -> tar.getDescricao().equalsIgnoreCase(descricao)).findFirst().orElse(null);
        if(Objects.isNull(tarefa)) {
            System.out.println(TAREFA_NAO_EXISTE);
        }
        tarefa.setConcluido(true);
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefa = conjuntoTarefas.stream().filter(tar -> tar.getDescricao().equalsIgnoreCase(descricao)).findFirst().orElse(null);
        if(Objects.isNull(tarefa)) {
            System.out.println(TAREFA_NAO_EXISTE);
        }
        tarefa.setConcluido(false);
    }

    public void limparListaTarefas() {
        conjuntoTarefas.clear();
    }

}
