package org.kraemer.set.operacoesBasicas.conjuntoConvidados;

import java.util.Objects;

public class Convidado {
    private String nome;
    private  Integer codigoConvite;

    public Convidado(String nome, Integer codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(Integer codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return Objects.equals(getCodigoConvite(), convidado.getCodigoConvite());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
