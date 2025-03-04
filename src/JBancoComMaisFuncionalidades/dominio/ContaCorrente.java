package JBancoComMaisFuncionalidades.dominio;

import java.util.Random;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;
    private static final double TAXA_MANUTENCAO = 0.002;

    public ContaCorrente(String numeroConta, String titular, String senha) {
        super(numeroConta, titular, senha);
        Random random = new Random();
        this.limiteChequeEspecial = (random.nextInt(10) + 1) * 100;
    }

    @Override
    public boolean sacar(double valor, String senha) {
        if (this.limiteChequeEspecial + getSaldo() <= valor) {
            System.out.println("Erro: Saldo Insuficiente");
            return false;
        }
        if (super.sacar(valor, senha)) {
            aplicarTaxaMensal();
        }
        return true;
    }

    private void aplicarTaxaMensal() {
        ContaBancaria contaBancaria = null;
        double taxa = 0d;
        taxa = this.saldo * TAXA_MANUTENCAO;
        if (taxa >= 0){
            this.saldo -= taxa;
        }else {
            this.saldo += taxa;
        }
        super.getExtratoList().add(new Extrato("Taxa Mensal: R$-" + taxa));
    }

    public void exibirExtrato() {
        if (!super.getExtratoList().isEmpty()) {
            System.out.println("=======EXTRATO-CONTA-CORRENTE=======");
            for (Extrato e : super.getExtratoList()) {
                System.out.println(e);
            }
        } else {
            System.out.println("Nenhuma transação registrada.");
        }
    }
}
