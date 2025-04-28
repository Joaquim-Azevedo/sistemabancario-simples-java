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
            System.out.println("Conta criada com sucesso. Número da conta: " + novaConta.getNumConta());
        } else {
            System.out.println("Tipo de conta inválida.");
        }

        return novaConta;
    }

    public void procurarPorNumConta(int conta){
        for (Conta c : this.getContas()){
            if(c.getNumConta() == conta){
                System.out.println(c.toString());
                break;
            } else if (c.getNumConta() != conta){} else {
                System.out.println("Conta não encontrada ou não existente.");
            }
        }
    }

    public void listarContas(){
        for (Conta c : this.getContas()) {
            System.out.println("----- Conta -----");
            System.out.println("Número da conta: " + c.getNumConta());
            System.out.println("Tipo de conta: " + c.getTipoConta());
            System.out.println("Titular: " + c.getUsuario().getNome());
            System.out.println("Saldo: R$" + c.getSaldo());
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

}
