package com.joaquim.sistemabancario.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected Usuario usuario;
    protected double saldo;
    protected double limite;
    protected List<Transacao> transacoes;
    private Extrato extrato;

    public Conta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void imprimirExtrato(){
        this.extrato = new Extrato(this.transacoes);
        this.extrato.imprimirExtrato();
    }

    public boolean depositar(double valor){
        if(valor <= 0){return false;}
        this.setSaldo(this.saldo += valor);
        transacoes.add(new Transacao(this.usuario, "Depósito", valor));
        return true;
    }

    public abstract boolean sacar(double valor);

    public abstract void pagarAnualidade();

    public abstract void renderJuros();

    public abstract void definirLimite(double limite);

    public abstract String getTipoConta();

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
