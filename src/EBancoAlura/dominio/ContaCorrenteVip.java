package EBancoAlura.dominio;

import java.time.LocalDateTime;
import java.util.Random;

public class ContaCorrenteVip extends Conta {
    private final double TAXA_MANUTENCAO = 0.02;
    private double limite;
    private double valPagoEmTaxaManu = 0.0;

    public ContaCorrenteVip(String nomeDoTitular, LocalDateTime dataDeAbertura) {
        super(nomeDoTitular,dataDeAbertura,TipoConta.CONTA_CORRENTE_VIP);
        Random random = new Random();
        int valMinimo = 0;
        int valMaximo = 1000;
        int valAleatorio = random.nextInt((valMaximo - valMinimo) + 1) + valMinimo;
        this.limite = ((double) valAleatorio / 10) * 10;
        this.valPagoEmTaxaManu = valPagoEmTaxaManu;
    }

    @Override
    public void saca(double valor) {
        if (this.limite + getSaldo() >= valor && valor > 0) {
            this.saldo -= valor + (valor * this.TAXA_MANUTENCAO);
            this.valPagoEmTaxaManu = valor * this.TAXA_MANUTENCAO;
            adicionarHistorico("Saque de R$" + valor);
            System.out.println("SAQUE DE " + valor + "R$ NA CONTA CORRENTE VIP EFETUADO COM SUCESSO!!!");
        } else {
            System.out.println("VALOR INVALIDO OU SALDO INSUFICIENTE");
        }
    }

    @Override
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("DEPOSITO DE " + valor + "R$ NA CONTA CORRENTE VIP EFETUADO COM SUCESSO!!!");
            adicionarHistorico("Deposito de R$" + valor);
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

    public double getLimite() {
        return limite;
    }
}
