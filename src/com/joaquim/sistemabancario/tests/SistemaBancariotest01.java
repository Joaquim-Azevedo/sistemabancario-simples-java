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


        Conta conta1 = meuBanco.criarConta(joaquim, "cc");
        conta1.depositar(500);
        conta1.sacar(300);
        conta1.sacar(600);
        conta1.definirLimite(50);

        Conta conta2 = meuBanco.criarConta(maria, "cp");
        conta2.depositar(300);
        conta2.renderJuros();
        conta2.sacar(250);


        Conta conta3 = meuBanco.criarConta(marcio, "cc");
        conta3.depositar(1000);
        conta3.sacar(300);

        meuBanco.listarContas();
    }
}
