package org.kraemer.map.ordenacao.agendaEventos;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 28), "Cinema", "Filme");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 14), "Palestra", "Java");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 31), "Camping", "Estrelas");

        agendaEventos.exibirAgenda();

        System.out.println("\nObter próximo evento:");
        System.out.println(agendaEventos.obterProximoEvento());
    }

}
