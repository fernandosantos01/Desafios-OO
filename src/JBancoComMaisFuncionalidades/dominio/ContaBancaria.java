package JBancoComMaisFuncionalidades.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class ContaBancaria {
    private String numeroConta;
    private String titular;
    protected double saldo;
    private String senha;
    private List<Extrato> extratoList;

    public ContaBancaria(String numeroConta, String titular, String senha) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0d;
        this.senha = senha;
        this.extratoList = new ArrayList<>();
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            extratoList.add(new Extrato("Deposito: R$" + valor + " - " + LocalDate.now()));
            System.out.println("Deposito Realizado Com Sucesso!");
        } else {
            System.out.println("Valor Incorreto");
            return false;
        }
        return true;
    }

    public boolean sacar(double valor, String senha) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
            return false;
        }

        if (!autenticar(senha)) {
            return false;
        }

        this.saldo -= valor;
        extratoList.add(new Extrato("Saque: R$" + valor + " - " + LocalDate.now()));
        System.out.println("Saque realizado com sucesso.");
        return true;
    }

    public boolean transferir(ContaBancaria destino, double valor, String senha) {
        if (valor <= 0) {
            System.out.println("Erro: O valor da transferência deve ser maior que zero.");
            return false;
        }
        if (!autenticar(senha)) {
            return false;
        }
        if (this.saldo < valor) {
            System.out.println("Erro: Saldo insuficiente.");
            return false;
        }

        this.saldo -= valor;
        destino.saldo += valor;

        this.extratoList.add(new Extrato("Transferência enviada: -R$" + valor +
                " para conta " + destino.numeroConta + " - " + LocalDate.now()));

        destino.extratoList.add(new Extrato("Transferência recebida: +R$" + valor +
                " de conta " + this.numeroConta + " - " + LocalDate.now()));

        System.out.println("Transferência realizada com sucesso.");
        return true;
    }

    public void exibirExtrato() {
        if (!extratoList.isEmpty()) {
            for (Extrato e : extratoList) {
                System.out.println(e);
            }
        }
    }

    private boolean autenticar(String senha) {
        if (senha.equals(getSenha())) {
            return true;
        } else {
            System.out.println("Erro: Senha incorreta.");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return Objects.equals(getNumeroConta(), that.getNumeroConta());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumeroConta());
    }

    @Override
    public String toString() {
        return "=====Conta-Bancaria====" +
                "\nNumero da Conta = " + numeroConta +
                "\nTitular = " + titular +
                "\nSaldo = " + saldo+"\n";
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Extrato> getExtratoList() {
        return extratoList;
    }

    public String getSenha() {
        return senha;
    }
}