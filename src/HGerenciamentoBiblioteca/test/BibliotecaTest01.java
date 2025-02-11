package HGerenciamentoBiblioteca.test;

import HGerenciamentoBiblioteca.dominio.Biblioteca.Biblioteca;
import HGerenciamentoBiblioteca.dominio.Biblioteca.CategoriaLivro;
import HGerenciamentoBiblioteca.dominio.Biblioteca.LivroDigital;
import HGerenciamentoBiblioteca.dominio.Biblioteca.LivroFisico;
import HGerenciamentoBiblioteca.dominio.cliente.Usuario;

public class BibliotecaTest01 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livro1 = new LivroFisico("Dom Casmurro", "Machado de Assis", 1899, CategoriaLivro.ROMANCE, true, 850);
        LivroDigital livro2 = new LivroDigital("1984", "George Orwell", 1949, CategoriaLivro.FICCAO, true, "PDF");

        Usuario usuario1 = new Usuario("João Silva", "123.456.789-00");

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarUsuario(usuario1);

//        try {
//            biblioteca.realizarEmprestimo(usuario1, livro1);
//            biblioteca.realizarEmprestimo(usuario1, livro2);
//        } catch (ItemIndisponivelException | UsuarioNaoCadastradoException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

        biblioteca.listarItensDisponiveis();
        biblioteca.listarEmprestimosAtivos();
        usuario1.listarItensEmprestados();
    }
}
