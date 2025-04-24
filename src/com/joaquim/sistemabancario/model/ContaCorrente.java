package com.joaquim.sistemabancario.model;

public class ContaCorrente extends Conta{

    public ContaCorrente(Usuario usuario){
        super(usuario);
        this.limite = 400.0;
    }

    @Override
    public void definirLimite(double limite){
        this.limite = limite;
        System.out.println("Novo limite definido com sucesso: R$" + this.limite);
    }

    @Override
    public boolean sacar(double valor){
        if (valor > this.saldo || valor > this.limite) {
            System.out.println("Saque não aprovado. Tentativa de saque maior que saldo ou limite.");
            return false;
        }
        this.setSaldo(this.saldo -= valor);
        System.out.println("Saque na conta corrente liberado com sucesso no valor de: " + valor);
        return true;
    }

    @Override
    public void pagarAnualidade(){
        this.setSaldo(this.saldo - 120);
        System.out.println("Anualidade de conta corrente paga no valor de: R$120.00");
    }

    @Override
    public void renderJuros(){
        System.out.println("Erro. Conta corrente não gera juros.");
    }

    public double getLimite() {
        return limite;
    }

}

