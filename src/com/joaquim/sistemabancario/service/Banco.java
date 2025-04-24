package com.joaquim.sistemabancario.service;

import com.joaquim.sistemabancario.model.*;
import com.joaquim.sistemabancario.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome = "Joca Bank";
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public Conta criarConta(Usuario usuario, String tipo){
        Conta novaConta = null;

        if(tipo.equalsIgnoreCase("cc")){
            novaConta = new ContaCorrente(usuario);
        } else if (tipo.equalsIgnoreCase("cp")){
            novaConta = new ContaPoupanca(usuario);
        } else {
            System.out.println("Tipo de conta inválida.");
        }

        if(novaConta != null){
            contas.add(novaConta);
            System.out.println("Conta criada com sucesso.");
        } else {
            System.out.println("Tipo de conta inválida.");
        }

        return novaConta;
    }

    public void listarContas(){
        for (Conta c : this.getContas()) {
            System.out.println("Número da conta: " + c.getNumConta() +
                    "\nTitular: " + c.getUsuario().getNome() +
                    "\nSaldo: R$" + c.getSaldo());
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }
}
