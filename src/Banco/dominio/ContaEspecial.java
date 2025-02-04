package Banco.dominio;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double limite) {
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo() + this.limite) {
            saldo -= valor;
            System.out.println("Saque no Valor de: " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor Invalido ou Sem Limite para a Transação");
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", numConta=" + getNumConta() +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }

    public double getLimite() {
        return limite;
    }
}
