package JBancoComMaisFuncionalidades.dominio;


public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_RENDIMENTO = 0.005;

    public ContaPoupanca(String numeroConta, String titular, String senha) {
        super(numeroConta, titular, senha);
    }

    @Override
    public boolean depositar(double valor) {
        if (super.depositar(valor)) {
            aplicarRendimentoMensal();
        }
        return true;
    }

    @Override
    public boolean sacar(double valor, String senha) {
        if(valor<=super.getSaldo()){
            return super.sacar(valor, senha);
        }else {
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }

    private void aplicarRendimentoMensal() {
        double rendimento = saldo * TAXA_RENDIMENTO;
        this.saldo += rendimento;
        super.getExtratoList().add(new Extrato("Rendimento: R$" + rendimento));
    }

    public void exibirExtrato() {
        if (!super.getExtratoList().isEmpty()) {
            System.out.println("EXTRATO-CONTA-POUPANÇA");
            for (Extrato e : super.getExtratoList()) {
                System.out.println(e);
            }
        }else {
            System.out.println("Nenhuma transação registrada.");
        }
    }

}
