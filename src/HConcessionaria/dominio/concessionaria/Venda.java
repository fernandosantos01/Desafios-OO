package HConcessionaria.dominio.concessionaria;

import HConcessionaria.dominio.cliente.Cliente;

import java.time.LocalDate;

public class Venda {
    Cliente cliente;
    Vendavel item;
    private LocalDate dataVenda;

    public Venda(Cliente cliente, Vendavel item) {
        this.cliente = cliente;
        this.item = item;
        this.dataVenda = LocalDate.now();
    }

    public String gerarNotaFiscal() {
        return "=====NOTA FISCAL======" + "\nNome: " + cliente.getNome() + "\nItem: " + item.getDescricao() + "\nData da Venda: " + this.dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendavel getItem() {
        return item;
    }

    public void setItem(Vendavel item) {
        this.item = item;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
}
