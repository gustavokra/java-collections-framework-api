package org.kraemer.set.pesquisa.agendaContatos;

import java.util.Objects;

public class Contato {

    private String nome;
    private Integer numeroTelefone;

    public Contato(String nome, Integer numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }
}
