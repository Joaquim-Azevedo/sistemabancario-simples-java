package com.joaquim.sistemabancario.model;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Extrato {
    private List<Transacao> transacoes;

    public Extrato(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public void imprimirExtrato() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("-- " + transacoes.getFirst().getUsuario().getNome() + " --");
        System.out.print("------ EXTRATO ------\n");
        for (Transacao transacao : transacoes) {
            System.out.print("Tipo: " + transacao.getTipo() + "\n");
            System.out.print("Data/Hora: " + transacao.getDataHora().format(dataFormatada) + "\n");
            System.out.print("Valor: R$ " + String.format("%.2f", transacao.getValor()) + "\n");
            System.out.print("---------------------\n");
        }
    }
}
