package HConcessionaria.dominio.cliente;

import HConcessionaria.dominio.concessionaria.Vendavel;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    List<Vendavel> compras = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new ArrayList<>();
    }

    public void comprarItem(Vendavel item) {
        compras.add(item);
    }

    public void listarCompras() {
        for (Vendavel compra : compras) {
            System.out.println(compra.getDescricao());
        }
    }

    public double calcularTotalGasto() {
        double valor = 0.0;
        for (Vendavel compra : compras) {
            valor += compra.getPreco();
        }
        return valor;
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

    public List<Vendavel> getCompras() {
        return compras;
    }

    public void setCompras(List<Vendavel> compras) {
        this.compras = compras;
    }
}
