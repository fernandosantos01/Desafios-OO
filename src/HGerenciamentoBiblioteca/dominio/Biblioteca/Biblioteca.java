package HGerenciamentoBiblioteca.dominio.Biblioteca;

import HGerenciamentoBiblioteca.dominio.cliente.Usuario;

import java.util.List;

public class Biblioteca {
    List<ItemBiblioteca> itemBibliotecas;
    List<Usuario> usuarios;
    List<Emprestimo> emprestimos;

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
        item.emprestar();
        usuario.emprestarItem(item);
    }

    public void realizarDevolucao(Usuario usuario, ItemBiblioteca item) {
        item.devolver();
        usuario.devolverItem(item);
    }

    public void listarItensDisponiveis() {
        for (ItemBiblioteca itemBiblioteca : itemBibliotecas) {
            if (itemBiblioteca.isDisponivel()) {
                System.out.println(itemBiblioteca);
            }
        }
    }

    public void listarEmprestimosAtivos() {
        for (ItemBiblioteca itemBiblioteca : itemBibliotecas) {
            if (!itemBiblioteca.isDisponivel()) {
                System.out.println(itemBiblioteca);
            }
        }
    }

}
