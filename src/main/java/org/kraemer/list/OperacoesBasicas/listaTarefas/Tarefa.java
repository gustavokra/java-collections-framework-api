package org.kraemer.list.OperacoesBasicas.listaTarefas;

public class Tarefa {
    private String descricao;

    protected Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
