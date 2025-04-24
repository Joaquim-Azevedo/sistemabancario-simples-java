package com.joaquim.sistemabancario.model;


public abstract class Conta {
    protected int numConta;
    protected double saldo;
    protected Usuario usuario;
    protected double limite;

    public Conta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
    }

    public boolean sacar(double valor){
        if(valor < saldo){
            System.out.println("Não é possível sacar um valor maior que o saldo.");
            return false;
        }
        this.setSaldo(this.saldo -= valor);
        System.out.println("Saque liberado com sucesso no valor de: " + valor);
        return true;
    }

    public boolean depositar(double valor){
        if(valor <= 0){return false;}
        this.setSaldo(this.saldo += valor);
        System.out.println("Depósito liberado na conta de " + this.usuario.getNome() + " no valor de: R$" + valor);
        return true;
    }

    public abstract void pagarAnualidade();

    public abstract void renderJuros();

    public abstract void definirLimite(double limite);

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getNumConta() {
        return numConta;
    }

    protected void setNumConta(int numConta) {
        this.numConta = numConta;
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

}
