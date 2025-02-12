package GGerenciamentoBiblioteca.dominio.Biblioteca;

import GGerenciamentoBiblioteca.dominio.cliente.Usuario;
import GGerenciamentoBiblioteca.dominio.exceptions.ItemIndisponivelException;
import GGerenciamentoBiblioteca.dominio.exceptions.UsuarioNaoCadastradoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<ItemBiblioteca> itemBibliotecas;
    List<Usuario> usuarios;
    List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.itemBibliotecas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        itemBibliotecas.add(item);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerItem(ItemBiblioteca item) {
        itemBibliotecas.remove(item);
    }

    public void realizarEmprestimo(Usuario usuario, ItemBiblioteca item) {
        if (!usuarios.contains(usuario)) {
            throw new UsuarioNaoCadastradoException("Usuario Não Encontrado.");
        }
        if (!item.isDisponivel()) {
            throw new ItemIndisponivelException("Item não está disponivel para emprestimo!");
        }
        Emprestimo emprestimo = new Emprestimo(item, usuario);
        emprestimos.add(emprestimo);
        usuario.emprestarItem(item);
        System.out.println("EMPRESTIMO REALIZADO COM SUCESSO!");
    }

    public void realizarDevolucao(Usuario usuario, ItemBiblioteca item) {
        if (!usuarios.contains(usuario)) {
            throw new UsuarioNaoCadastradoException("Usuario Não Encontrado.");
        }
        if (item.isDisponivel()) {
            throw new IllegalArgumentException("O item já está disponivel e não pode ser devolvido!");
        }
        Emprestimo emprestimo = null;
        for (Emprestimo e : emprestimos) {
            if (e.getItem().equals(item) && e.getUsuario().equals(usuario) && e.getDataDevolucao() == null) {
                emprestimo = e;
                break;
            }
            if (emprestimo != null) {
                emprestimo.setDataDevolucao(LocalDate.now());
                usuario.devolverItem(item);
                System.out.println("Devolução realizado com Sucesso!!");
            } else {
                throw new IllegalArgumentException("Emprestimo não encontrado");
            }
        }

    }

    public void listarItensDisponiveis() {
        System.out.println("=====ITENS-DISPONIVEIS=====");
        for (ItemBiblioteca itemBiblioteca : itemBibliotecas) {
            if (itemBiblioteca.isDisponivel()) {
                System.out.println(itemBiblioteca.getTitulo());
            }
        }
    }

    public void listarEmprestimosAtivos() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataDevolucao() == null) {
                System.out.println("=====EMPRESTIMOS-ATIVOS=======" + "\nTitulo: " + emprestimo.getItem().getTitulo() + "\nUsuario: " + emprestimo.getUsuario().getNome());
            }
        }
    }

}
