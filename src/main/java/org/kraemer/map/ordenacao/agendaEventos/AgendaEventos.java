package org.kraemer.map.ordenacao.agendaEventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println(new TreeMap(agenda));
    }

    public Evento obterProximoEvento() {
        Evento proximoEvento = agenda.entrySet().stream()
                .min((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(Map.Entry::getValue).orElse(null);

        return proximoEvento;
    }

}
