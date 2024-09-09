package org.kraemer.set.pesquisa.agendaContatos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        conjuntoContatos = new HashSet<>();
    }

    public boolean adicionarContato(String nome, Integer numero) {
        return conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(conjuntoContatos);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        return conjuntoContatos.stream().filter(contato -> contato.getNome().startsWith(nome)).collect(Collectors.toSet());
    }

    public Contato atualizarNumeroContato(String nome, Integer novoNumero) {
        Contato contato = conjuntoContatos.stream().filter(cont -> cont.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
        if(contato != null) {
            contato.setNumeroTelefone(novoNumero);
            return contato;
        }
        return null;
    }
}
