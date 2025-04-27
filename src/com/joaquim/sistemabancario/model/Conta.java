package com.joaquim.sistemabancario.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected Usuario usuario;
    private static int proximoNumConta = 1000;
    private int numConta;
    protected double saldo;
    protected double limite;
    protected List<Transacao> transacoes;
    private Extrato extrato;

    public Conta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
        this.setNumConta();
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

    public int getNumConta() {
        return numConta;
    }

    private void setNumConta() {
        numConta = ++proximoNumConta;
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numConta=" + numConta +
                ", " + usuario.toString() +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
