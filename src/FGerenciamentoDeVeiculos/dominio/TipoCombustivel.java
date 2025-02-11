package FGerenciamentoDeVeiculos.dominio;

public enum TipoCombustivel {
    GASOLINA(1, "GASOLINA") {
    },
    DIESEL(2, "DIESEL") {
    },
    ELETRICO(3, "ELETRICO") {
    },
    ALCOOL(4, "ALCOOL") {
    };
    private double valor;
    private String descricao;

    private TipoCombustivel(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
}
