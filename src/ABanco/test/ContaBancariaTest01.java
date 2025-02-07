package ABanco.test;

import ABanco.dominio.ContaEspecial;
import ABanco.dominio.ContaPoupanca;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        // Teste Conta Especial
        ContaEspecial contaEspecial = new ContaEspecial("Claudia", 1234, 100.0);
        System.out.println("=== Conta Especial ===");
        System.out.println(contaEspecial);
        contaEspecial.depositar(154.50);
        System.out.println("Saldo após depósito: R$" + contaEspecial.getSaldo());
        contaEspecial.sacar(155.0);
        System.out.println("Saldo após saque: R$" + contaEspecial.getSaldo());
        contaEspecial.sacar(200.0); // Teste de limite
        System.out.println("Saldo após saque: R$" + contaEspecial.getSaldo());

        // Teste Conta Poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca("João", 5678); // 5% de rendimento
        System.out.println("\n=== Conta Poupança ===");
        System.out.println(contaPoupanca);
        contaPoupanca.depositar(1000.0);
        System.out.println("Saldo após depósito: R$" + contaPoupanca.getSaldo());
        contaPoupanca.calcularNovoSaldo();
        System.out.println("Saldo após rendimento: R$" + contaPoupanca.getSaldo());
    }
}