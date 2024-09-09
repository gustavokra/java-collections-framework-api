package org.kraemer.set.pesquisa.agendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println("Adicionando contatos..");
        agendaContatos.adicionarContato("Leo", 13);
        agendaContatos.adicionarContato("Leo", 312);
        agendaContatos.adicionarContato("Lucas", 1314);
        agendaContatos.adicionarContato("Hullysses", 131231);

        System.out.println("\nExibindo contatos:");
        agendaContatos.exibirContatos();

        System.out.println("\nPesquisando por nome 'Leo'");
        System.out.println(agendaContatos.pesquisaPorNome("Leo").toString());

        System.out.println("\nAtualizar número do contato 'Leo' para '321':");
        System.out.println(agendaContatos.atualizarNumeroContato("Leo", 321));
    }
}
