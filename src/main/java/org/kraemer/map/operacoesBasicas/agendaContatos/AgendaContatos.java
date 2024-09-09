package org.kraemer.map.operacoesBasicas.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato com nome " + nome + " e telefone " + telefone + " foi adicionado!");

    }

    public void removerContato(String nome) {
        Integer telefone = (Integer) contatos.remove(nome);
        System.out.println("Contato de nome " + nome + " e telefone " + telefone + "foi removido!");
    }

    public void exibirContatos() {
        System.out.println("Exibindo contatos:");
        contatos.forEach((nome, telefone) -> {
            System.out.println(nome + ":" + " " + telefone);
        });
    }

    public void pesquisarPorNome(String nome) {
        Integer telefone = (Integer) contatos.get(nome);
        System.out.println("O telefone de " + nome + " é: " + telefone);
    }

}
