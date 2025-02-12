package HConcessionaria.dominio.concessionaria;

import HConcessionaria.dominio.cliente.Cliente;
import HConcessionaria.dominio.exceptions.ClienteNaoCadastradoException;
import HConcessionaria.dominio.exceptions.EstoqueInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    List<Veiculo> estoque = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Venda> vendas = new ArrayList<>();

    public Concessionaria() {
        this.estoque = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        estoque.add(veiculo);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarVenda(Cliente cliente, Vendavel item) {
        if (!clientes.contains(cliente)) {
            throw new ClienteNaoCadastradoException("Cliente Não Encontrado");
        }
        if (!estoque.contains(item)) {
            throw new EstoqueInsuficienteException("Item indisponivel");
        }
        cliente.comprarItem(item);
        Venda venda = new Venda(cliente, item);
        vendas.add(venda);
    }

    public void listarEstoque() {
        System.out.println("=====VEICULOS-DISPONIVEIS=======");
        if (estoque.isEmpty()) {
            System.out.println("Nenhum Disponivel!");
            return;
        }
        for (Vendavel vendavel : estoque) {
            System.out.println(vendavel.getDescricao());
        }
        System.out.println("============================");
    }

    public void listarVendas() {
        System.out.println("======VENDAS-REALIZADAS=======");
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma Venda Realizada");
            return;
        }
        for (Venda venda : vendas) {
            System.out.println(venda.getItem().getDescricao());
        }
    }

    public double calcularTotalVendas() {
        System.out.println("=======TOTAL-VENDAS========");
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma Venda Realizada!");
            return 0.0;
        }
        double totalGasto = 0.0;
        for (Venda venda : vendas) {
            totalGasto += venda.getItem().getPreco();
        }
        return totalGasto;
    }

    public List<Veiculo> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Veiculo> estoque) {
        this.estoque = estoque;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
