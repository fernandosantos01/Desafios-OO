package HGerenciamentoBiblioteca.dominio.Biblioteca;

public abstract class Livro implements ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    CategoriaLivro categoria;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, CategoriaLivro categoria, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.categoria = categoria;
        this.disponivel = disponivel;
    }

    public abstract String getDescricao();

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public boolean isDisponivel() {
        return this.disponivel;
    }

    @Override
    public void emprestar() {
        if (!disponivel) {
            System.out.println("Não é possivel emprestar o livro, pois está indisponivel");
        } else {
            this.disponivel = false;
        }
    }

    @Override
    public void devolver() {
        if (!disponivel) {
            this.disponivel = true;
        } else {
            System.out.println("Não é possivel fazer a devolução, pois você não fez o emprestimo desse livro!!");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
