package org.kraemer.set.pesquisa.listaTarefas;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}