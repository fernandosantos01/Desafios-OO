package HGerenciamentoBiblioteca.dominio.Biblioteca;

public enum CategoriaLivro {
    ROMANCE(1, "ROMANCE"),
    FICCAO(2, "FICÇÃO"),
    TECNICO(3, "TECNICO"),
    BIOGRAFIA(4, "BIOGRAFIA"),
    INFANTIL(5, "INFANTIL");

    private int valor;
    private String descricao;

    CategoriaLivro(int valor, String descricao) {
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
