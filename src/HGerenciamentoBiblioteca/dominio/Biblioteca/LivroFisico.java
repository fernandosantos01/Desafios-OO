package HGerenciamentoBiblioteca.dominio.Biblioteca;

public class LivroFisico extends Livro {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int anoPublicacao, CategoriaLivro categoria, boolean disponivel, int numeroPaginas) {
        super(titulo, autor, anoPublicacao, categoria, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getDescricao() {
        return "======DESCRIÇÃO-DO-LIVRO=======" + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAno de Publicação: " + getAnoPublicacao() + "\nCategoria: " + getCategoria() + "\nNumero de Paginas: " + getNumeroPaginas();
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
