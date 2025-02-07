package EBancoAlura.dominio;

import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {
    private double rendimento = 0.10;
    private double quantRendimentos = 0;

    public ContaPoupanca(String nomeDoTitular, LocalDateTime dataDeAbertura) {
        super(nomeDoTitular, dataDeAbertura, TipoConta.CONTA_POUPANCA);
    }

    @Override
    public void saca(double valor) {
        if (getSaldo() >= valor && valor > 0) {
            this.saldo -= valor;
            adicionarHistorico("Saque de R$" + valor);
            System.out.println("SAQUE DE " + valor + "R$ DA CONTA POUPANÇA EFETUADO COM SUCESSO!!!");
        } else {
            System.out.println("VALOR INVALIDO OU SALDO INSUFICIENTE");
        }
    }

    @Override
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor + (valor * this.rendimento);
            this.quantRendimentos += valor * this.rendimento;
            adicionarHistorico("Deposito de R$" + valor);
            System.out.println("DEPOSITO DE " + valor + "R$ NA CONTA POUPANÇA EFETUADO COM SUCESSO!!!");
        } else {
            System.out.println("VALOR INSIRIDO INVALIDO!!");
        }
    }

    public double getRendimento() {
        return rendimento;
    }

    public double getQuantRendimentos() {
        return quantRendimentos;
    }
}
