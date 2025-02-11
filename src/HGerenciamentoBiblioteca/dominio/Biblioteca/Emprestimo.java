package HGerenciamentoBiblioteca.dominio.Biblioteca;

import HGerenciamentoBiblioteca.dominio.cliente.Usuario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    ItemBiblioteca item;
    Usuario usuario;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;

    public Emprestimo(ItemBiblioteca item, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.item = item;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public double calcularMulta() {
        long diferencaEmDias = ChronoUnit.DAYS.between(dataDevolucao, dataEmprestimo);
        if (diferencaEmDias > 0) {
            System.out.print("O valor a ser pago de multa: ");
            return diferencaEmDias;
        }else {
            System.out.println("Item devolvido no prazo!!");
            return 0;
        }
        }

        public ItemBiblioteca getItem () {
            return item;
        }

        public void setItem (ItemBiblioteca item){
            this.item = item;
        }

        public Usuario getUsuario () {
            return usuario;
        }

        public void setUsuario (Usuario usuario){
            this.usuario = usuario;
        }

        public LocalDate getDataEmprestimo () {
            return dataEmprestimo;
        }

        public void setDataEmprestimo (LocalDate dataEmprestimo){
            this.dataEmprestimo = dataEmprestimo;
        }

        public LocalDate getDataDevolucao () {
            return dataDevolucao;
        }

        public void setDataDevolucao (LocalDate dataDevolucao){
            this.dataDevolucao = dataDevolucao;
        }
    }
