package HGerenciamentoBiblioteca.dominio.Biblioteca;

public interface ItemBiblioteca {
    String getTitulo();

    boolean isDisponivel();

    void emprestar();

    void devolver();
}
