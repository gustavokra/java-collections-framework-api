package org.kraemer.map.operacoesBasicas.agendaContatos;

public class Main {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gustavo", 991489290);
        agendaContatos.adicionarContato("Gustavo", 991489290);
        agendaContatos.adicionarContato("Leonardo", 99999999);
        agendaContatos.adicionarContato("Luciana", 99999999);

        agendaContatos.removerContato("Leonardo");

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("Gustavo");
    }

}
