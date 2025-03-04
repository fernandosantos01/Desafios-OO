package IEscola.dominio;

public enum NivelEnsino {
    FUNDAMENTAL(1, "Fundamental"),
    MEDIO(2, "Medio"),
    SUPERIOR(3, "Superior");
    private final int valor;
    private final String descricao;

    NivelEnsino(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }
}
