package Banco.dominio;

public class ContaPoupanca extends ContaBancaria {
    private final double TAXA_RENDIMENTO = 0.5;

    public ContaPoupanca(String nomeCliente, int numConta) {
        super(nomeCliente, numConta);
    }

    public void calcularNovoSaldo() {
        saldo += saldo * TAXA_RENDIMENTO;
        System.out.println("Rendimento Mensal: " + saldo);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta=" + getNumConta() +
                ", saldo=" + saldo +
                ", taxaRendimento=" + TAXA_RENDIMENTO +
                '}';
    }

    public double getTAXARENDIMENTO() {
        return TAXA_RENDIMENTO;
    }
}
