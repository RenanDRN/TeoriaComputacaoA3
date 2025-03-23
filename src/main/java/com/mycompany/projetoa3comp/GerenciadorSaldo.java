package com.mycompany.projetoa3comp;

public class GerenciadorSaldo {
    private double saldo;

    public GerenciadorSaldo(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSaldoFormatado() {
        return String.format("%.2f", saldo);
    }
}
