package com.joaquim.sistemabancario.tests;

import com.joaquim.sistemabancario.model.*;
import com.joaquim.sistemabancario.model.Conta;
import com.joaquim.sistemabancario.service.Banco;

public class SistemaBancariotest01 {
    public static void main(String[] args) {
        Banco meuBanco = new Banco();

        Usuario joaquim = new Usuario("Joaquim Azevedo", "123.456.789-12");
        Usuario maria = new Usuario("Maria Clara", "123.123.123-12");
        Usuario marcio = new Usuario("Marcio Azevedo", "456.456.456-45");


        Conta joaquimCC = meuBanco.criarConta(joaquim, "cc");
        joaquimCC.depositar(500);
        joaquimCC.sacar(300);
        joaquimCC.sacar(600);
        joaquimCC.depositar(5000);
        joaquimCC.sacar(20);
        joaquimCC.sacar(20);
        joaquimCC.definirLimite(700);
        joaquimCC.sacar(700);

        Conta mariaCP = meuBanco.criarConta(maria, "cp");
        mariaCP.depositar(300);
        mariaCP.renderJuros();
        mariaCP.sacar(250);


        Conta marcioCC = meuBanco.criarConta(marcio, "cc");
        marcioCC.depositar(1000);
        marcioCC.sacar(300);
        marcioCC.pagarAnualidade();

        joaquimCC.imprimirExtrato();
        mariaCP.imprimirExtrato();

        meuBanco.listarContas();

    }
}
