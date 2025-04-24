package com.joaquim.sistemabancario.model;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

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
        System.out.println("Saque liberado na conta de " + this.getUsuario().getNome() + " no valor de: R$" + valor);
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

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
