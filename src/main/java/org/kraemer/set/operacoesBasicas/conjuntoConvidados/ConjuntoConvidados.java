package org.kraemer.set.operacoesBasicas.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }

    public boolean adicionarConvidado(String nome, Integer codigoConvite) {
        return convidados.add(new Convidado(nome, codigoConvite));
    }

    public boolean removerConvidadoPorConvite(Integer codigoConvite) {
        return convidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    public Integer contarConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

}
