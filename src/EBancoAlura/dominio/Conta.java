package EBancoAlura.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public abstract class Conta implements OperacoesBancarias {
    private String nomeDoTitular;
    private int numero;
    private String agencia;
    protected double saldo;
    private LocalDateTime dataDeAbertura;
    private TipoConta tipoConta;
    private List<String> historico;

    public Conta(String nomeDoTitular, LocalDateTime dataDeAbertura, TipoConta tipoConta) {
        this.nomeDoTitular = nomeDoTitular;
        Random random = new Random();
        this.numero = random.nextInt(9000) + 1000;
        this.agencia = "0001";
        this.dataDeAbertura = dataDeAbertura;
        this.tipoConta = tipoConta;
        this.historico = new ArrayList<>();
    }

    public void adicionarHistorico(String transacao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        historico.add(LocalDateTime.now().format(formatter) + " - " + transacao);
    }

    public void exibirHistorico() {
        System.out.println("HISTORICO TRANSAÇÕES");
        for (String transacao : this.historico) {
            System.out.println(transacao);
        }
    }

    public boolean transferencia(Conta destino, double valor) {
        if (valor <= 0 || this.saldo < valor) {
            System.out.println("Transferência inválida ou saldo insuficiente!");
            return false;
        }
        this.saldo -= valor;
        destino.saldo += valor;
        adicionarHistorico("Transferência de R$ " + valor + " para conta " + destino.numero);
        destino.adicionarHistorico("Recebimento de R$ " + valor + " da conta " + this.numero);
        System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + destino.getNomeDoTitular());
        return true;

    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "=============== CONTA BANCÁRIA ===============\n" +
                "Titular          : " + nomeDoTitular + "\n" +
                "Número da Conta  : " + numero + "\n" +
                "Agência         : " + agencia + "\n" +
                "Saldo           : R$ " + String.format("%.2f" + saldo) + "\n" +
                "Data de Abertura: " + dataDeAbertura.format(formatter) + "\n" +
                "==============================================";
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public LocalDateTime getDataDeAbertura() {
        return dataDeAbertura;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
