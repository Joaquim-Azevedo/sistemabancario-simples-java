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

        Conta mariaCP = meuBanco.criarConta(maria, "cp");

        Conta marcioCC = meuBanco.criarConta(marcio, "cc");

//        meuBanco.listarContas();

        meuBanco.procurarPorNumConta(1002);

    }
}
