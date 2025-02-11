package HGerenciamentoBiblioteca.dominio.Biblioteca;

public class LivroDigital extends Livro{
    private String formato;

    public LivroDigital(String titulo, String autor, int anoPublicacao, CategoriaLivro categoria, boolean disponivel, String formato) {
        super(titulo, autor, anoPublicacao, categoria, disponivel);
        this.formato = formato;
    }

    @Override
    public String getDescricao() {
        return "";
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
