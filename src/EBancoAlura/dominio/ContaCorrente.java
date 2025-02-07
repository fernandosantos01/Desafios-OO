package EBancoAlura.dominio;

import java.time.LocalDateTime;

public class ContaCorrente extends Conta {
    private final double TAXA_MANUTENCAO = 0.05;
    private double valPagoEmTaxaManu = 0.0;

    public ContaCorrente(String nomeDoTitular, LocalDateTime dataDeAbertura) {
        super(nomeDoTitular, dataDeAbertura, TipoConta.CONTA_CORRENTE);
    }

    @Override
    public void saca(double valor) {
        if (saldo >= valor && valor > 0) {
            this.saldo -= valor + (valor * this.TAXA_MANUTENCAO);
            this.valPagoEmTaxaManu = valor * this.TAXA_MANUTENCAO;
            adicionarHistorico("Saque no valor de R$" + valor);
            System.out.println("SAQUE DE " + valor + "R$ NA CONTA CORRENTE EFETUADO COM SUCESSO!!!");
        } else {
            System.out.println("VALOR INVALIDO OU SALDO INSUFICIENTE");
        }
    }

    @Override
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            adicionarHistorico("Deposito de R$" + valor);
            System.out.println("DEPOSITO DE " + valor + "R$ NA CONTA CORRENTE EFETUADO COM SUCESSO!!!");
        } else {
            System.out.println("VALOR INSIRIDO INVALIDO!!");
        }
    }

    public double getTAXA_MANUTENCAO() {
        return TAXA_MANUTENCAO;
    }

    public double getValPagoEmTaxaManu() {
        return valPagoEmTaxaManu;
    }
}
