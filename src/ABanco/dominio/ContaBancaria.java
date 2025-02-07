package ABanco.dominio;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    public void sacar(double sacarDinheiro) {
        if ((this.saldo - sacarDinheiro) > 0) {
            this.saldo -= sacarDinheiro;
            System.out.println("Saque no Valor de: " + saldo + " realizado com sucesso!");
        } else {
            System.out.println("Saldo em conta insuficiente ou Valor Invalido");
        }
    }

    public void depositar(double depositarDinheiro) {
        if (depositarDinheiro > 0) {
            this.saldo += depositarDinheiro;
            System.out.println("Deposito no Valor de: " + saldo + " realizado com sucesso!");
        } else {
            System.out.println("Valor Invalido!!");
        }
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
