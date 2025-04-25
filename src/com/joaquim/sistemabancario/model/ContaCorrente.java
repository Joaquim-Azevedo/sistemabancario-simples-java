package com.joaquim.sistemabancario.model;

public class ContaCorrente extends Conta{
    protected String tipoConta = "Conta Corrente";

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
        transacoes.add(new Transacao(this.usuario, "Saque", valor));
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

    @Override
    public String getTipoConta(){
        return tipoConta;
    }
}

