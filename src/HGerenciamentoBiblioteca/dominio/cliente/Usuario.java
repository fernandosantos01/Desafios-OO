package HGerenciamentoBiblioteca.dominio.cliente;

import HGerenciamentoBiblioteca.dominio.Biblioteca.ItemBiblioteca;

import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void emprestarItem(ItemBiblioteca item){
        itensEmprestados.add(item);
    }
    public void devolverItem(ItemBiblioteca item){
        itensEmprestados.remove(item);
    }
    public void listarItensEmprestados(){
        for (ItemBiblioteca itemEmprestado : itensEmprestados){
            System.out.println("======ITENS-EMPRESTADOS========");
            System.out.println(itemEmprestado);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
