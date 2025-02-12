package HConcessionaria.dominio.concessionaria;

public enum TipoVeiculo {
    CARRO(1, "Carro"),
    MOTO(2, "Moto"),
    CAMINHAO(3, "Caminhão");
    final int valor;
    final String descricao;

    TipoVeiculo(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
