package com.joaquim.sistemabancario.model;

import java.time.LocalDateTime;

public class Transacao {
    private Usuario usuario;
    private String tipo;
    private LocalDateTime dataHora;
    private double valor;

    public Transacao(Usuario usuario, String tipo, double valor){
        this.tipo = tipo;
        this.usuario = usuario;
        this.dataHora = LocalDateTime.now();
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getValor() {
        return valor;
    }
}
