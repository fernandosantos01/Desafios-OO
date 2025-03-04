package JBancoComMaisFuncionalidades.dominio;

public class Extrato {
    private String descricao;

    public Extrato(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return " " + descricao+"\n";
    }

    public String getDescricao() {
        return descricao;
    }
}
