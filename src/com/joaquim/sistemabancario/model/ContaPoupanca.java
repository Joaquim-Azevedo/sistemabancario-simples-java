package com.joaquim.sistemabancario.model;

public class ContaPoupanca extends Conta{
    private double taxaJuros;
    private String tipoConta = "Conta Poupança";

    public ContaPoupanca(Usuario usuario){
        super(usuario);
        this.taxaJuros = 0.015;
        this.limite = 200;
    }

    @Override
    public void renderJuros(){
        this.setSaldo(this.saldo + (this.saldo * taxaJuros));
        System.out.println("Valor obtido através do rendimento: R$" + (this.saldo * taxaJuros) + ". Taxa do juros: 1,5% sobre saldo.");
    }

    @Override
    public boolean sacar(double valor){
        if(valor > this.saldo && valor > this.limite) {
            System.out.println("Saque não aprovado. Valor maior que o saldo ou limite.");
            return false;
        }
        this.setSaldo(this.saldo -= valor);
        transacoes.add(new Transacao(this.usuario, "Saque", valor));
        return true;
    }

    @Override
    public void pagarAnualidade(){
        this.setSaldo(this.saldo - 100);
    }

    @Override
    public void definirLimite(double limite){
        this.limite = limite;
        System.out.println("Novo limite definido com sucesso: R$" + this.limite);
    }

    @Override
    public String getTipoConta(){
        return tipoConta;
    }

}
