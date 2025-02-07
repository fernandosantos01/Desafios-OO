package EBancoAlura.dominio;

public enum TipoConta {
    CONTA_CORRENTE(1, "Conta Corrente"),
    CONTA_POUPANCA(2, "Conta Poupança"),
    CONTA_CORRENTE_VIP(3, "Conta Corrente VIP");

    private final int valor;
    private final String descricao;

    TipoConta(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

