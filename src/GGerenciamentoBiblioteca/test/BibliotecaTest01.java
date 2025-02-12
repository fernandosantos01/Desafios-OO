package GGerenciamentoBiblioteca.test;

import GGerenciamentoBiblioteca.dominio.Biblioteca.Biblioteca;
import GGerenciamentoBiblioteca.dominio.Biblioteca.CategoriaLivro;
import GGerenciamentoBiblioteca.dominio.Biblioteca.LivroDigital;
import GGerenciamentoBiblioteca.dominio.Biblioteca.LivroFisico;
import GGerenciamentoBiblioteca.dominio.cliente.Usuario;
import GGerenciamentoBiblioteca.dominio.exceptions.ItemIndisponivelException;
import GGerenciamentoBiblioteca.dominio.exceptions.UsuarioNaoCadastradoException;

public class BibliotecaTest01 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livro1 = new LivroFisico("Dom Casmurro", "Machado de Assis", 1899, CategoriaLivro.ROMANCE, true, 850);
        LivroDigital livro2 = new LivroDigital("1984", "George Orwell", 1949, CategoriaLivro.FICCAO, true, "PDF");
        LivroDigital livro3 = new LivroDigital("A Volta dos que não foram", "George Orwell", 1949, CategoriaLivro.FICCAO, true, "PDF");

        Usuario usuario1 = new Usuario("João Silva", "123.456.789-00");
        Usuario usuario2 = new Usuario("José Fernando", "357.965.874-08");

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(livro3);
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        try {
            biblioteca.realizarEmprestimo(usuario1, livro1);
            biblioteca.realizarEmprestimo(usuario1, livro2);
            biblioteca.realizarEmprestimo(usuario2,livro1);
        } catch (ItemIndisponivelException | UsuarioNaoCadastradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        biblioteca.listarItensDisponiveis();
        biblioteca.listarEmprestimosAtivos();
        usuario1.listarItensEmprestados();
    }
}
