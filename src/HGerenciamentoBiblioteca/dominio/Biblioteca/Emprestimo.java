package HGerenciamentoBiblioteca.dominio.Biblioteca;

import HGerenciamentoBiblioteca.dominio.cliente.Usuario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    ItemBiblioteca item;
    Usuario usuario;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    public Emprestimo(ItemBiblioteca item, Usuario usuario) {
        this.item = item;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;
    }

    public double calcularMulta() {
        if (dataDevolucao == null) {
            return 0.0;
        }
        long diasEmAtraso = ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);
        System.out.print("O valor a ser pago de multa: ");
        return diasEmAtraso;
    }

    public ItemBiblioteca getItem() {
        return item;
    }

    public void setItem(ItemBiblioteca item) {
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
